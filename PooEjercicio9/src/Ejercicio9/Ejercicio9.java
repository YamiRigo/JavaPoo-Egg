/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Scanner;
import Entidades.Matematica;
import Servicios.MatematicaService;

/**
 *
 * @author yamila
 */

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Matematica m = new Matematica();
        MatematicaService s = new MatematicaService(m);
        
        int operacion = 0;
        
        while (operacion != 6) {            
            System.out.println("------------> MENU <------------");
            System.out.println("   1. Llenar números");
            System.out.println("   2. Mostrar mayor");
            System.out.println("   3. Calcular potencia");
            System.out.println("   4. Calcular raiz");
            System.out.println("   5. Mostrar números");
            System.out.println("   6. Salir");
            System.out.println("--------------------------------");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.llenarNumeros();
            }
            if(operacion == 2){
                System.out.println("El número mayor es: " + s.devolverMayor());
            }
            if(operacion == 3){
                System.out.println("La potencia es: " + s.calcularPotencia());
            }
            if(operacion == 4){
                System.out.println("La raiz es: " + s.calcularRaiz());
            }
            if(operacion == 5){
                System.out.println(m);
            }
            if(operacion == 6){
                return;
            }
        }
    }
    
}
