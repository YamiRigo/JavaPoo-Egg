/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author yamila
 */
public class TiempoService {
    
    //Creo el obj de la clase Tiempo con verificación por cada atributo
    
    public Tiempo creaReloj(){
        Scanner leer = new Scanner(System.in);
        System.out.println("VAMOS A SIMULAR UN RELOJ");
        System.out.println("Dame la hora...");
        int hr = leer.nextInt();
        
        while (!(hr >= 0 && hr < 24)) {            
            System.out.println("No es una hora valida");
            hr = leer.nextInt();
        }
        
        System.out.println("Dame los minutos...");
        int min = leer.nextInt();
        while (!(min >= 0 && hr < 60)) {            
            System.out.println("Los minutos no cumplen el estandar");
            min = leer.nextInt();
        }
        
        System.out.println("Y ahora los segundos...");
        int seg = leer.nextInt();
        while (!(seg >= 0 && hr < 60)) {            
            System.out.println("Los segundos no son validos");
            seg = leer.nextInt();
        }
        return new Tiempo(hr, min, seg);
    }
    
    //Metodo para mostrar el tiempo
    private static void  imprimirHoraCompleta(Tiempo t){
        System.out.println(t.getHora() + " : " + t.getMinuto() + " : " + t.getSegundo() + "\n");
    }
    
    //Metodo que simula un reloj por consola
    public void reloj(Tiempo t) throws InterruptedException{
        
        do{
            TimeUnit.SECONDS.sleep(1);  //mando a dormir un segundo para que parezca un reloj
            t.setSegundo(t.getSegundo() + 1);
            if(t.getSegundo() > 59){
                t.setMinuto(t.getMinuto() + 1);
                t.setSegundo(0);
                
                if(t.getMinuto() > 59){
                    t.setHora(t.getHora() + 1);
                    t.setMinuto(0);
                    
                    if(t.getHora() > 23){
                        t.setHora(0);
                    }
                }
            }
            imprimirHoraCompleta(t);
        }while(t.getHora() < 24);
        
    }
}
