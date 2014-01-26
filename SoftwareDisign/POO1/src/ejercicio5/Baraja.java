/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.*;

/**
 *
 */
public class Baraja {

    private final List<Carta> baraja;

    public Baraja() {

        String[] p = {"oros", "bastos", "espadas", "copas"};
        int[] n = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        List<Carta> listaCartas = new ArrayList<Carta>();

        for (String palo : p) {
            for (int numero : n) {
                listaCartas.add(new Carta(numero, palo));
            }
        }
        this.baraja = listaCartas;

    }
    public Mazo barajar() {
        List<Carta> listaMazo = new ArrayList<Carta>(this.baraja);
        Mazo mazo = new Mazo(listaMazo);
        mazo.barajar();
        return mazo;

    }
    public Carta mostrar(int n) {
        return baraja.get(n);
    }
    public int getNumeroCartas() {
        return baraja.size();
    }

}/*FIN DE CLASE*/
