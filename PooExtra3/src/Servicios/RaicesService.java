/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class RaicesService {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaiz(){
        System.out.println("Ingresar el valor de a");
        double a = leer.nextInt();
        System.out.println("Ingresar el valor de b");
        double b = leer.nextInt();
        System.out.println("Ingresar el valor de c");
        double c = leer.nextInt();
        
        return new Raices(a,b,c);
    }
    
    //Metodo tieneRaices(): devuelve un boolaean indicando si tiene dos soluciones,
    //para que esto ocurra, el discriminante debe ser mayor o igual que 0;
    
    private static boolean tieneRaices(Raices r){
        if(r.getDiscriminante() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo tieneRaiz(): devuelve un boolean indicando si tiene una unica solución
    //para que esto ocurra, el discriminante debe ser igual a 0
    
    private static boolean tieneRaiz(Raices r){
        if(r.getDiscriminante() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo obtenerRaices(): llama a tieneRaices() y si devolvio true, imprime las
    //dos posibles soluciones
    
    private static void obtenerRaices(Raices r){
        // (-b±√((b^2)-(4*a*c)))/(2*a) 
        
        if(tieneRaices(r) == true){
            System.out.println("La ecuación tiene dos  soluciones");
            double res1 = (-r.getB() + Math.sqrt(r.getDiscriminante())) / 2 * r.getA();
            double res2 = (-r.getB() - Math.sqrt(r.getDiscriminante())) / 2 * r.getA();
            System.out.println("Primera solución: " + res1);
            System.out.println("Segunda solución: " + res2);
        }
    }
    
    //Metodo obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una unica raiz.
    //Es en el caso en que se tenga una unica solución posible
    
    private static void obtenerRaiz(Raices r){
        if(tieneRaiz(r) == true){
            System.out.println("La ecuación tiene una solución");
            double res1 = (-r.getB() + Math.sqrt(r.getDiscriminante())) / 2 * r.getA();
            System.out.println("Solución: " + res1);
        }
    }
    
    //Metodo Calcular(): esté método llamará tieneRaices() y a tieneRaiz(),
    //y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
    //con los métods obtenerRaices() u obtenerRaiz(), según lo que devuelva
    //nuestros métodos y en caso de no existir solución, se mostrará un mesaje
    
    public void calcular(Raices r){
        if(tieneRaices(r) == true){
            obtenerRaices(r);
        }else if(tieneRaiz(r) == true){
            obtenerRaiz(r);
        }else{
            System.out.println("La ecuación no tiene solución");
        }
    }
}
