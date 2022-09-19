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
public class Persona {
    
    private String nombre;
    private Date fecha;
    private Date fechaActual;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date fecha, Date fechaActual, int edad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaActual = fechaActual;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFechaActual(Date fechaActual){
        this.fechaActual = fechaActual;
    }
    public Date getFechaActual(){
        return fechaActual;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    } 

   
}
