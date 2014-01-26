/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.*;

/**
 *
 * @author Fati
 */
public class Mazo {

    private List<Carta> mazo;

    public Mazo(List<Carta> lista) {
        this.mazo = new ArrayList<Carta>(lista);
    }

    public void mostrarMazo() {
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(this.mazo.get(i).getNumero() + " " + this.mazo.get(i).getPalo() + " " + i);
            System.out.println("");
        }

    }

    public void quitarCartas(Carta carta)  {
            this.mazo.remove(carta);        
            
    }

    public void anadirCartas(Carta carta){
        if (!this.buscarCarta(carta)) {
            this.mazo.add(carta);
        }
    }

    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    public boolean buscarCarta(Carta c) {
        return mazo.contains(c);
    }
}
