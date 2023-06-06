/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class Clase1 {

    public static int variable = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salirMenu = false;
        Scanner sc = new Scanner(System.in);
        while (!salirMenu) {
            System.out.println("Ingrese una opcion\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Arreglos\n"
                    + "4. Salir\n");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println(sumar(5, 2));
            } else if (opcion == 2) {
                System.out.println("restar");
            } else if (opcion == 3) {
                Arreglos();
            } else {
                salirMenu = true;
            }
        }
    }

    public static int sumar(int operador1, int operador2) {
        return operador1 + operador2;
    }

    public static void subMenu() {
        boolean salirSubMenu = false;
        Scanner sc = new Scanner(System.in);
        while (!salirSubMenu) {
            System.out.println("submenu\n"
                    + "1. no hacer nada\n"
                    + "2. volver\n");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println(sumar(5, 2));
            } else if (opcion == 2) {
                salirSubMenu = true;
            }
        }
    }

    public static void Arreglos() {
        int[][] tablero = new int[5][5];

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                tablero[fila][columna]=fila+5;
            }
        }
        
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("\n");
        }
    }

}
