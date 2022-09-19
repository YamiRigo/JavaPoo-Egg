/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra1;

import Entidades.Cancion;
import Servicios.CancionService;

/**
 *
 * @author yamila
 */

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.*/

public class Extra1 {

    public static void main(String[] args) {
        
        Cancion c = new Cancion();
        CancionService s = new CancionService(c);
        
        s.crearCancion();
        System.out.println(c);
        
    }
    
}
