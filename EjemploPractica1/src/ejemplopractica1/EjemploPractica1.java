/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopractica1;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class EjemploPractica1 {

    /**
     * @param args the command line arguments
     */
    static String[] palabras;
    static int cantPalabras;
    static char[][] sopa;
    static int tamanioTablero;

    public static void main(String[] args) {
        boolean salirMenuPrincipal = false;
        Scanner sc = new Scanner(System.in);
        while (!salirMenuPrincipal) {
            System.out.println("---- Ejemplo Practica1 ----\n"
                    + "Ingrese una opcion\n"
                    + "1. Menu Palabras\n"
                    + "2. Jugar\n"
                    + "3. Reportes\n"
                    + "4. Salir\n");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                menuPalabras();
            } else if (opcion == 2) {
                jugar();
            } else if (opcion == 3) {
                //Arreglos();
            } else {
                salirMenuPrincipal = true;
            }
        }
    }

    public static void menuPalabras() {
        boolean salirMenuPalabras = false;
        Scanner sc = new Scanner(System.in);

        // ciclo para que se muestre el menu hasta que se decida salir
        while (!salirMenuPalabras) {
            System.out.println("---- Menu Palabras ----\n"
                    + "1. Insertar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "5. MostrarPalabras\n"
                    + "4. Volver\n");

            // se analiza la opcion seleccionada
            int opcion = sc.nextInt();
            if (opcion == 1) {
                // Insertar palabras
                System.out.println("Ingrese cantidad de palabras");
                cantPalabras = sc.nextInt();
                palabras = new String[cantPalabras];

                // ciclo para solicitar el ingreso de palabras 'cantPalabras' veces
                for (int i = 0; i < cantPalabras; i++) {
                    // se solicita la palabra mostrando su numeracion
                    System.out.print((i + 1) + ". ");
                    String nuevaPalabra = sc.next();

                    /* mientras la palabra no cumpla con la longitud deseada
                    se solicitará otra hasta que sí cumpla con la longitud */
                    while (nuevaPalabra.length() < 5 || nuevaPalabra.length() > 10) {
                        System.out.println("Tamaño no valido");
                        nuevaPalabra = sc.next();
                    }

                    /*cuando la palabra tenga longitud valida se asignará en
                    una posicion del arreglo de palabras*/
                    palabras[i] = nuevaPalabra;
                }

                break;

            } else if (opcion == 2) {
                // modificar palabras
                // se llama al método que muestra las palabras ingresadas
                mostrarPalabras();
                // se solicita el numero de palabra
                System.out.println("Ingrese el numero de palabra");
                int numPalabra = sc.nextInt();
                // convertir numero de palabra al indice en el arreglo
                numPalabra--;

                // se solicita ingresar la nueva palabra
                System.out.println("Ingrese la nueva palabra");
                String nuevaPalabra = sc.next();

                /* se ingresa la nueva palabra en la posicion(indice)
                seleccionada(numPalabra) */
                palabras[numPalabra] = nuevaPalabra;
            } else if (opcion == 3) {
                // eliminar palabras
                mostrarPalabras();
                System.out.println("Ingrese el numero de palabra");
                int numPalabra = sc.nextInt();
                // convertir numero de palabra al indice
                numPalabra--;
                /* cambiar posiciones, se corren para ocupar 
                   el espacio de la palabra eliminada */
                for (int i = numPalabra; i < cantPalabras - 1; i++) {
                    palabras[i] = palabras[i + 1];
                }
                // se reduce en 1 la cantidad de palabras
                cantPalabras--;
                break;
            } else if (opcion == 5) {
                mostrarPalabras();
            } else {
                salirMenuPalabras = false;
                break;
            }
        }
    }

    public static void mostrarPalabras() {
        for (int i = 0; i < cantPalabras; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    public static void jugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();

        System.out.println("Ingrese tamaño cuadrado de tablero");
        tamanioTablero = sc.nextInt();

        // posiciones de palabras en el tablero
        int posX[] = new int[tamanioTablero];
        int posY[] = new int[tamanioTablero];

        sopa = new char[tamanioTablero][tamanioTablero];
        // llenar matriz
        for (int fila = 0; fila < tamanioTablero; fila++) {
            for (int columna = 0; columna < tamanioTablero; columna++) {
                // https://coding101.home.blog/2019/11/07/generar-letras-aleatorias-en-java/
                sopa[fila][columna] = (char) (int) Math.floor(Math.random() * (122 - 97) + 97);
            }
        }

        // ingresar palabras al tablero
        // ------------------------ HORIZONTALES
        // recorrer palabras
        for (int contPalabra = 0; contPalabra < cantPalabras; contPalabra++) {
            posX[contPalabra] = (int) Math.floor(Math.random() * (tamanioTablero - 1));
            posY[contPalabra] = (int) Math.floor(Math.random() * (tamanioTablero - 1));

            // validar que la palabra no salga del tablero
            while (posX[contPalabra] > tamanioTablero - palabras[contPalabra].length()) {
                posX[contPalabra] = (int) Math.floor(Math.random() * (tamanioTablero - 1));
            }

            // ingresar caracteres de la palabra al tablero
            int inicialX = posX[contPalabra];
            for (int letra = 0; letra < palabras[contPalabra].length(); letra++) {
                sopa[3][2 + 1] = palabras[contPalabra].charAt(1);
            }

        }

        boolean jugando = true;
        int puntos = 0;
        int intentos = 3;
        // 3-intentos = numero de fallos

        while (jugando) {
            imprimirSopa();
            System.out.println("Ingresa una palabra");
            String palabraIngresada = sc.next();
            boolean encontrado = false;
            // buscamos si existe la palabra
            for (int i = 0; i < cantPalabras / 2; i++) {
                // si la encuentra
                if (palabraIngresada.equals(palabras[i])) {
                    // sume puntos
                    puntos += palabras[i].length();

                    encontrado = true;
                    // tachar palabra en el tablero
                    int posicionX = posX[i];

                    for (int letra = 0; letra < palabras[i].length(); letra++) {
                        sopa[posY[i]][posicionX + letra] = '#';
                    }

                    break;
                }
            }
            // verticales
            /*
            for (int i = cantPalabras/2; i < cantPalabras; i++) {
            }
             */
            if (encontrado) {
                //guardarResultado();
            } else {
                // quita 5 puntos
                puntos -= 5;
                // resta un intento
                intentos--;
                if (intentos == 0) {
                    jugando = false;
                    //guardarResultado();
                    break;
                }
            }

        }

    }

    public static void imprimirSopa() {
        for (int fila = 0; fila < tamanioTablero; fila++) {
            for (int columna = 0; columna < tamanioTablero; columna++) {
                System.out.print(sopa[fila][columna] + " ");
            }
            System.out.print("\n");
        }
    }

}
