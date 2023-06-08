/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import SegundoPaquete.Auto;
import SegundoPaquete.Propietario;

/**
 *
 * @author William
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // --------------------------------------------------------- VEHICULO
        Vehiculo vehiculo1 = new Vehiculo("default",
                "publico", "private",
                "protected");
        System.out.println(vehiculo1.atributoDefault);
        System.out.println(vehiculo1.atributoPublico);
        // private no accesible desde otra clase
        System.out.println(vehiculo1.atributoPrivate);
        System.out.println(vehiculo1.atributoProtected);

        // --------------------------------------------------------- AUTO
        Auto auto1 = new Auto("default",
                "publico", "private",
                "protected");
        
        // default no accesible desde otro paquete
        System.out.println(auto1.atributoDefault);
        System.out.println(auto1.atributoPublico);
        // private no accesible desde otra clase
        System.out.println(auto1.atributoPrivate);
        System.out.println(auto1.atributoProtected);
        
        // --------------------------------------------------------- PROPIETARIO
        Propietario prop = new Propietario("Juan", vehiculo1);
        
        // vehiculo tiene atributos no publicos
        System.out.println(prop.vehiculo);
        
        // se deben utilizar metodos para obtener esos valores
        System.out.println(prop.getVehiculo().atributoPublico);
        
        
    }

    public void metodo() {
        System.out.println("sin parametros");
    }

    public void metodo(int num1, int num2) {
        System.out.println("con parametros");
    }

}
