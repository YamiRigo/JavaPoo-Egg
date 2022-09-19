/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.SopaDeLetras;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author yamila
 */
public class SopaDeLetrasService {
    
    Scanner leer = new Scanner(System.in);
    
    public SopaDeLetras crearSopa(){
        SopaDeLetras sl = new SopaDeLetras();
        char[][] matriz = new char[10][10];
        
        for (char[] p: matriz) {
            Arrays.fill(p, '_');
        }
        
        sl.setMatriz(matriz);
        return sl;
    }
    
    public void mostrarSopa(SopaDeLetras sp){
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sp.getMatriz()[i][j] + "  ");
            }
            System.out.println("");
        }
        
    }
    
    public void mostrarInvertido(SopaDeLetras sp){
        
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sp.getMatriz()[j][i] + "  ");
            }
            System.out.println("");
        }
    }
    
    public void llenarSopa(SopaDeLetras sp){
        int mm;
        char matriz[][] = sp.getMatriz();
        
        for (int i = 0; i < 10; i++) {
            mm = ThreadLocalRandom.current().nextInt(0,6);
            for (int j = mm; j < mm + 5; j++) {
                matriz[i][j] = sp.getVector()[i].charAt(j - mm);
            }
        }
    }
    
    public void buscarPalabra(SopaDeLetras sp){
        
        System.out.println("Ingrese palabra que desea buscar: ");
        String palabra = leer.next();
        char matriz[][] = sp.getMatriz();
        
        if(palabra.length() == 5){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    if(matriz[i][j] == palabra.charAt(0)
                            && matriz[i][j + 1] == palabra.charAt(1)
                            && matriz[i][j + 2] == palabra.charAt(2)
                            && matriz[i][j + 3] == palabra.charAt(3)
                            && matriz[i][j + 4] == palabra.charAt(4)){
                        System.out.println("La posición/coordenada en la que inicia la palabra es: " + (i + 1) + " . " + (j + 1));
                    }
                }
            }
        }else{
            System.out.println("La palabra debe de tener 5 caracteres");
        }
    }
    
    public void reemplazarPalabra(SopaDeLetras sp){
        System.out.println("Ingrese la palabra a reemplazar: ");
        String palabra = leer.next();
        char matriz[][] = sp.getMatriz();
        
        if(palabra.length() == 5){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    if(matriz[i][j] == palabra.charAt(0)
                            && matriz[i][j + 1] == palabra.charAt(1)
                            && matriz[i][j + 2] == palabra.charAt(2)
                            && matriz[i][j + 3] == palabra.charAt(3)
                            && matriz[i][j + 4] == palabra.charAt(4)){
                        System.out.println("Se reemplazará por: ");
                        String nuevaPalabra = leer.next();
                        for (int k = 0; k < 5; k++) {
                            matriz[i][j + k] = nuevaPalabra.charAt(k);
                        }
                    }
                }
            }
        }else{
            System.out.println("La palabra debe de tener 5 caracteres");
        }
    }
}
