/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.Libro;

/**
 *
 * @author yamila
 */
public class LibroService {
    
    private Libro l;
    
    Scanner leer = new Scanner(System.in);
    
    public LibroService(Libro l){
        this.l = l;
    }
    
    public void crearLibro(){
        System.out.println("Ingresar el ibsn");
        l.setIsbn(leer.nextLine());
        System.out.println("Ingresar el titulo");
        l.setTitulo(leer.nextLine());
        System.out.println("Ingresar el autor");
        l.setAutor(leer.nextLine());
        System.out.println("Ingresar el número de páginas");
        l.setNumPaginas(leer.nextInt());
    }
}
