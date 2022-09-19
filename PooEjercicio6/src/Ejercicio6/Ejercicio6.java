/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;
import Entidades.Cafetera;
import Servicios.CafeteraService;

/**
 *
 * @author yamila
 */

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cafetera c = new Cafetera();
        CafeteraService s = new CafeteraService(c);
        
        int opcion = 0;
        
        while (opcion != 6) {            
            System.out.println("************ MENU ************");
            System.out.println("   1. Llenar Cafetera");
            System.out.println("   2. Servir Cafe");
            System.out.println("   3. Vaciar Cafetera");
            System.out.println("   4. Agregar Cafe");
            System.out.println("   5. Mostrar Cafetera");
            System.out.println("   6. Salir");
            System.out.println("******************************");
            
            opcion = leer.nextInt();
            
            if(opcion == 1){
                s.llenarCafetera();
            }
            if(opcion == 2){
                System.out.println("Cuántos ml de cafe desea servir?");
                s.servirTaza(leer.nextInt());
            }
            if(opcion == 3){
                s.vaciarCafetera();
            }
            if(opcion == 4){
                System.out.println("Cuánto cafe desea agregar?");
                s.agregarCafe(leer.nextInt());
            }
            if(opcion == 5){
                System.out.println(c);
            }
        }
    }
    
}
