/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2;

import Entidades.Puntos;
import Servicios.PuntosService;

/**
 *
 * @author yamila
 */

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.*/

public class Extra2 {

    public static void main(String[] args) {
       
        Puntos p = new Puntos();
        PuntosService s = new PuntosService(p);
        
        s.crearPuntos();
        System.out.println(s.calcularDistancia());
        System.out.println(p);
        
    }
    
}
