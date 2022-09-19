/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author yamila
 */

/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Instanciamos el servicio
        PersonaService s = new PersonaService();
       
        //Creamos la persona con la llamada al metodo del servicio
        s.crearPersona();
       
        //Llamamos el metodo para calcular la edad
        s.calcularEdad();
        
        //Creamos la edad 2 la cual se comparará con la persona ya ingresada
        System.out.println("---> 2º USUARIO <---");
        
        //Llamamos al metodo menorQue 
        s.menorQue(leer.nextInt());
        
        //Mostramos los datos de las persona
        s.mostrarPersona();
        
    }
    
}
