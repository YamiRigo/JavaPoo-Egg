/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class PassService {
    
    private static final Scanner leer = new Scanner(System.in);
    
    //Ingresar datos de usuarios (usando constructor)
    //Hacer ingreso de datos fijos (no por teclado)
    Pass p1 = new Pass("laclavees1", "root", 27449880);
    
    public void menuOpciones(){
        System.out.println("BIENVENIDO " + p1.getNombre() + " - " + p1.getDni());
        char op = 'O';
        
        do{
            System.out.println("****** O P C I O N E S ******");
            System.out.println("** A. Cambiar Contraseña   **");
            System.out.println("** B. Modificar Nombre     **");
            System.out.println("** C. Modificar DNI        **");
            System.out.println("** D. Nivel de Contraseña  **");
            System.out.println("** X. Salir                **");
            System.out.println("*******************************");
            
            System.out.println("Ingresar opción: ");
            op = leer.next().toUpperCase().charAt(0);
            
            switch(op){
                case 'A':
                    modificaPass(p1);
                    break;
                case 'B':
                    modificaName(p1);
                    break;
                case 'C':
                    modificaDNI(p1);
                    break;
                case 'D':
                    analizarPass(p1);
                    break;
                case 'X':
                    System.out.println("CHAU!! " + p1.getNombre() + "\n");
                    break;
                default:
                    System.out.println("Ingresó una opción no valida");
                    op = 'O';
            }
        }while(op != 'X');
    }
    
    public void menu(){
        int dni = 0;
        String pass = " ";
        boolean bandera = false;
        
        do{
            System.out.println("*****   I N G R E S O  *****");
            System.out.println("** DNI y CONTRASEÑA **");
            System.out.println("*****************************");
            System.out.println("Ingrese los dos valores: ");
            dni = leer.nextInt();
            
            while(!(dni >= 4000000 && dni < 99999999)){
                System.out.println("No es un DNI valido");
                dni = leer.nextInt();
            }
            pass = leer.next();
            while(!(pass.length() >= 10 && pass.length() < 20)){
                System.out.println("No es una contraseña valida");
                pass = leer.next();
            }
            
            if(verificaUsuario(p1,dni,pass)){
                bandera = true;
                menuOpciones();
            }else{
                System.out.println("DNI o Contraseña no valida");
                bandera = false;
            }
        }while(bandera != true);
    }
    
    private static boolean verificaUsuario(Pass p, int dni, String clave){
        if(dni == p.getDni() && (clave.equals(p.getPass()))){
            System.out.println("Bienvenido " + p.getNombre());
            return true;
        }else{
            System.out.println("El DNI corresponde");
            return false;
        }
    }
    
    private static void modificaPass(Pass p){
        boolean b = true;
        
        if(verificaPass(p)){
            do{
                System.out.println("Ingrese la nueva contraseña");
                String nueva = leer.next();
                if(nueva.length() > 10){
                    b = true;
                    p.setPass(nueva);
                }else{
                    System.out.println("La contraseña debe contener 10 o más caracteres");
                    b = false;
                }
            }while(b == false);
        }else{
            System.out.println("Colocaste mas la pass");
        }
    }
    
    //Crear los metodos correspondientes para modificar el nombre o dni
    //Atención! 1º debe ingresar el pass para poder realizar dicha gestión
    //Caso contrario se impedirá el acceso a modificar los datos
    
    private static void modificaName(Pass p){
        if(verificaPass(p)){
            System.out.println("Ingrese el nuevo Nombre de Usuario");
            p.setNombre(leer.next());
        }else{
            System.out.println("Colocaste mal la clave");
        }
    }
    
    private static void modificaDNI(Pass p){
        if(verificaPass(p)){
            System.out.println("Ingrese el nuevo DNI");
            p.setDni(leer.nextInt());
        }else{
            System.out.println("Colocaste mal la clave");
        }
    }
    
    //Crear un metodo para analizar la contraseña(analizarPass)
    //Donde: SI Existe al menos una letra z : Es nivel MEDIO
    //Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
    //Si ninguna condición se cumple es nivel BAJO
    
    private static void analizarPass(Pass p){
        String clave = p.getPass().toLowerCase();
        int contA = 0;
        int contZ = 0;
        
        for (int i = 0; i < clave.length(); i++) {
            if("a".equals(clave.substring(i))){
                contA++;
            }
            if("z".equals(clave.substring(i))){
                contZ++;
            }
            if(contZ > 0 && contA > 1){
                System.out.println("Contraseña Nivel ALTO");
            }else if(contZ > 0){
                System.out.println("Contraseña Nivel MEDIO");
            }else{
                System.out.println("Contraseña Nivel BAJO");
            }
        }
    }
    
    private static boolean verificaPass(Pass p){
        System.out.println("Ingrese su contraseña actual");
        String clave = leer.next();
        return clave.equals(p.getPass());
    }
    
}
