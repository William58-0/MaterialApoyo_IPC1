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
// extends para herencia
public class Auto extends Vehiculo {

    public Auto(String atributoDefault, String atributoPublico,
            String atributoPrivate, String atributoProtected) {
        super(atributoDefault, atributoPublico, atributoPrivate, atributoProtected);
    }
    
    public void mostrarInfo(){
        // default no accesible desde otro paquete
        System.out.println(this.atributoDefault);
        System.out.println(this.atributoPublico);
        // private no accesible desde otra clase
        System.out.println(this.atributoPrivate);
        // es accesible porque se relaciona con vehiculo con herencia
        System.out.println(this.atributoProtected);
    }
    
    

}
