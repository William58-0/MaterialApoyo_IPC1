from flask import Flask, jsonify, request
from flask_cors import CORS

from Clases.Usuario import Usuario
from Metodos.Inicial import *
from Metodos.Usuario import *
from Metodos.Administrador import *

usuarios = []
usuarioEnSesion = -1
peliculas = []

# tipo 1 para administrador
usuarios.append(Usuario('Usuario', 'Administrador', 'admin', 'admin', 1))

# tipo 2 para clientes
usuarios.append(Usuario('William', 'Borrayo', 'William58_0', '1234', 2))

app = Flask(__name__)
CORS(app)

@app.route('/', methods=['GET'])
def rutaInicial():
    return("Si funciona")

# ------------------------------------------------------------- INICIAL
@app.route('/registrarCliente', methods=['POST'])
def registrarCliente():
    respuesta = RegistrarUsuario(request.json, usuarios, 2)
    return respuesta

@app.route('/recuperarContrasenia', methods=['POST'])
def recuperarContrasenia():
    respuesta = RecuperarContrasenia(request.json, usuarios)
    return respuesta

@app.route('/iniciarSesion', methods=['POST'])
def iniciarSesion():
    respuesta = IniciarSesion(request.json, usuarios)
    global usuarioEnSesion
    
    usuarioEnSesion = respuesta['usuarioEnSesion']
    print(usuarioEnSesion)
    return respuesta
    
# ------------------------------------------------------------- USUARIOS
@app.route('/getUsuarioEnSesion', methods=['GET'])
def getUsuarioEnSesion():
    respuesta = GetUsuarioEnSesion(usuarios, usuarioEnSesion)
    return respuesta

@app.route('/modificarPerfil', methods=['POST'])
def modificarPerfil():
    global usuarios
    respuesta = ModificarPerfil(request.json, usuarios, usuarioEnSesion)
    usuarios = respuesta['data']
    return {'data':'OK', 'status': respuesta['status']}

# ------------------------------------------------------------- ADMINISTRADOR
@app.route('/cargarPeliculas', methods=['POST'])
def cargarPeliculas():
    respuesta = CargarPeliculas(request.json)
    return respuesta
    

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=3000, debug=True)
