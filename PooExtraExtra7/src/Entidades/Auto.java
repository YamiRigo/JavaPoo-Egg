/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author yamila
 */
public class Auto {
    
    private String dueño, color;
    private int modelo, km = 7500;
    private Date vencimientoCarnet = new Date();

    public Auto() {
    }

    public Auto(String dueño, String color, int modelo, int km, Date vencimientoCarnet) {
        this.dueño = dueño;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
        this.vencimientoCarnet = vencimientoCarnet;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getVencimientoCarnet() {
        return vencimientoCarnet;
    }

    public void setVencimientoCarnet(Date vencimientoCarnet) {
        this.vencimientoCarnet = vencimientoCarnet;
    }

    @Override
    public String toString() {
        return "Auto{ " + "dueño: " + dueño + ", color: " + color + ", modelo: " + modelo + ", km: " + km + ", vencimientoCarnet: " + vencimientoCarnet + " }";
    }

    
    
}
