/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraextra7;

import Entidades.Auto;
import Servicios.AutoService;

/**
 *
 * @author yamila
 */

/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/

public class ExtraExtra7 {

    public static void main(String[] args) {
        
        AutoService s = new AutoService();
        Auto au = s.crearAuto();
        
        System.out.println("\n" + au + "\n");
        
        s.cambioTitular(au);
        System.out.println("\n" + au + "\n");
        
        s.trayectoRecorrido(au);
        System.out.println("\n" + au + "\n");
        
        s.serviceAuto(au);
        System.out.println("\n" + au + "\n");
        
    }
    
}
