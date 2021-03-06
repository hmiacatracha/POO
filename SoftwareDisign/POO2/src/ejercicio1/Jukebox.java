/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

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

    public List<Cancion> play() {
        return Collections.unmodifiableList(this.jukebox);
    }

    public List<Cancion> cancionTitulo() {
        List<Cancion> ord = new ArrayList<Cancion>();
        ord.addAll(this.jukebox);
        Collections.sort(ord, new TituloComparator());
        return ord;
    }

    public List<Cancion> cancionAutor() {
        List<Cancion> ord = new ArrayList<Cancion>();
        ord.addAll(this.jukebox);
        Collections.sort(ord, new AutorComparator());
        return ord;
    }

    public List<Cancion> cancionAlbum() {
        List<Cancion> ord = new ArrayList<Cancion>();
        ord.addAll(this.jukebox);
        Collections.sort(ord, new AlbumComparator());
        return ord;
    }

    public static void mostrarLista(List<Cancion> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getTitulo());
        }
    }
}
