/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;
import Entidades.Circunferencia;
import Servicios.CicunferenciaService;

/**
 *
 * @author yamila
 */

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = PI ∗ (radio)2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ PI ∗ radio).*/

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Circunferencia c = new Circunferencia();
        CicunferenciaService s = new CicunferenciaService(c);
        
        int opcion = 0;
        
        while (opcion != 5) {            
            System.out.println("-----------> MENU <-----------");
            System.out.println("   1. Crear Cicunferencia");
            System.out.println("   2. Calcular Area");
            System.out.println("   3. Calcular Perimetro");
            System.out.println("   4. Mostrar Circunferencia");
            System.out.println("   5. Salir");
            System.out.println("------------------------------");
            
            opcion = leer.nextInt();
            
            if(opcion == 1){
                s.crearCircunferencia();
            }
            if(opcion == 2){
                System.out.println("Area: " + s.calcularArea());
            }
            if(opcion == 3){
                System.out.println("Perimetro: " + s.calcularPerimetro());
            }
            if(opcion == 4){
                System.out.println(c);
            }
            if(opcion == 5){
                return;
            }
        }
    }
    
}
