/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Fecha crearFecha(){
        //La creo sin parametros para que si no ingresa bien la fecha quede
        //con los valores por defecto 1/1/1990
        Fecha laFecha = new Fecha();
        
        System.out.println("Ingrese el día (dd) ");
        int dd = leer.nextInt();
        System.out.println("Ingrese el mes (mm)");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año (aaaa)");
        int aa = leer.nextInt();
        
        if(verifica(dd,mm,aa)){
            if(aa < 1900 || aa > 2022){
                System.out.println("El año no es aceptado, tomará el valor  por defecto");
            }else{
                laFecha.setAnio(aa);
                laFecha.setDia(dd);
                laFecha.setMes(mm);
            }
        }else{
            System.out.println("Los datos ingresados no son una fecha posible");
            System.out.println("La fecha se registro con los valores por defecto");
        }
        return laFecha;
    }
    
    private static boolean verifica(int dd, int mm, int aa){
        boolean bandera = false;
        
        if(mm > 0 && mm < 13){  //Verifico que los meses sean del 1 al 12
            //Verifico por los meses que tengan 31 días
            if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
                if(dd > 0 || dd < 32){  //en estos meses los días pueden ser hasta 31
                    bandera = true;
                }else{
                    System.out.println("Los días ingresados no corresponden al mes");
                    bandera = false;
                }
            }else if(esBisiesto(aa) && mm == 2){  //Si es bisiesto y es febrero 
                bandera = dd > 0 || dd < 30;  //los días pueden ser hasta el 29
            }else{
                bandera = dd > 0 && dd < 31;
            }
        }
        return bandera;
    }
    
    private static boolean esBisiesto(int anio){
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400
        return(anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
    }
    
    private static void verificaMes(Fecha f){
        //Dos vectores de 13 elementos dejo el indice 0 con valores vacios al principio
        //para que no se me haga lio con los indeces y poder igualar el mes 1 con enero
        //(indice uno) los declaro en este metodo porque solo los uso aca no se van a modificar
        final String mesesString[] = {"nada","Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        final int mesesInt[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        //Ahora muestro los vectores segun el indice con el metodo getMes del obj Fecha
        System.out.println("El mes ingresado es " + mesesString[f.getMes()] + " y tiene "
            + mesesInt[f.getMes()] + " días");
    }
    
    private static void diaPosterior(Fecha f){
        
        int pD = f.getDia() + 1;
        int mm = f.getMes();
        int aa = f.getAnio();
        
        if(mm == 2 && pD > 29 && esBisiesto(aa)){
            pD = 1;
            mm++;
        }else if(!esBisiesto(aa)){
            pD = 1;
            mm++;
        }
        
        //Si el mes es alguno de los que tiene 31 días
        if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
            if(pD > 31){  //Si el día posterior es mayor que 31
                if(mm == 12){  //Si el mes es 12
                    mm = 1;
                    pD = 1;
                    aa++;
                }else{
                    pD = 1;
                    mm++;
                }
            }else if(pD > 30){  //Sino si el día posterior es mayor que 30
                pD = 1;
                mm++;
            }
            System.out.println("El día Posterior es " + pD + "/" + mm + "/" + aa);
        }   
        
    }
    
    private static void diaAnterior(Fecha f){
        
        int dA = f.getDia() - 1;  //dia anterior
        int mm = f.getMes();
        int mA = f.getMes() - 1;  //mes anterior
        int aa = f.getAnio();
        
        //Si el mes es enero y el día anterior es 0
        if(mm == 1 && dA == 0){
            dA = 31;  //día anterior es 31
            mm = 12;  //y el mes es diciembre
            aa--;  //le resto uno al año
        }
        
        //Si el mes es marzo el día Anterior es 0 y el año es bisiesto
        if(mm == 3 && dA == 0 && esBisiesto(aa)){
            dA = 29;  //día anterior es 29
            mm = 2;  //y el mes es febrero
        }
        
        //Para el resto de los meses si el día Anterior es 0
        if(dA == 0){
            //Si el mes anterior tiene 31 días
            if(mA == 1 || mA == 3 || mA == 5 || mA == 7 || mA == 8 || mA == 10 || mA == 12){
                dA = 31;
                mm--;
            }else{
                dA = 30;
                mm--;
            }
        }
        System.out.println("El día Anterior es " + dA + "/" + mm + "/" + aa);
    }
    
    public void verificaMBAP(Fecha f){
        
        verificaMes(f);
        if(esBisiesto(f.getAnio())){
            System.out.println("El año " + f.getAnio() + " SI es bisiesto");
        }else{
            System.out.println("El año " + f.getAnio() + " NO es bisiesto");
        }
        
        diaAnterior(f);
        diaPosterior(f);
    }
}
