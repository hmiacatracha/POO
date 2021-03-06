/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.*;

/**
 *
 */
public class Jugador {

    private List<Carta> mano;
    private int bGanadas;

    public Jugador() {
        this.mano = new ArrayList<Carta>();
        this.bGanadas = 0;
    }

    public void setCarta(Carta carta) {
        this.mano.add(carta);
    }
    
    public Carta getCarta(int n){
        return this.mano.get(n);
    }

    public List<Carta> getMano() {
        return this.mano;
    }

    public int bazasGanadas() {
        return this.bGanadas;
    }

    public void mostrarMano() {
        for (int i = 0; i < this.mano.size(); i++) {
            System.out.println(this.mano.get(i).getNumero() + " " + this.mano.get(i).getPalo() + " ");
        }
    }

    public void ganaBaza() {
        this.bGanadas = this.bGanadas + 1;
    }

    public void descartar() {
        this.mano.clear();
    }

    public void reset() {
        this.mano.clear();
        this.bGanadas = 0;
    }
}
