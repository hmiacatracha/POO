/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Comparator;

/**
 *
 */
public class AlbumComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cancion c1 = (Cancion) o1;
        Cancion c2 = (Cancion) o2;
        return c1.getAlbum().compareTo(c2.getAlbum());
    }
    
}
