/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cadena;

/**
 *
 * @author yamila
 */
public class CadenaService {
    
    Scanner leer = new Scanner(System.in);
    
    private Cadena c;

    public CadenaService(Cadena c) {
        this.c = c;
    }
    
    public void crearFrase(){
        System.out.println("Ingresar una palabra o frase");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
    }
    
    public void mostrarVocales(){
        int vocales = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getFrase().toLowerCase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales de la frase es de: " + vocales);
    }
    
    public void invertirFrase(){
        String fraseInvertida = "";
        System.out.println(c.getFrase());
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += String.valueOf(c.getFrase().charAt(i));
        }
        System.out.println("La frase invertida es: ");
        System.out.println(fraseInvertida);
    }
    
    public int vecesRepetido(char letra){
        int repetido = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().toLowerCase().charAt(i) == letra){
                repetido++;
            }
        }
        return repetido;
    }
    
    public void compararLongitud(String frase){
        if(c.getLongitud() > frase.length()){
            System.out.println("La frse " + c.getFrase() + " es más larga");
            System.out.println("La frase " + frase + " es más corta");
            
        }else if(c.getLongitud() == frase.length()){
            System.out.println("Ambas frases tienen la misma longitud");
            
        }else{
            System.out.println("La frase " + frase + " es más larga");
            System.out.println("La frase " + c.getFrase() + " es más corta");
        }
    }
    
    public String unirFrases(String frase){
        return c.getFrase() + " " + frase;
    }
    
    public void reemplazar(char simbolo){
        String nuevaFrase = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().toLowerCase().charAt(i) == 'a'){
                nuevaFrase += simbolo;
            }else{
                nuevaFrase += String.valueOf(c.getFrase().charAt(i));
            }
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    }
    
    public boolean contiene(char letra){
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().toLowerCase().charAt(i) == letra){
                return true;
            }
        }
        return false;
    }
}
