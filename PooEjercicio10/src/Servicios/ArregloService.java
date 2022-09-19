/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import java.util.Arrays;
import Entidades.Arreglo;

/**
 *
 * @author yamila
 */
public class ArregloService {
    
    Scanner leer = new Scanner(System.in);
    
    public Arreglo crearArreglo(){
        System.out.println("Ingresar el tamaño del arreglo");
        int n = leer.nextInt();
        return new Arreglo(n);
    }
    
    public void mostrarArreglo(Arreglo a){
        for (int i = 0; i < a.getN(); i++) {
            System.out.println("[ " + a.getArreglo()[i] + " ]");
        }
        System.out.println("");
    }
    
    public void llenarArrgloRandom(Arreglo a){
        float v[] = new float[a.getN()];
        
        double num;
        
        for (int i = 0; i < v.length; i++) {
            num = (float)(Math.random() * 10 + 1);
            v[i] = (float)(Math.rint(num * 100)/100);
        }
        a.setArreglo(v);
    }
    
    public void ordenarArreglo(Arreglo a){
        //Creo un vector auxiliar
        float v[] = new float[a.getN()];
        //Lleno mi vector auxiliar con el contenido de mi Objeto Arreglo
        v = a.getArreglo();
        //Utilizo el metodo SORT de la clase Arrays para ordenar mi vector auxiliar
        Arrays.sort(v);
        //Con el vector ya ordenado seteo a mi objeto de la clase Arreglo
        a.setArreglo(v);
    }
    
    public void copiarContenido(Arreglo a, Arreglo b){
        
        int n = 10;
        
        //declaro un vector que lo voy a usar para setear el Arreglo
        float v[] = new float[b.getN()];
        //Lleno el vector 2 con 0.5 utilizando el metodo fill de la clase Arrays
        Arrays.fill(v,0.5F);
        //Copio los n primeros números del Arreglo A al vector
        System.arraycopy(a.getArreglo(),0,v,0,n);
        //seteo el contenido del vector en el Arreglo B
        b.setArreglo(v);
    }
}






