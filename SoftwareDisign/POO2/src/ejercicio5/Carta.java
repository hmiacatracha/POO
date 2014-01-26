/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 */
public class Carta {

    private final int numero;
    private final String palo;

    public Carta(int numero, String palo) {
        if ((numero >= 1) & (numero != 9) & (numero != 8) & (numero <= 12)) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("EL Nº DE LA CARTA NO ES CORRECTO");
        }
        if (palo.equalsIgnoreCase("oros") | palo.equalsIgnoreCase("bastos") | 
                palo.equalsIgnoreCase("espadas") | palo.equalsIgnoreCase("copas")){
            this.palo = palo;            
        } else {
            throw new IllegalArgumentException("EL PALO NO ES CORRECTO");
        }
    }
    public int getNumero(){
        return numero;
    }
    public String getPalo(){
        return palo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.numero;
        hash = 53 * hash + (this.palo != null ? this.palo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.palo == null) ? (other.palo != null) : !this.palo.equals(other.palo)) {
            return false;
        }
        return true;
    }

    
}
