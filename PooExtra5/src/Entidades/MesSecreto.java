/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author yamila
 */
public class MesSecreto {
    
    private String[] meses;

    public MesSecreto() {
    }
   
    public MesSecreto(String[] meses) {
        this.meses = meses;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Meses { " + Arrays.toString(meses) + " }";
    }
   
}
