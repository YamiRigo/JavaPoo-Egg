/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author yamila
 */
public class MatematicaService {
    
    private Matematica m;

    public MatematicaService(Matematica m) {
        this.m = m;
    }
    
    public void llenarNumeros(){
        m.setNum1(Math.random() * 10);
        m.setNum2(Math.random() * 10);
    }
    
    public double devolverMayor(){
        if(m.getNum1() > m.getNum2()){
            return m.getNum1();
        }
        if(m.getNum2() > m.getNum1()){
            return m.getNum2();
        }
        return 0;
    }
    
    public double devolverMenor(){
        if(m.getNum1() > m.getNum2()){
            return m.getNum2();
        }
        if(m.getNum2() > m.getNum1()){
            return m.getNum1();
        }
        return 0;
    }
    
    public double calcularPotencia(){
        return Math.pow(Math.round(devolverMayor()), Math.round(devolverMenor()));
    }
    
    public double calcularRaiz(){
        return Math.sqrt(Math.round(devolverMenor()));
    }
}
