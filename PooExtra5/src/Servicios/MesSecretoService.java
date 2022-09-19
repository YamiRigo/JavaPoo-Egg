/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.MesSecreto;
import java.util.Scanner;
        
/**
 *
 * @author yamila
 */
public class MesSecretoService {
    
    private MesSecreto m;

    public MesSecretoService(MesSecreto m) {
        this.m = m;
        llenarMeses();
    }
    
    public void llenarMeses(){
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
        "septiembre","octubre","noviembre","diciembre"};
        m.setMeses(meses);
    }
    
    public void preguntarMes(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivine el mes secreto. Ingrese el nombre del mes en minuscula");
        String mes = leer.next();
        
        while (repetirMes(mes)) {            
            System.out.println("No ha acertado. Intente nuevamente");
            mes = leer.next();
        }
        System.out.println("Ha acertado!!");
    }
    
    public boolean repetirMes(String mes){
        //Cambiar el número de indice desde 0 a 11 para generar diferentes meses
        //secretos
        String mesSecreto = m.getMeses()[11];
        if(mes.equals(mesSecreto)){
            return false;
        }
         return true;
      
    }

}
