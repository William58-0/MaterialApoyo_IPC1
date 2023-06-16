/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopractica2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author William
 */
class Registro implements Serializable {

    int dato1;
    String dato2;

    public Registro(int dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

}

public class Serializar {

    public static void main(String[] args) {

        
        // serializar
        Registro[] registros = {
            new Registro(1, "uno"),
            new Registro(2, "dos")
        };
        
        try {
            FileOutputStream archivo = new FileOutputStream("./Respaldo.txt");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(registros);
            salida.close();
            archivo.close();
            System.out.println("Se ha respaldo su programa en: Respaldo.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        /*
        // deserializar
        Registro[] registros;
        try {
            FileInputStream archivo = new FileInputStream("./Respaldo.txt");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            registros =  (Registro[]) entrada.readObject();
            entrada.close();
            archivo.close();
            // mostrar registros cargados
            for (Registro registro : registros) {
                System.out.println(registro.dato1 + " " + registro.dato2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        */
        

    }

}
