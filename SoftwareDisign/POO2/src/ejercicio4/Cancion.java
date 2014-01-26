/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.*;

/**
 *
 */
public class Cancion {

    private String titulo;
    private String autor;
    private String album;
    private String estilo;
    private int segundos;

    public Cancion(String t, String au, String al, String es, int s) {
        this.titulo = t;
        this.autor = au;
        this.album = al;
        this.estilo = es;
        this.segundos = s;

    }

    String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    String getAlbum() {
        return this.album;
    }
    
    String getEstilo() {
        return this.estilo;
    }

    String getDuracion() {
        Integer m;
        Integer s;
        String d;
        m = this.segundos / 60;
        s = this.segundos % 60;
        d = m.toString() + ":" + s.toString();
        return d;
    }
}
