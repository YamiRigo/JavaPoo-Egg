/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNIF(){
        System.out.println("Ingrese el DNI");
        long dni = leer.nextLong();
        
        return new NIF(dni,calcularNIF(dni));
    }
    
    private static String calcularNIF(long dni){
        //vector de tipo cadena con todas las letras
        String vector[] = {"T","R","W","A","G","M","Y","F","P","D","X","B",
        "N","J","Z","S","Q","V","H","L","C","K","E"};
        
        //obtengo el DNI de obj y al dividirlo por 23 con el resto
        //tengo el indice del vector
        int indice = (int)dni%23;
        return vector[indice];
    }
    
    public void mostrarNIF(NIF n){
        System.out.println("NIF: " + n.getDni() + " - " + n.getLetraNIF());
    }
    
}
