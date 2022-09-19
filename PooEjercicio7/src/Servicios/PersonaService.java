/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Persona;

/**
 *
 * @author yamila
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    private Persona p;

    public PersonaService(Persona p) {
        this.p = p;
    }
    
    public void crearPersona(){
        System.out.println("Ingresar nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingresar edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingresar el sexo (H-M-O)");
        char sexo = leer.next().toUpperCase().charAt(0);
        while(sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("Por favor indique H, M u O");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        p.setSexo(sexo);
        System.out.println("Ingresar el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingresar la altura");
        p.setAltura(leer.nextDouble());
    }
    
    public void imc(){
        if(calcularIMC() == -1){
            System.out.println("La persona está por debajo de su peso ideal");
        }
        if(calcularIMC() == 0){
            System.out.println("La persona está en su peso ideal");
        }
        if(calcularIMC() == 1){
            System.out.println("La persona está por encima de su peso ideal");
        }
        if(calcularIMC() == 2){
            System.out.println("Ocurrio un error");
        }
    }
    
    public int calcularIMC(){
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        
        if(imc < 20){
            return -1;
        }
        if(imc >= 20 && imc <= 25){
            return 0;
        }
        if(imc > 25){
            return 1;
        }
        return 2;
    }
    
    public boolean esMayorDeEdad(){
        if(p.getEdad() >= 18){
            return true;
        }
        return false;
    }
}
