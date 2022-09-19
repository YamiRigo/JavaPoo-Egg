/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;
import Entidades.Rectangulo;
import Serivcios.RectanguloService;

/**
 *
 * @author yamila
 */

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class Ejercicio4 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r = new Rectangulo();
        RectanguloService s = new RectanguloService(r);
        
        int operacion = 0;
        
        while (operacion != 6) {            
            System.out.println("------------> MENU <------------");
            System.out.println("   1. Crear Rectangulo");
            System.out.println("   2. Calcular Superficie");
            System.out.println("   3. Calcular Perimetro");
            System.out.println("   4. Dibujar");
            System.out.println("   5. Mostrar Rectangulo");
            System.out.println("   6. Salir");
            System.out.println("--------------------------------");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.crearRectangulo();
            }
            if(operacion == 2){
                System.out.println("Superficie: " + s.calcularSuperficie());
            }
            if(operacion == 3){
                System.out.println("Perimetro: " + s.calcularPerimetro());
            }
            if(operacion == 4){
                s.dibujar();
            }
            if(operacion == 5){
                System.out.println(r);
            }
            if(operacion == 6){
                return;
            }
        }
    }
    
}
