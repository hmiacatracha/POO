/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 */
public class Posicion {
    private int fila;
    private int columna;
    
    Posicion(int fila, int col){
    this.fila=fila;
    this.columna=col;
    }
    /**
     * @return the x
     */
    public int getFila() {
        return this.fila;
    }

    /**
     * @param x the x to set
     */
    public int getColumna() {
        return this.columna;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.fila;
        hash = 23 * hash + this.columna;
        return hash;
    }
    
    
}

