from fastapi import FastAPI, HTTPException
import dotenv
import os
import json


def update(state:bool):
    with open("data.json", "w") as file:
        estado_actual = {}
        estado_actual["state"] = state
        file.write(json.dumps(estado_actual))

def get():
    with open("data.json", "r") as file:
        return json.loads(file.read())["state"]

# Load environment variables from the .env file
dotenv.load_dotenv()

app = FastAPI()

# Read the parameter from the .env file
CONTRA = os.getenv("CONTRA")

estado_actual = {"state": False}

# USO: url/set?valor=<bool>&password=<password>
# retorna que la operacion se hizo adecuadamente
@app.post("/set")
def set(valor: bool, password:str):
    if password != CONTRA:
        raise HTTPException(status_code=401, detail="Password incorrecta.")
    update(valor)

# USO: url/
# retorna estado actual
@app.get("/status")
def status():
    return get()