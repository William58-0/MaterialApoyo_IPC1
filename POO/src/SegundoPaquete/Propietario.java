/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoPaquete;

import poo.Vehiculo;

/**
 *
 * @author William
 */
public class Propietario {
    String nombre;
    Vehiculo vehiculo;

    public Propietario(String nombre, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo(){
        // no puede acceder al protected porque no hereda de esa clase
        // y está en diferente paquete
        System.out.println(vehiculo.atributoProtected);
        return this.vehiculo;
    }
    
    
    
}
