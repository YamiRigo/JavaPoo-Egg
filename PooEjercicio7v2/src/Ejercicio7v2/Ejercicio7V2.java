/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7v2;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author yamila
 */
public class Ejercicio7V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // Intanciamos la clase ServiciosPersona para hacer uso de los metodos
        
          PersonaService s = new PersonaService();
          
          //Intanciamos 4 objetos de tipo Persona
          Persona p1 = new Persona();
          Persona p2 = new Persona();
          Persona p3 = new Persona();
          Persona p4 = new Persona();
          
          //Damos valores a los objetos de tipos persona
          s.crearPersona(p1);
          s.crearPersona(p2);
          s.crearPersona(p3);
          s.crearPersona(p4);
          
          //Validamos la edad de las 4 personas
          s.esMayorDeEdad(p1);
          s.esMayorDeEdad(p2);
          s.esMayorDeEdad(p3);
          s.esMayorDeEdad(p4);
          
          //Calculamos el IMC de las 4 personas
          s.calcularIMC(p1);
          s.calcularIMC(p2);
          s.calcularIMC(p3);
          s.calcularIMC(p4);
          
          //Estadistica de las 4 persona
          s.estadistica(4);
          
          
          
          
        
    }
    
}
