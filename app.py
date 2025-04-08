from fastapi import FastAPI, HTTPException
import dotenv
import os

# Load environment variables from the .env file
dotenv.load_dotenv()

app = FastAPI()

# Read the parameter from the .env file
CONTRA = os.getenv("CONTRA")

