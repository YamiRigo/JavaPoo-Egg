/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class PuntosService {
    
    Scanner leer = new Scanner(System.in);
    
    private Puntos p;

    public PuntosService(Puntos p) {
        this.p = p;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese el 1º punto");
        p.setX1(leer.nextDouble());
        p.setY1(leer.nextDouble());
        System.out.println("Ingrese el 2º punto");
        p.setX2(leer.nextDouble());
        p.setY2(leer.nextDouble());
    }
    
    public double calcularDistancia(){
        System.out.println("Distancia que existe entre los puntos: ");
        return Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY2()), 2));
    }
    
}
