/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class TrianguloService {
    
    Scanner leer = new Scanner(System.in);
    
    double perimetro = 0, perimetro1 = 0, area = 0, area1 = 0;
    
    public void crearTriangulo(Triangulo t){
        
        System.out.println("Ingrese el valor de los dos lados del triángulo 1");
        t.setLado(leer.nextDouble());
        System.out.println("Ingrese el valor de la base del triángulo 1");
        t.setBase(leer.nextDouble());
        System.out.println("");
        System.out.println("Ingrese el valor de los dos lados del triángulo 2");
        t.setLado1(leer.nextDouble());
        System.out.println("Ingrese el valor de la base del triángulo 2");
        t.setBase1(leer.nextDouble());
        
    }
    
    public double calcularPerimetro(Triangulo t){
        
        perimetro = 2 * t.getLado() + t.getBase();
        System.out.println("El perimetro del 1º triángulo es: " + perimetro);
        System.out.println("");
        perimetro1 = 2 * t.getLado1() + t.getBase1();
        System.out.println("El perimetro del 2º triángulo es: " +  perimetro1);
        
        System.out.println("");
        
        return perimetro + perimetro1;

    }
        
    
    public double calcularArea(Triangulo t){
        
        area = (t.getBase() * Math.sqrt((t.getLado() * t.getLado()) - ((t.getBase() * t.getBase()) / 4))) / 2;
        System.out.println("El area del 1º triángulo es: " + area);
        System.out.println("");
        area1 = (t.getBase1() * Math.sqrt((t.getLado1() * t.getLado1()) - ((t.getBase1() * t.getBase1()) / 4))) / 2;
        System.out.println("El area del 2º triángulo es: " + area1);
        
        System.out.println("");
        
        return area + area1;
    }
    
    public boolean areaMayor(){
        
        boolean mayor = false;
        
        if(area > area1){
            System.out.println("El 1º triángulo tiene una mayor area de superficie");
            mayor = true;
        }else{
            System.out.println("El 2º triángulo tiene una mayor area de superficie");
        }
        return mayor;
    }
   
}
