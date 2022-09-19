/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serivcios;

import java.util.Scanner;
import Entidades.Rectangulo;

/**
 *
 * @author yamila
 */
public class RectanguloService {
    
    Scanner leer = new Scanner(System.in);
    
    private Rectangulo r;

    public RectanguloService(Rectangulo r) {
        this.r = r;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingresar la altura del rectangulo");
        r.setAltura(leer.nextDouble());
        System.out.println("Ingresar la base del rectangulo");
        r.setBase(leer.nextDouble());
    }
    
    public double calcularSuperficie(){
        return r.getAltura() * r.getBase();
    }
    
    public double calcularPerimetro(){
        return r.getAltura() * 2 + r.getBase();
    }
    
    public void dibujar(){
        for (int i = 0; i < (int)r.getAltura(); i++) {
            for (int j = 0; j < (int)r.getBase(); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
