/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;
import Entidades.Cadena;
import Servicios.CadenaService;

/**
 *
 * @author yamila
 */

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cadena c = new Cadena();
        CadenaService s = new CadenaService(c);
        
        int operacion = 0;
        
        while (operacion != 10) {            
            System.out.println("*************** MENU **************");
            System.out.println("   1. Crear Frase");
            System.out.println("   2. Mostrar cantidad de vocales");
            System.out.println("   3. Invertir Frase");
            System.out.println("   4. Calcular veces que se repite");
            System.out.println("   5. Comparar longitud");
            System.out.println("   6. Unir Frases");
            System.out.println("   7. Reemplazar");
            System.out.println("   8. Comprobar si existe una letra");
            System.out.println("   9. Mostrar objeto");
            System.out.println("   10. Salir");
            System.out.println("***********************************");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.crearFrase();
            }
            if(operacion == 2){
                s.mostrarVocales();
            }
            if(operacion == 3){
                s.invertirFrase();
            }
            if(operacion == 4){
                System.out.println("Ingresar la letra a buscar");
                System.out.println(" La letra se repite " + s.vecesRepetido(leer.next().charAt(0)) + " veces");
            }
            if(operacion == 5){
                System.out.println("Ingresar una frase");
                leer.nextLine();
                s.compararLongitud(leer.nextLine());
            }
            if(operacion == 6){
                System.out.println("Ingresar una frase");
                leer.nextLine();
                System.out.println(s.unirFrases(leer.nextLine()));
            }
            if(operacion == 7){
                System.out.println("Ingresar el simbolo por el que quiere reemplazar la letra 'a'");
                s.reemplazar(leer.next().charAt(0));
            }
            if(operacion == 8){
                System.out.println("Ingresar la letra a buscar");
                System.out.println(s.contiene(leer.next().toLowerCase().charAt(0)));
            }
            if(operacion == 9){
                System.out.println(c);
            }
            if(operacion == 10){
                return;
            }
        }
    }
    
}
