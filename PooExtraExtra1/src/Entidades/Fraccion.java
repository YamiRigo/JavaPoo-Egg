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
public class Fraccion {
    
    private int denominador;
    private int numerador;

    public Fraccion() {
    }

    public Fraccion(int denominador, int numerador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "Fraccion { " + "denominador: " + denominador + ", numerador: " + numerador + " }";
    }
    
    
    
}
