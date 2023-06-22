from Clases.Usuario import Usuario

def GetUsuarioEnSesion(usuarios, usuarioEnSesion):
    usuario = {}
    status = 400
    if(usuarioEnSesion != -1):
        usuario = usuarios[usuarioEnSesion]
        usuario = {
                'nombre': usuario.nombre,
                'apellido': usuario.apellido,
                'nombre_usuario': usuario.nombre_usuario,
                'contrasenia': usuario.contrasenia,
                'tipo': usuario.tipo
            }
        status = 200
        
    # si no existe el usuario retornar un error
    return {'data':usuario, 'status': status}

def ModificarPerfil(datos, usuarios, usuarioEnSesion):
    if(usuarioEnSesion != -1):
        usuario = Usuario(datos['nombre'], datos['apellido'], datos['nombre_usuario'],
                          datos['contrasenia'], datos['tipo'])

        usuarios[usuarioEnSesion] = usuario
        return {'data':usuarios, 'status': 200}
    return {'data':usuarios, 'status': 400}


 

    
        

    