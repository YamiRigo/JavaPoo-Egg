package Ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import Entidades.Libro;
import Servicios.LibroService;

/**
 *
 * @author yamila
 */

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int operacion = 0;
        
        Libro l = new Libro();
        LibroService s = new LibroService(l);
        
        while (operacion != 3) {            
            System.out.println("----------> MENU <----------");
            System.out.println("     1. Crear Libro");
            System.out.println("     2. Mostrar Libro");
            System.out.println("     3. Salir");
            System.out.println("----------------------------");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.crearLibro();
            }
            if(operacion == 2){
                System.out.println(l);
            }
            if(operacion == 3){
                return;
            }
        }
    }
    
}
