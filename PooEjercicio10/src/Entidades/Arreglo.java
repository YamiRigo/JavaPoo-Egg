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
public class Arreglo {
    
    private int n;
    private float arreglo[] = new float[n];

    public Arreglo() {
    }

    public Arreglo(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(float[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
}
