/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;
import Entidades.Operacion;
import Servicios.OperacionService;

/**
 *
 * @author yamila
 */

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se l*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Operacion o = new Operacion();
        OperacionService s = new OperacionService(o);
        
        int operacion = 0;
        
        while (operacion != 7) {            
            System.out.println("------------> MENU <------------");
            System.out.println("   1. Crear Operación");
            System.out.println("   2. Sumar");
            System.out.println("   3. Retar");
            System.out.println("   4. Multiplicar");
            System.out.println("   5. Dividir");
            System.out.println("   6. Mostrar números");
            System.out.println("   7. Salir");
            System.out.println("-------------------------------");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.crearOperacion();
            }
            if(operacion == 2){
                System.out.println("Suma: " + s.sumar());
            }
            if(operacion == 3){
                System.out.println("Resta: " + s.resta());
            }
            if(operacion == 4){
                if(s.multiplicar() == 0){
                    System.out.println("Multiplicación: uno o más números son 0."
                            + " Usar valores distintos de 0.");
                }else{
                    System.out.println("Multiplicación: " + s.multiplicar());
                }
            }
            if(operacion == 5){
                if(s.dividir() == 0){
                    System.out.println("División: división por 0. Usar un denominador diferente de 0");
                }else{
                    System.out.println("División: " + s.dividir());
                }
            }
            if(operacion == 6){
                System.out.println(o);
            }
            if(operacion == 7){
                return;
            }
        }
    }
    
}
