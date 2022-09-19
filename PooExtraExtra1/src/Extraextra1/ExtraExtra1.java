/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraextra1;

import Servicios.FraccionService;

/**
 *
 * @author yamila
 */

/*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.*/

public class ExtraExtra1 {

    public static void main(String[] args) {
       
        FraccionService s =new FraccionService();
        s.menu();
        
    }
    
}
