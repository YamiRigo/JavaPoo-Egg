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
public class Ahorcado {
    
    private String[] arrayPalabra;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }
    
    //Constructor con los parametros

    public Ahorcado(String[] arrayPalabra, int letrasEncontradas, int jugadasMax) {
        this.arrayPalabra = arrayPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getArrayPalabra() {
        return arrayPalabra;
    }

    public void setArrayPalabra(String[] arrayPalabra) {
        this.arrayPalabra = arrayPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
