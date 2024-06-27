import json
import os

import ollama
import torch
from openai import OpenAI

import log

import document_reader as dr


def get_relevant_context(rewritten_input, embeddings, storage_content, top_k=7):
    if embeddings.nelement() == 0:  # Check if the tensor has any elements
        return []

    # Encode the rewritten input
    input_embedding = ollama.embeddings(
        model="mxbai-embed-large", prompt=rewritten_input
    )["embedding"]

    # Compute cosine similarity between the input and embeddings
    cos_scores = torch.cosine_similarity(
        torch.tensor(input_embedding).unsqueeze(0), embeddings
    )

    # Adjust top_k if it's greater than the number of available scores
    top_k = min(top_k, len(cos_scores))

    # Sort the scores and get the top-k indices
    top_indices = torch.topk(cos_scores, k=top_k)[1].tolist()

    # Get the corresponding context from the storage
    relevant_context = [storage_content[idx].strip() for idx in top_indices]

    return relevant_context


def rewrite_query(user_input_json, conversation_history, ollama_model):
    user_input = json.loads(user_input_json)["Query"]
    context = "\n".join(
        [f"{msg['role']}: {msg['content']}" for msg in conversation_history[-2:]]
    )
    prompt = f"""Rewrite the following query by incorporating relevant context from the conversation history.
    The rewritten query should:
    
    - Preserve the core intent and meaning of the original query
    - Expand and clarify the query to make it more specific and informative for retrieving relevant context
    - Avoid introducing new topics or queries that deviate from the original query
    - DONT EVER ANSWER the Original query, but instead focus on rephrasing and expanding it into a new query
    
    Return ONLY the rewritten query text, without any additional formatting or explanations.
    
    Conversation History:
    {context}
    
    Original query: [{user_input}]
    
    Rewritten query: 
    """
    response = client.chat.completions.create(
        model=ollama_model,
        messages=[{"role": "system", "content": prompt}],
        max_tokens=200,
        n=1,
        temperature=0.1,
    )
    rewritten_query = response.choices[0].message.content.strip()
    return json.dumps({"Rewritten Query": rewritten_query})


def ollama_chat(
    user_input,
    system_message,
    embeddings,
    storage_content,
    ollama_model,
    conversation_history,
):
    conversation_history.append({"role": "user", "content": user_input})

    if len(conversation_history) > 1:
        query_json = {"Query": user_input, "Rewritten Query": ""}
        rewritten_query_json = rewrite_query(
            json.dumps(query_json), conversation_history, ollama_model
        )
        rewritten_query_data = json.loads(rewritten_query_json)
        rewritten_query = rewritten_query_data["Rewritten Query"]
        log.print_pink("Original Query: " + user_input)
        log.print_pink("Rewritten Query: " + rewritten_query)
    else:
        rewritten_query = user_input

    relevant_context = get_relevant_context(
        rewritten_query, embeddings, storage_content
    )
    if relevant_context:
        context_str = "\n".join(relevant_context)
        log.print_yellow("Context Pulled from Documents: \n\n")
        log.print_green(context_str)
    else:
        log.print_cyan("No relevant context found.")

    user_input_with_context = user_input
    if relevant_context:
        user_input_with_context = user_input + "\n\nRelevant Context:\n" + context_str

    conversation_history[-1]["content"] = user_input_with_context

    messages = [{"role": "system", "content": system_message}, *conversation_history]

    response = client.chat.completions.create(
        model=ollama_model,
        messages=messages,
        max_tokens=2000,
    )

    conversation_history.append(
        {"role": "assistant", "content": response.choices[0].message.content}
    )

    return response.choices[0].message.content


model = "llama3"

# Configuration for the Ollama API client
log.print_green("Initializing Ollama API client...")
client = OpenAI(base_url="http://localhost:11434/v1", api_key="llama3")

# Load the storage content
log.print_green("Loading storage content...")

files = dr.list_files("code", "java")
log.print_green(f"Found {len(files)} files to load into the storage")
documents = dr.read_documents(files, dr.java_splitter)
dr.save_documents(documents, "storage.txt")

storage_content = []
if os.path.exists("storage.txt"):
    with open("storage.txt", "r", encoding="utf-8") as storage_file:
        storage_content = storage_file.readlines()

# Generate embeddings for the storage content using Ollama
log.print_green("Generating embeddings for the storage content...")
storage_embeddings = []
for content in storage_content:
    response = ollama.embeddings(model="mxbai-embed-large", prompt=content)
    storage_embeddings.append(response["embedding"])

# Convert to tensor and print embeddings
print("Converting embeddings to tensor...")
storage_embeddings_tensor = torch.tensor(storage_embeddings)
print("Embeddings for each line in the storage:")
print(storage_embeddings_tensor)

conversation_history = []
system_message = "You are a helpful assistant that is an expert at extracting the most useful information from a given text. Also bring in extra relevant infromation to the user query from outside the given context."

while True:
    user_input = input(log.YELLOW + "|>" + log.RESET_COLOR)
    if user_input.lower() == "quit":
        break

    response = ollama_chat(
        user_input,
        system_message,
        storage_embeddings_tensor,
        storage_content,
        model,
        conversation_history,
    )

    log.print_green("Response: \n\n")
    log.print_green(response)
