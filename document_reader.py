from langchain.text_splitter import RecursiveCharacterTextSplitter, Language

java_splitter = RecursiveCharacterTextSplitter.from_language(
    language=Language.JAVA, chunk_size=512, chunk_overlap=0
)


# list all files in a directory
def list_files(directory, ext):
    import os

    result_files = []
    for root, _, files in os.walk(directory):
        for file in files:
            if file.endswith(f".{ext}"):
                print(f"adding {os.path.join(root, file)}\n")
                result_files.append(os.path.join(root, file))

    return result_files


# convert all specified files to a list of embeddable documents
def read_documents(files, splitter):
    print(f"Reading {files} to documents ")
    code = []
    for file in files:
        with open(file, "r") as file:
            document = file.read()
            code.append(document)

    return splitter.create_documents(code)


# save documents to a file
def save_documents(documents, file):
    with open(file, "w") as file:
        for doc in documents:
            file.write(doc.page_content.replace("\n", "") + "\n\n")
