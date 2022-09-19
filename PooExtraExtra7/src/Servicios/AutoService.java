/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class AutoService {
    
    Scanner leer = new Scanner(System.in);
    
    public Auto crearAuto(){
        
        Auto a = new Auto();
        
        System.out.println("NOMBRE DEL DEUÑO DEL VEHICULO: ");
        a.setDueño(leer.next());
        System.out.println("COLOR DEL VEHICULO: ");
        a.setColor(leer.next());
        System.out.println("MODELO DEL VEHICULO: ");
        a.setModelo(leer.nextInt());
        System.out.println("FECHA DE VENCIMIENTO DEL CARNET: ");
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Día: ");
        int dia = leer.nextInt();
        
        Date vencimiento = new Date(anio - 1900, mes - 1, dia);
        
        a.setVencimientoCarnet(vencimiento);
        
        return a;
    }
    
    public void cambioTitular(Auto a){
        
        System.out.println("NOMBRE DEL NUEVO TITULAR: ");
        a.setDueño(leer.next());
        System.out.println("FECHA DE VENCIMIENTO DEL CARNET: ");
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Día: ");
        int dia = leer.nextInt();
        
        Date vencimiento = new Date(anio - 1900, mes - 1, dia);
        
        a.setVencimientoCarnet(vencimiento);
    }
    
    public void trayectoRecorrido(Auto a){
        
        System.out.println("Distancia recorrida: ");
        a.setKm(a.getKm() + leer.nextInt());
        
    }
    
    public void serviceAuto(Auto a){
        
        int serv = a.getKm() / 10000;
        System.out.println("El vehiculo deberia tener " + serv + " Service realizados");
        System.out.println("El proximo Service es a los " + (((serv + 1) * 10000) - a.getKm()) + " Km");
    }
    
}
