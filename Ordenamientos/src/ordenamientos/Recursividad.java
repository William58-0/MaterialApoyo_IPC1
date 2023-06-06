/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientos;

import java.util.Arrays;

/**
 *
 * @author William
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo Recursividad
        // Escribe palabra 5 veces
        metodoRecursivo("palabra", 0, 5);
        
        // Potencia
        int potenciado = potencia(2,1,3,0); // 8
        System.out.println(potenciado);
        
        // Factorial
        int resultado = factorial(5); // 120
        System.out.println(resultado);
        
        // Invierte una palabra
        String invertida = invertirPalabra("palabra"); // arbalap
        System.out.println(invertida);

    }

    // metodo recursivo
    private static void metodoRecursivo(String palabra, int iteracion, int veces) {
        // condicion para saber si continua la recursividad
        if (iteracion < veces) {
            // se ejecuta la funcion
            System.out.println(palabra);
            // se suma la iteracion, de lo contrario se enciclaria,
            // el resto de parámetros sigue igual
            metodoRecursivo(palabra, iteracion + 1, veces);
        }
    }
    
    // Funcion recursiva
    public static int potencia(int numero, int resultado, int exponente, int iteraciones){
        if(iteraciones < exponente){
            // 2, 1, 3, 0
            // 2, 2, 3, 1
            // 2, 4, 3, 2
            // return 8
            return potencia(numero, numero * resultado, exponente, iteraciones+1);
        }else{
            return resultado;
        }
    }
    
    
    // función recursiva
    // Explicacion: http://puntocomnoesunlenguaje.blogspot.com/2012/04/recursividad-en-java.html
    public static int factorial(int numero) {
        // numero = 5
        if(numero == 0){
            return 1;
        }else{
            return factorial(numero - 1) * numero;
            // factorial(4) * 5
            // factorial(3) * 4           * 5
            // ...
            // (factorial 0) 1 * 1        * 2 * 3 * 4 * 5
        }
    }
    
    // función recursiva
    public static String invertirPalabra(String palabra) {
        // cuando la palabra original haya quedado recortada
        if (palabra.length() <= 1) {
            return palabra;
        } else {
            char primerCaracter = palabra.charAt(0);
            String restoPalabra = palabra.substring(1);
            return invertirPalabra(restoPalabra) + primerCaracter;
            // alabra + p
            // labra + a      + p
            // abra + l       + a + p
        }
    }

}
