/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class FraccionService {
    
    private static Scanner leer = new Scanner(System.in);
    
    //Numerador y Denominador de los restados usado en varios metodos
    private static int resNum = 0, resDeno = 0;
    
    private static Fraccion crearFraccion(){
        System.out.println("Ingrese el numerador: ");
        int num = leer.nextInt();
        System.out.println("Ingrese el denomindor: ");
        int deno = leer.nextInt();
        
        return new Fraccion(num,deno);
    }
    
    private static void sumaF(){
        System.out.println("SUMA DE FRACCIONES");
        //Creo dos fracciones con mi metodo crearFraccion
        Fraccion f1 = crearFraccion();
        Fraccion f2 = crearFraccion();
        
        //Si el denominador es igual sumo los numeradores
        if(f1.getDenominador() == f2.getDenominador()){
            resNum = (int) (f1.getNumerador() + f2.getNumerador());
            resDeno = (int) f1.getDenominador();
        }else{  //en cambio si son diferentes sumo los numeradores y multiplico los denominadores
            resNum = (int) (f1.getNumerador() +  f2.getNumerador());
            resDeno = (int) (f1.getDenominador() * f2.getDenominador());
        }
        //Una nueva fracción con los resultados
        Fraccion resultado = new Fraccion(resNum,resDeno);
        //Muestro la operación y el resultado usando mi metodo muestraOP
        muestraOP(f1,f2,resultado, '+');
    }
    
    private static void restaF(){
        System.out.println("RESTA DE FRACCIONES");
        //Creo dos fracciones con mi metodo crearFraccion
        Fraccion f1 = crearFraccion();
        Fraccion f2 = crearFraccion();
        
         //Si el denominador es igual sumo los numeradores
         if(f1.getDenominador() == f2.getDenominador()){
             resNum = (int) (f1.getNumerador() - f2.getNumerador());
             resDeno = (int) f1.getDenominador();
         }else{  //en cambio el producto del numerador de f1 por el denominador de f2 le resto el producto
                    //del denominador de la 1º fracción por el numerador de la 2º
             resNum = (int) ((f1.getNumerador() * f2.getDenominador()) - (f1.getNumerador() * f2.getNumerador()));
             resDeno = (int) (f1.getDenominador() * f2.getDenominador());
         }
         //Una nueva fracción con los resultados
         Fraccion resultado = new Fraccion(resNum,resDeno);
          //Muestro la operación y el resultado usando mi metodo muestraOP
         muestraOP(f1,f2,resultado, '-');
    }
    
    private static void multiplicaF(){
        System.out.println("MULTIPLICACIÓN DE FRACCIONES");
        //Creo dos fracciones con mi metodo crearFraccion
        Fraccion f1 = crearFraccion();
        Fraccion f2 = crearFraccion();
        
        resNum = (int) (f1.getNumerador() * f2.getNumerador());
        resDeno = (int) (f1.getDenominador() * f2.getDenominador());
        
        //Una nueva fracción con los resultados
        Fraccion resultado = new Fraccion(resNum,resDeno);
         //Muestro la operación y el resultado usando mi metodo muestraOP
         muestraOP(f1,f2,resultado, 'x');
    }
    
    private static void divideF(){
        System.out.println("DIVISIÓN DE FRACCIONES");
        //Creo dos fracciones con mi metodo crearFraccion
        Fraccion f1 = crearFraccion();
        Fraccion f2 = crearFraccion();
        
        resNum = (int) (f1.getNumerador() * f2.getDenominador());
        resDeno = (int) (f1.getDenominador() * f2.getNumerador());
        
        //Una nueva fracción con los resultados
        Fraccion resultado = new Fraccion(resNum,resDeno);
         //Muestro la operación y el resultado usando mi metodo muestraOP
         muestraOP(f1,f2,resultado, '/');
    }
    
    private static void muestraOP(Fraccion f1, Fraccion f2, Fraccion r, char o){
        System.out.println("\n");
        System.out.println(f1.getNumerador() + "       " + f2.getNumerador() + "       " + r.getNumerador());
        System.out.println("-------" + o + "-------" + " = -------");
        System.out.println(f1.getDenominador() + "      " + f2.getDenominador() +  "       " + r.getDenominador());
        System.out.println("\n");
    }
    
    public void menu(){
        int op = 0;
        
        do{
            System.out.println("**********************************");
            System.out.println("********* FRACCIONES ***********");
            System.out.println("*****  1. SUMA                            ");
            System.out.println("*****  2. RESTA                         ");
            System.out.println("*****  3. MULTIPLICACIÓN      ");
            System.out.println("*****  4. DIVISIÓN                     ");
            System.out.println("*****  5. SALIR                          ");
            System.out.println("*********************************");
            System.out.println("Ingresar opción...");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    sumaF();
                    break;
                case 2: 
                    restaF();
                    break;
                case 3:
                    multiplicaF();
                    break;
                case 4:
                    divideF();
                    break;
                case 5:
                    System.out.println("CHAU!!\n");
                    break;
                default:
                    System.out.println("Ingreso una opción no valida");
                    op = 0;
            }
        }while(op != 5);  //Hacer miestras op sea diferente de 5
    }
    
}
