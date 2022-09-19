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
public class Fecha {
    
    int dia; 
    int mes;
    int anio;

    public Fecha() {
    }
   
    public Fecha(int dia, int mes, int anio) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }
    
    
}
