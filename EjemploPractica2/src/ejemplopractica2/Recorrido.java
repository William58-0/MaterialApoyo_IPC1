/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopractica2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author William
 */
public class Recorrido extends Thread {
    JLabel vehiculo;
    int distancia;
    boolean regreso;
    
    //VerRecorridos vr = new VerRecorridos();
    final int posDestino = VerRecorridos.DestinoLbl.getLocation().x;

    public Recorrido(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.regreso = false;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                // delay
                sleep(10 * distancia);
                
                // obtener la posicion del vehiculo en X
                int vehiculoPosX = vehiculo.getLocation().x;
                
                // si va de ida
                if(!regreso){
                    // si no ha llegado al destino
                    if(vehiculoPosX < posDestino - 100){
                        // avanzar el vehiculo
                        vehiculo.setLocation(vehiculoPosX + 10, vehiculo.getLocation().y);
                    }else{
                        regreso = true;
                    }
                }else{
                    // de regreso
                    // si no ha llegado al inicio
                    if(vehiculoPosX > 100){
                        // retroceder el vehiculo
                        vehiculo.setLocation(vehiculoPosX - 10, vehiculo.getLocation().y);
                    }else{
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    
    
}
