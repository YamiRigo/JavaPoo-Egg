/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import Entidades.Arreglo;
import Servicios.ArregloService;

/**
 *
 * @author yamila
 */

/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        ArregloService s = new ArregloService();
        Arreglo a = s.crearArreglo();
        
        s.llenarArrgloRandom(a);
        
        System.out.println("Arreglo A");
        s.mostrarArreglo(a);
        
        System.out.println("");
        System.out.println("Arreglo A ordenado");
        s.ordenarArreglo(a);
        s.mostrarArreglo(a);
        
        Arreglo b = s.crearArreglo();
        s.copiarContenido(a,b);
        System.out.println("Arreglo B");
        s.mostrarArreglo(b);
    }
    
}
