/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;
import Entidades.Persona;

/**
 *
 * @author yamila
 */
public class PersonaService {
    
    Scanner leer =  new Scanner(System.in);
    Persona p = new Persona();
    
    //Metodo que rellena el objeto mediante un scanner y le pregunta al usuario el
    //nombre y la fecha de nacimiento
    
    public void crearPersona(){
        
        //Pedimos los datos al usurio para crear obj persona
        System.out.println("---> 1º USUARIO <---");
        System.out.print("-Ingreso de nombre: ");
        p.setNombre(leer.next());
        
        System.out.println("-Fecha de Nacimiento");
        System.out.print("Ingreso de año: ");
        int year = leer.nextInt();
        year-=1900;  //Operador de asignación resta una cantidad al valor
        System.out.print("Ingreso del mes: ");
        int month = leer.nextInt();
        month-=1;
        System.out.print("Ingreso del día: ");
        int day = leer.nextInt();
        p.setFecha(new Date(year, month, day));
        
    }
    
    
    
    //A partir de la fecha de nacimiento ingresada calculará la edad de la persona
    //Para conocer la edad de la persona también se debe conocer la fecha actual
    
    public void calcularEdad(){
        
        //Obtenemos la fecha actual
        p.setFechaActual(new Date());
        Date fechaActual = p.getFechaActual();
         
        //Traemos la fecha de nacimiento
        Date fecha = p.getFecha();
        
        //Calculamos la edad de la persona con el tiempo transcurrido entre fechas
        p.setEdad(fechaActual.getYear() - fecha.getYear());
    }
    
    
    
    //Recibe como párametro otra edad y retorna true en caso de que el receptor tenga
    //menor edad que la persona que se recibe como párametro, o false en caso contrario
    
    public void menorQue(int edad2){
        
        if(p.getEdad() > edad2){
            System.out.println("La edad del 1º Usuario es mayor que la edad del 2º Usuario");
        }else{
            System.out.println("La edad del 1º Usuario es menor que la edad del 2º Usuario");
        }
    }
    
    //Metodo que muestra la persona creada 
    
    public void mostrarPersona(){
        System.out.println("******** DATOS DEL USUARIO ********");
        System.out.println("-Nombre: " + p.getNombre());
        System.out.println("-Fecha de Nacimiento: " + p.getFecha());
        System.out.println("-Edad: " + p.getEdad());
        System.out.println("*******************************************");
    }

}