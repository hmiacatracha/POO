/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 */
public abstract class JuegoCartas {

    public abstract void repartirCartas(Jugador j1, Jugador j2, Mazo mazo);

    public abstract Jugador analizarPuntuacion(Jugador j1, Jugador j2);

    public String jugar(Jugador j1, Jugador j2) {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.barajar();
        repartirCartas(j1, j2, mazo);
        Jugador aux = analizarPuntuacion(j1, j2);
        if (aux == j1) {
            return "El jugador 1 ha ganado";
        } else {
            if (aux == j2) {
                return "El jugador 2 ha ganado";
            } else {
                return "Se ha producido un empate";
            }
        }
    }
}
