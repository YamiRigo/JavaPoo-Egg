/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in);
    
    //Le pide la palabra al usuario y cantidad de jugadas máximas
    //Con la palabra del usuario, pone la long de la palabra, como la long del vector
    //Despues ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
    //palabra en un indice del vector. Y también, guarda en cantidad de jugadas máximas, el valor
    //que ingreso el usuario y encontradas en 0
    
    public Ahorcado crearJuego(){
        //Se piden los datos al usuario
        System.out.println("> Ingrese la palabra: ");
        String palabra = leer.nextLine();
        System.out.println("");
        System.out.println("> Ingrese la cantidad de jugadas que tendrá la partida: ");
        int jugadasMax = Integer.parseInt(leer.nextLine());
        
        //Creamos el array
        int longArray = palabra.length();  //Obtenemos la longitud de la palabra y sera asignada al array
        String[] arrayPalabra = new String[longArray];
        
        for (int i = 0; i < arrayPalabra.length; i++) {
            //Almacenemos la palabra en el array
            arrayPalabra[i] = String.valueOf(palabra.charAt(i));
        }
        
        int letrasEncontradas = 0;
        
        //Creamos el obj en el return por medio del constructor parametrizado
        return new Ahorcado(arrayPalabra, letrasEncontradas, jugadasMax);
    }
    
    //Muestra la longitud de la palabra que se debe encontrar
    public int longitud(Ahorcado a){
        return a.getArrayPalabra().length;
    }
    
    //Este metodo recibe una letra dada por el usuario y valida si la letra
    //ingresada es parte de la palabra o no. También informará si la letra estaba o no
    
    public boolean buscarLetra(Ahorcado a, String letra){
        //Traemos el arreglo que contiene la palabra
        String[] arrayPalabra = a.getArrayPalabra();
        boolean letraEncontrada = false;
        
        //Recorremos el arreglo en busca de la letra ingresada por el usuario
        for (int i = 0; i < arrayPalabra.length; i++) {
            if(arrayPalabra[i].equalsIgnoreCase(letra)){
                letraEncontrada = true;
                break;
            }
         }
        
        if(letraEncontrada){
            System.out.println("[Letra encontrada en la palabra!!]");
        }else{
            System.out.println("[La letra ingresada no ha sido encontrada.]");
        }
        return letraEncontrada;
    }
    
    //Metodo que recibe una letra ingresada por el usuario y muestra
    //cuantas letra han sido encontradas y cuantas faltan
    //Este metodo ademas retorna true si la letra estaba y false si la letra no estaba,
    //ya que, cada vez que se busque una letra que no este, se le restará uno a sus intentos o jugadas
    
    int contEncontradas = 0;  //almacenara el nº de letras encontradas
    
    public boolean encontradas(Ahorcado a, String letra){
        int contFaltantes;
        int intentos = a.getJugadasMax();  //nº de intentos
        boolean bandera;
        
        //validamos si la letra ingresada hace parte de la palabra
        if(buscarLetra(a,letra)){
            //si retorna true
            contEncontradas++;
            bandera = true;
        }else{
            intentos++;
            a.setJugadasMax(intentos);
            bandera = false;
        }
        
        contFaltantes = longitud(a) - contEncontradas;
        
        System.out.println("============================================");
        System.out.println("  - Número de letras encontradas: [" + contEncontradas + "]");
        System.out.println("  - Número de letras faltantes: [" + contFaltantes + "]");
        System.out.println("  - Intentos restantes: [" + intentos + "]");
        System.out.println("============================================");
        
        return bandera;
        
     }
    
    //Para mostrar cuantas oportunidades le queda al jugador
    
    public int intentos(Ahorcado a){
        return a.getJugadasMax();
    }
    
    //Metodo juego se encargara de llamar todos los metodos
    //previamente creados e informará cuando el usurario descubre toda
    //la palabra o se quede sin intentos. Este metodos se llamara en el main
    
    public void juego(){
        //creamos el juego
        Ahorcado partida1 = crearJuego();
        int contadorTrue = 0;
        
        while (intentos(partida1) > 0) {            
            //le pedimos datos al usuario
            System.out.println("> Ingrese la letra a buscar: ");
            String letra = leer.nextLine();
            
            //llamamos al metodo encontradas para validar si se encontro o no la letra
            if(encontradas(partida1, letra) == true){
                contadorTrue++;
                
                if(contadorTrue > intentos(partida1) - 1){
                    System.out.println("[SE ENCONTRARON TODAS LAS LETRAS!!]");
                    break;
                }
           }
        }
        
        if(intentos(partida1) <= 0){
            System.out.println("[JUEGO PERDIDO]");
        }
        
   }
    
}
