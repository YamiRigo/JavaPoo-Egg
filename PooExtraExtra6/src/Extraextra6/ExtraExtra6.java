/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraextra6;

import Entidades.SopaDeLetras;
import Servicios.SopaDeLetrasService;

/**
 *
 * @author yamila
 */

/*Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)*/

public class ExtraExtra6 {

    public static void main(String[] args) {
        
        SopaDeLetrasService s = new SopaDeLetrasService();
        SopaDeLetras sopa = s.crearSopa();
        
        s.mostrarSopa(sopa);
        s.llenarSopa(sopa);
        
        System.out.println("**********************************");
        
        s.mostrarSopa(sopa);
        s.buscarPalabra(sopa);
        
        s.reemplazarPalabra(sopa);
        s.mostrarSopa(sopa);
        s.mostrarInvertido(sopa);
        
    }
    
}
