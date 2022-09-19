/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;
import Entidades.Cuenta;
import Servicios.CuentaService;

/**
 *
 * @author yamila
 */

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cuenta c = new Cuenta();
        CuentaService s = new CuentaService(c);
        
        int operacion = 0;
        
        while (operacion != 8) {            
            System.out.println("*********** MENU ************");
            System.out.println("   1. Crear Cuenta");
            System.out.println("   2. Depositat");
            System.out.println("   3. Retirar");
            System.out.println("   4. Extracción Rápida");
            System.out.println("   5. Consultar Saldo");
            System.out.println("   6. Consultar Datos");
            System.out.println("   7. Mostrar Cuenta");
            System.out.println("   8. Salir");
            System.out.println("*****************************");
            
            operacion = leer.nextInt();
            
            if(operacion == 1){
                s.crearCuenta();
            }
            if(operacion == 2){
                System.out.println("Cuánto desea depositar?");
                s.ingresar(leer.nextDouble());
            }
            if(operacion == 3){
                System.out.println("Cuánto desea retirar?");
                s.retirar(leer.nextDouble());
            }
            if(operacion == 4){
                s.extraccionRapida();
            }
            if(operacion == 5){
                s.consultarSaldo();
            }
            if(operacion == 6){
                s.consultarDatos();
            }
            if(operacion == 7){
                System.out.println(c);
            }
            if(operacion == 8){
                return;
            }
        }
    }
    
}
