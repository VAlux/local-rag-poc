from langchain_community.embeddings.fastembed import FastEmbedEmbeddings
from langchain_community.llms import Ollama
from langchain_community.vectorstores import Chroma
from langchain.chains.combine_documents import create_stuff_documents_chain
from langchain.chains import create_retrieval_chain
from langchain.prompts import PromptTemplate
import document_reader as dr
import log

# using only the exact methods from the HtmlBuildingDSL provide code capable of rendering a simple landing page about cats, wrap all strings into the text() method

embedding_storage_path = "embeddings"

llm = Ollama(model="llama3")
embedding = FastEmbedEmbeddings()
prompt_template = """
<s>[INST]
You are an expert in the HtmlBuildingDSL able to provide Java code capable of rendering any html page user requires. 
use ONLY the EXACT methods from the HtmlBuildingDSL class do not make up your own.
DO NOT provide additional information relevant to the user query from outside the given context.
[/INST]</s> 
[INST]
{input}
Context: {context}
Answer:
[/INST]
"""

system_prompt = PromptTemplate.from_template(prompt_template)

if __name__ == "__main__":
    files = dr.list_files("code", "java")
    documents = dr.read_documents(files, dr.java_splitter)
    print(f"Loaded {len(documents)} documents")

    vector_store = Chroma.from_documents(
        documents=documents,
        embedding=embedding,
        persist_directory=embedding_storage_path,
    )

    retriever = vector_store.as_retriever(
        search_type="similarity_score_threshold",
        search_kwargs={"k": 16, "score_threshold": 0.1},
    )

    document_chain = create_stuff_documents_chain(llm, system_prompt)
    chain = create_retrieval_chain(retriever, document_chain)

    while True:
        user_input = input(log.YELLOW + "|> " + log.RESET_COLOR)
        if user_input.lower() == "quit":
            break

        response = result = chain.invoke({"input": user_input})
        log.print_green("Response: \n\n")
        log.print_green(response.get("answer"))
