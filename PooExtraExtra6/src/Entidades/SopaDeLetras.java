/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yamila
 */
public class SopaDeLetras {
    
    private char matriz[][] =  new char[10][10];
    private String palabra;
    private String [] vector = {"perro","reloj","carta","banco","arbol","coche","yerba","rueda","lente","horno"};

    public SopaDeLetras() {
    }

    public SopaDeLetras(String palabra) {
        this.palabra = palabra;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return "SopaDeLetras { " + "matriz: " + matriz + ", palabra: " + palabra + ", vector: " + vector + " }";
    }
    
    
    
}
