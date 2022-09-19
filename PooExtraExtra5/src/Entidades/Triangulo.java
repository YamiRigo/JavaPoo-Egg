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
public class Triangulo {
    
    private double base;
    private double base1;
    private double lado;
    private double lado1;

    public Triangulo() {
    }

    public Triangulo(double base, double base1, double lado, double lado1) {
        this.base = base;
        this.base1 = base1;
        this.lado = lado;
        this.lado1 = lado1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    
    
}
