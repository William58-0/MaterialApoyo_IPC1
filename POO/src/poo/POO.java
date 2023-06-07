/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author William
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Luis", "Gonzalez", 15, "casa");
        Persona persona2 = new Persona("Mario", "Hernandez", 20, "apartamento");
        
        persona1.comer();
        
        persona2.dormir();
        
        System.out.println(persona1.getNombreCompleto());
        
        
        /*
        persona1.mostrarDatos("hola", "hola");
        
        persona1.mostrarDatos("hola", "hola",16);
        */
        
        Auto autoobj = new Auto("rojo", "nombreCarro", 2001);
        System.out.println(autoobj.anio);
    }
    
    public void metodo(){
        System.out.println("sin parametros");
    }
    
    public void metodo(int num1, int num2){
        System.out.println("con parametros");
    }
    
}
