/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *

 */
final public class Pieza {

    private final Tipo tipo;
    private final Color color;

    public Pieza(Tipo t, Color c) {
        this.tipo = t;
        this.color = c;
    }

    Tipo getTipo() {
        return tipo;
    }

    Color getColor() {
        return color;
    }
/*
 * Los enum van dentro de la clase pieza porque dependen de ella directamente.
 */
    public enum Tipo {

        REY, DAMA, ALFIL, CABALLO, TORRE, PEON
    };

    public enum Color {

        NEGRO, BLANCO
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pieza other = (Pieza) obj;
        if (this.tipo != other.tipo) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        hash = 59 * hash + (this.color != null ? this.color.hashCode() : 0);
        return hash;
    }
    
    
}
