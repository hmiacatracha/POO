/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Comparator;

/**
 *
 */
public class TituloComparador implements Comparator<Cancion> {

    @Override
    public int compare(Cancion c1, Cancion c2) {
        return c1.getTitulo().
                compareTo(c2.getTitulo());
    }
}
