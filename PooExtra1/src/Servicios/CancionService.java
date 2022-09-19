/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author yamila
 */
public class CancionService {
    
    Scanner leer = new Scanner(System.in);
    
    private Cancion c;

    public CancionService(Cancion c) {
        this.c = c;
    }
    
    public void crearCancion(){
        System.out.println("Ingrese el nombre de la canción");
        c.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la canción");
        c.setAutor(leer.nextLine());
    }
    
}
