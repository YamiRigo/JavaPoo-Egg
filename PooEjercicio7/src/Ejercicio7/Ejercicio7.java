/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author yamila
 */

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Persona[] personas = new Persona[4];
        PersonaService[] pService = new PersonaService[4];
        
        int delgado = 0;
        int ideal = 0;
        int sobrepeso = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            pService[i] = new PersonaService(personas[i]);
            
            pService[i].crearPersona();
            pService[i].imc();
            
            if(pService[i].calcularIMC() == -1){
                delgado++;
            }
            if(pService[i].calcularIMC() == 0){
                ideal++;
            }
            if(pService[i].calcularIMC() == 1){
                sobrepeso++;
            }
            if(pService[i].esMayorDeEdad()){
                System.out.println(personas[i].getNombre() + " es mayor de edad");
                System.out.println("");
                mayor++;
            }else{
                System.out.println(personas[i].getNombre() + " es menor de edad");
                System.out.println("");
                menor++;
            }
        }
        
        if(delgado > 0){
            if(delgado == 1){
                System.out.println("Hay " + delgado + " persona con peso por debajo del ideal");
                System.out.println("");
            }else{
                System.out.println("Hay " + delgado + " personas con peso por debajo del ideal");
                System.out.println("");
            }
            System.out.println("El porcentaje de personas con peso por debajo del ideal es de "
            + (double)((delgado * 100) / personas.length));
            System.out.println("");
        }
        if(ideal > 0){
            if(ideal == 1){
                System.out.println("Hay " + ideal + " persona con peso ideal");
                System.out.println("");
            }else{
                System.out.println("Hay " + ideal + " personas con peso ideal");
                System.out.println("");
            }
            System.out.println("El porcentaje de personas con peso ideal es de: "
            + (double)((ideal * 100) / personas.length));
            System.out.println("");
        }
        if(sobrepeso > 0){
            if(sobrepeso == 1){
                System.out.println("Hay " + sobrepeso + " persona con peso por encima del ideal");
                System.out.println("");
            }else{
                System.out.println("Hay " + sobrepeso + " personas con peso por encima del ideal");
                System.out.println("");
            }
            System.out.println("El procentaje de personas con sobrepeso es de: " 
            + (double)((sobrepeso * 100) / personas.length));
            System.out.println("");
        }
        
        if(mayor > 0){
            if(mayor == 1){
                System.out.println("Hay " + mayor + " persona mayor de edad");
                System.out.println("");
            }else{
                System.out.println("Hay " + mayor + " personas mayores de edad");
                System.out.println("");
            }
            System.out.println("El porcentaje de personas mayores es de: " 
            + (double)((mayor * 100) / personas.length));
            System.out.println("");
        }
        if(menor > 0){
            if(menor == 1){
                System.out.println("Hay " + menor + " persona menor de edad");
                System.out.println("");
            }else{
                System.out.println("Hay " + menor + " personas menores de edad");
                System.out.println("");
            }
            System.out.println("El porcentaje de personas menores es de: "
            + (double)((menor * 100) / personas.length));
            System.out.println("");
        }
        
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }
    
}
