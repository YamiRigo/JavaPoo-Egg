/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cafetera;

/**
 *
 * @author yamila
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in);
    
    private Cafetera c;

    public CafeteraService(Cafetera c) {
        this.c = c;
    }
    
    public void llenarCafetera(){
        if(c.getCapacidadMaxima() == 0){
            System.out.println("Por favor especifique la cantidad maxima de la cafetera");
            c.setCapacidadMaxima(leer.nextInt());
        }
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada");
    }
    
    public void servirTaza(int taza){
        if(c.getCantidadActual() < taza){
            System.out.println("La taza no ha sido llenda, se sirvieron " + c.getCantidadActual() + " ml");
            c.setCantidadActual(0);
        }else{
            System.out.println("Su cafe está listo");
            c.setCantidadActual(c.getCantidadActual() - taza);
        }
    }
    
    public void vaciarCafetera(){
        c.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada");
    }
    
    public void agregarCafe(int cafe){
        if(c.getCapacidadMaxima() < (c.getCantidadActual() + cafe)){
            System.out.println("La cafetera se rebalso! A limpiar");
            c.setCantidadActual(c.getCapacidadMaxima());
        }else{
            c.setCantidadActual(c.getCantidadActual() + cafe);
            System.out.println("La cafetera dispone actualmente de " + c.getCantidadActual() + " ml");
        }
    }
}
