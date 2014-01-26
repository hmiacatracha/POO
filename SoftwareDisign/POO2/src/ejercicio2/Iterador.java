/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 */
public class Iterador<E> implements Iterator<E> {
    private int posicion;
    private LinkedList<E> lista;

    public Iterador(LinkedList<E> l) {
        this.lista = l;
        this.posicion = this.lista.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (this.posicion < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public E next() {
        E o = this.lista.get(this.posicion);
        this.posicion--;
        return o;
    }

    @Override
    public void remove() {
        this.lista.remove(this.posicion + 1);
    }
    
}
