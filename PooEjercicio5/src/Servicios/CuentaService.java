/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cuenta;

/**
 *
 * @author yamila
 */
public class CuentaService {
    
    Scanner leer = new Scanner(System.in);
    
    private Cuenta c;

    public CuentaService(Cuenta c) {
        this.c = c;
    }
    
    public void crearCuenta(){
        System.out.println("Ingrese su DNI");
        c.setDni(leer.nextLong());
        c.setNumCuenta((int)(Math.random() * 10000));
        c.setInteres(22.5);
        System.out.println("Desea depositar dinero? (S/N)");
        
        if(leer.next().toUpperCase().charAt(0) == 'S'){
            System.out.println("Cuánto desea ingresar?");
            ingresar(leer.nextDouble());
        }
        System.out.println("Su cuenta ha sido creada satisfactoriamente");
        System.out.println(c);
    }
    
    public void ingresar(double ingreso){
        System.out.println("Usted ha depositado: $" + ingreso);
        c.setSaldo(c.getSaldo() + ingreso);
    }
    
    public void retirar(double retiro){
        if(c.getSaldo() < retiro){
            System.out.println("Fondos insuficientes.");
        }else{
            c.setSaldo(c.getSaldo() - retiro);
            System.out.println("Usted ha retirado: " + retiro);
        }
    }
    
    public void extraccionRapida(){
        System.out.println("Extracción finalizada");
        System.out.println("Monto extraido: $" + (c.getSaldo() * 0.2));
        c.setSaldo(c.getSaldo() * 0.8);
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo en pesos es de: $" + c.getSaldo());
    }
    
    public void consultarDatos(){
        System.out.println("*** Datos de la cuenta ***");
        System.out.println("Número de Cuenta: " + c.getNumCuenta());
        System.out.println("Número de DNI: " + c.getDni());
        System.out.println("Saldo: " + c.getSaldo());
        System.out.println("Intereses: " + c.getInteres());
    }
}
