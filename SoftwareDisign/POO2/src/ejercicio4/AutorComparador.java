/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Comparator;

/**
 *
 */
public class AutorComparador implements Comparator<Cancion> {

    @Override
    public int compare(Cancion c1, Cancion c2) {
        return c1.getAutor().
                compareTo(c2.getAutor());
    }
}
