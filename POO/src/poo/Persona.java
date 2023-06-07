/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author William
 */
public class Persona {

    String nombre;
    String apellido;
    int edad;
    String direccion;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void hablar() {
        System.out.println(this.nombre + " está hablando.");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo.");
    }

    public void trabajar() {
        System.out.println(this.nombre + " está trabajando.");
    }

    public void comer() {
        System.out.println(this.nombre + " está comiendo.");
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    /*
    public void mostrarDatos(String nombre, String apellido) {
        System.out.println(nombre + " " + apellido);
    }

    public void mostrarDatos(String nombre, String apellido, int edad) {
        System.out.println(nombre + " " + apellido + " edad: " + edad);
    }
    */

}
