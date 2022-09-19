/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Operacion;

/**
 *
 * @author yamila
 */
public class OperacionService {
    
    Scanner leer = new Scanner(System.in);
    
    private Operacion o;

    public OperacionService(Operacion o) {
        this.o = o;
    }
    
    public void crearOperacion(){
        System.out.println("Ingresar el 1º número");
        o.setNumero1(leer.nextDouble());
        System.out.println("Ingresar el 2º número");
        o.setNumero2(leer.nextDouble());
    }
    
    public double sumar(){
        return o.getNumero1() + o.getNumero2();
    }
    
    public double resta(){
        return o.getNumero1() - o.getNumero2();
    }
    
    public double multiplicar(){
        if(o.getNumero1() == 0 || o.getNumero2() == 0){
            return 0;
        }
        return o.getNumero1() * o.getNumero2();
    }
    
    public double dividir(){
        if(o.getNumero2() == 0){
            return 0;
        }
        return o.getNumero1() / o.getNumero2();
    }
}
