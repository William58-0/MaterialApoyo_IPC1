import json

from Clases.Usuario import Usuario

def RegistrarUsuario(datos, usuarios, tipo):
    nombre = datos['nombre']
    apellido = datos['apellido']
    nombre_usuario = datos['nombre_usuario']
    contrasenia = datos['contrasenia']
    
    for usuario in usuarios:
        # si ya existe ese nombre de usuario
        if(usuario.nombre_usuario == nombre_usuario):
            return {'data':'', 'status': 400}
        
    # si no existe el usuario agregarlo al listado
    usuarios.append(Usuario(nombre, apellido, nombre_usuario, contrasenia, tipo))
    return {'data':'OK', 'status': 200}

def RecuperarContrasenia(datos, usuarios):
    nombre_usuario = datos['nombre_usuario']
    
    for usuario in usuarios:
        # buscar el usuario para retornar la contraseña
        if(usuario.nombre_usuario == nombre_usuario):
            return {'data':usuario.contrasenia, 'status': 200}
        
    # si no existe el usuario retornar un error
    return {'data':'F', 'status': 400}
 
def IniciarSesion(datos, usuarios):
    nombre_usuario = datos['nombre_usuario']
    contrasenia = datos['contrasenia']
    
    usuario = {}
    status = 400
    usuarioEnSesion = -1
    
    for i in range(len(usuarios)):
        usuario = usuarios[i]
        if(usuario.nombre_usuario == nombre_usuario and usuario.contrasenia == contrasenia):
            ##return json.dumps(usuario.__dict__)
            usuario = {
                'nombre': usuario.nombre,
                'apellido': usuario.apellido,
                'nombre_usuario': usuario.nombre_usuario,
                'contrasenia': usuario.contrasenia,
                'tipo': usuario.tipo
            }
            status = 200
            usuarioEnSesion = i
            break

    return {'data':usuario, 'status': status,  'usuarioEnSesion': usuarioEnSesion}   
    
        

    