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
public class NIF {
    
    private long dni;
    private String letraNIF;

    public NIF() {
    }

    public NIF(long dni, String letraNIF) {
        this.dni = dni;
        this.letraNIF = letraNIF;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetraNIF() {
        return letraNIF;
    }

    public void setLetraNIF(String letraNIF) {
        this.letraNIF = letraNIF;
    }

    @Override
    public String toString() {
        return "NIF: " + dni + " - " + letraNIF;
    }
    
    
    
}
