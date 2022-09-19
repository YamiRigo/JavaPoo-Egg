/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Circunferencia;

/**
 *
 * @author yamila
 */
public class CicunferenciaService {
    
    private Circunferencia c;
    
    Scanner leer = new Scanner(System.in);
    
    public CicunferenciaService(Circunferencia c){
        this.c = c;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingresar el radio de la circunferencia");
        c.setRadio(leer.nextDouble());
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(c.getRadio(), 2);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * c.getRadio();
    }
}
