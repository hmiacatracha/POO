/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.*;

/**
 *
 */
public class Jukebox {

    private List<Cancion> jukebox;

    public Jukebox() {
        this.jukebox = new ArrayList<Cancion>();
    }

    public void anadir(Cancion c) {
        this.jukebox.add(c);
    }

    public List<Cancion> play(Comparator<Cancion> c) {
        if (c == null) {
            return Collections.unmodifiableList(this.jukebox);
        } else {         
            List<Cancion> ord = new ArrayList<Cancion>();
            ord.addAll(this.jukebox);
            Collections.sort(ord, c);
            return ord;
        }

    }

    public static void mostrarLista(List<Cancion> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getTitulo());
        }
    }
}
