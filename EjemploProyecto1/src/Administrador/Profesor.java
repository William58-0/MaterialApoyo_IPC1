/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

/**
 *
 * @author William
 */
public class Profesor {

    public String codigo;
    public String nombre;
    public String apellido;
    public String correo;
    public String contrasenia;
    public String genero;

    public Profesor(String codigo, String nombre, String apellido,
            String correo, String contrasenia, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.genero = genero;
    }

}
