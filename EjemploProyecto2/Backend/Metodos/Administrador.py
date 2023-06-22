from Clases.Pelicula import Pelicula
from flask import Flask, jsonify, request

def CargarPeliculas(datos):
    peliculas = []
    texto = datos['texto']
    
    # separacion del texto en lineas
    lineas = texto.split("\n")
    
    cont = 0
    for linea in lineas:
        # para omitir linea de encabezado
        if(cont==0):
            cont+=1
            continue
        
        #dividir la linea en columnas
        columnas = linea.split(";")
        
        if(len(columnas) != 6):
            continue
        
        # crear nueva pelicula
        nuevaPelicula = Pelicula(columnas[0], columnas[1], columnas[2], columnas[3], columnas[4], columnas[5])
        peliculas.append(nuevaPelicula.toJSON())
        
    return {'data': peliculas, 'status': 200}





 

    
        

    