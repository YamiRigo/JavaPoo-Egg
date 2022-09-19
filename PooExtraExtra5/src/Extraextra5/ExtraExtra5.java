/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraextra5;

import Entidades.Triangulo;
import Servicios.TrianguloService;

/**
 *
 * @author yamila
 */

/*Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
Ejercicio*/

public class ExtraExtra5 {

    public static void main(String[] args) {
        
        TrianguloService s = new TrianguloService();
        Triangulo t = new Triangulo();

        s.crearTriangulo(t);
          
        s.calcularPerimetro(t);
        
        s.calcularArea(t);
  
        s.areaMayor();
        
    }
    
}
