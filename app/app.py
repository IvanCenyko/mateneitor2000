from fastapi import FastAPI, HTTPException
import dotenv
import os

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
    estado_actual["state"] = valor
    return {"status": True}

# USO: url/
# retorna estado actual
@app.get("/status")
def status():
    return {"state": estado_actual["state"]}