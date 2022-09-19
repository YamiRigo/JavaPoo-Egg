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
public class Cuenta {
    
    private long dni;
    private int numCuenta;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(long dni, int numCuenta, double saldo, double interes) {
        this.dni = dni;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "{ Número de Cuenta: " + numCuenta + ", DNI: " + dni + ", Saldo: " + saldo 
                + ", Interes: " + interes + " }";
    }
    
}

