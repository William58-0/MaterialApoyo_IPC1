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
public class Ordenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloPrueba = {5, 3, 4, 8, 2, 9, 7, 1, 6, 0};

        System.out.println("Arreglo sin ordenar");
        System.out.println(Arrays.toString(arregloPrueba));

        //ordenamientos
        //burbuja(arregloPrueba);
        //insercion(arregloPrueba);
        seleccion(arregloPrueba);

        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arregloPrueba));

    }

    // Ordenamiento de burbuja
    // Explicacion: https://www.youtube.com/watch?v=P_xNb8nFgmA
    private static void burbuja(int[] arreglo) {
        // ciclo para realizar varias comprobaciones
        for (int comprobacion = 0; comprobacion < arreglo.length; comprobacion++) {
            System.out.println("Iniciando comprobacion");

            // ciclo para recorrer los elementos del arreglo
            for (int elementoArreglo = 0; elementoArreglo < arreglo.length - 1; elementoArreglo++) {
                int elementoActual = arreglo[elementoArreglo];
                int elementoSiguiente = arreglo[elementoArreglo + 1];

                // si el actual es mayor al siguiente
                if (elementoActual > elementoSiguiente) {
                    // Se hace el intercambio
                    arreglo[elementoArreglo] = elementoSiguiente;
                    arreglo[elementoArreglo + 1] = elementoActual;
                    
                }
            }
        }
    }

    // Ordenamiento por inserción
    // Explicacion: https://www.youtube.com/watch?v=Dv1YSU7iaJM
    private static void insercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int elementoActual = arreglo[i]; // elemento amarillo
            int indiceAux = i; // posicion inicial del elemento amarillo

            /* mientras el elemento izquierdo sea mayor al elemento derecho,
            el elemento izquierdo pasará a tomar la posición del elemento derecho*/
            while (indiceAux > 0 && arreglo[indiceAux - 1] > elementoActual) {
                // min 3:03
                // 3,4,5,1,2
                // elementoActual = 1
                // indiceAux = 3

                arreglo[indiceAux] = arreglo[indiceAux - 1];
                indiceAux--;
                // 3,4,5,5,2
                // 1,3,4,5,2
            }

            // colocar al elemento analizado en la posicion correspondiente
            arreglo[indiceAux] = elementoActual;
        }
    }

    // Ordenamiento por seleccion
    // Explicacion: https://www.youtube.com/watch?v=fLgTh2TQYPk
    // 3,4,2,1,5
    private static void seleccion(int[] arreglo) {
        for (int i = 0; i< arreglo.length; i++){
            // se asume que en el indice i está el elemento menor
            int menor = i;
            // 3
            
            // se recorre el resto de elementos para saber si existe otro menor
            for (int j = i+1; j< arreglo.length; j++){
                // si encuentra otro menor asigna su indice 'j' a 'menor'.
                if(arreglo[j] < arreglo[menor]){
                    menor = j;
                    // 2
                    // 1
                }
            }
            // guardamos el valor original para no perder su valor en la sustitucion
            int aux = arreglo[i]; // aux = 3;
            // hacemos el cambio, se pasa el menor a la posicion que estamos analizando
            arreglo[i]= arreglo[menor];
            // 1,4,2,1,5
            /* el elemento de la posicion que analizamos (3), se pasa a la antigua posicion
               del numero menor */
            arreglo[menor]=aux;
            // 1,4,2,3,5
            // segunda iteracion: 4,2,3,5
        }
    }

    
}
