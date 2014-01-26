/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.*;

/**
 *
 * @author HMIA
 */
public class Tablero {

    private Pieza[][] tablero;

    public Tablero() {
        tablero = new Pieza[8][8];
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 8; col++) {
                this.tablero[fil][col] = null;
            }
        }
    }

    public Pieza getPieza(Posicion p) {
        return this.tablero[p.getFila()][p.getColumna()];
    }

    private void iniciarTorres() {
        this.tablero[0][0] = new Pieza(Pieza.Tipo.TORRE, Pieza.Color.BLANCO);
        this.tablero[0][7] = new Pieza(Pieza.Tipo.TORRE, Pieza.Color.BLANCO);
        this.tablero[7][0] = new Pieza(Pieza.Tipo.TORRE, Pieza.Color.NEGRO);
        this.tablero[7][7] = new Pieza(Pieza.Tipo.TORRE, Pieza.Color.NEGRO);

    }

    private void iniciarCaballos() {
        this.tablero[0][1] = new Pieza(Pieza.Tipo.CABALLO, Pieza.Color.BLANCO);
        this.tablero[0][6] = new Pieza(Pieza.Tipo.CABALLO, Pieza.Color.BLANCO);
        this.tablero[7][1] = new Pieza(Pieza.Tipo.CABALLO, Pieza.Color.NEGRO);
        this.tablero[7][6] = new Pieza(Pieza.Tipo.CABALLO, Pieza.Color.NEGRO);
    }

    private void iniciarAlfiles() {
        this.tablero[0][2] = new Pieza(Pieza.Tipo.ALFIL, Pieza.Color.BLANCO);
        this.tablero[0][5] = new Pieza(Pieza.Tipo.ALFIL, Pieza.Color.BLANCO);
        this.tablero[7][2] = new Pieza(Pieza.Tipo.ALFIL, Pieza.Color.NEGRO);
        this.tablero[7][5] = new Pieza(Pieza.Tipo.ALFIL, Pieza.Color.NEGRO);
    }

    private void iniciarRealeza() {
        this.tablero[0][3] = new Pieza(Pieza.Tipo.REY, Pieza.Color.BLANCO);
        this.tablero[0][4] = new Pieza(Pieza.Tipo.DAMA, Pieza.Color.BLANCO);
        this.tablero[7][3] = new Pieza(Pieza.Tipo.REY, Pieza.Color.NEGRO);
        this.tablero[7][4] = new Pieza(Pieza.Tipo.DAMA, Pieza.Color.NEGRO);
    }

    private void iniciarPeones() {

        for (int col = 0; col < this.tablero.length; col++) {
            this.tablero[1][col] = new Pieza(Pieza.Tipo.PEON, Pieza.Color.BLANCO);
            this.tablero[6][col] = new Pieza(Pieza.Tipo.PEON, Pieza.Color.NEGRO);
        }
    }

    public void iniciarPartida() {
        iniciarTorres();
        iniciarCaballos();
        iniciarAlfiles();
        iniciarRealeza();
        iniciarPeones();
    }
    /*
     * Agrega a un StringBuilder la representación de una pieza dependiendo su color. Esto ayuda a la funcion toString();
     */

    private void agregarLetraPieza(StringBuilder s, char letra, Pieza.Color color) {
        char representacion = letra;
        switch (color) {
            case NEGRO:
                representacion = Character.toLowerCase(letra);
                break;
            case BLANCO:
                representacion = Character.toUpperCase(letra);
                break;
        }
        s.append(representacion);
    }

    @Override
    public String toString() {
        int cont;
        StringBuilder s = new StringBuilder(64);

        for (int fil = 0; fil < 8; fil++) {
            cont = 0;
            for (int col = 0; col < 8; col++) {
                if (this.tablero[fil][col] == null) {
                    cont++; /*Cuanta las posiciones que no tienen pieza*/
                } else {
                    if (cont > 0) {
                        /*Cuando tienes que añadir una letra al string añades antes el salto con respecto a la pieza anterior*/
                        s.append(cont);
                        cont = 0;
                    }
                    switch (this.tablero[fil][col].getTipo()) {
                        case TORRE:
                            agregarLetraPieza(s, 't', this.tablero[fil][col].getColor());
                            break;
                        case CABALLO:
                            agregarLetraPieza(s, 'c', this.tablero[fil][col].getColor());
                            break;
                        case ALFIL:
                            agregarLetraPieza(s, 'a', this.tablero[fil][col].getColor());
                            break;
                        case REY:
                            agregarLetraPieza(s, 'r', this.tablero[fil][col].getColor());
                            break;
                        case DAMA:
                            agregarLetraPieza(s, 'd', this.tablero[fil][col].getColor());
                            break;

                        case PEON:
                            agregarLetraPieza(s, 'p', this.tablero[fil][col].getColor());
                            break;
                    }

                }
            }
            if (cont == 8) {
                s.append(cont); /*Caso especial la fila no tiene ninguna pieza */
            }
            s.append("/");
        }
        return s.toString();
    }

    public List<Posicion> buscarPiezas(Pieza.Tipo t) {
        List<Posicion> listaP = new ArrayList<Posicion>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.tablero[i][j] != null) {
                    if (this.tablero[i][j].getTipo() == t) {
                        listaP.add(new Posicion(i, j));
                    }
                }
            }

        }
        return listaP;
    }

    /**
     *
     * @param o Origen
     * @param d Destino
     */
    public void mover(Posicion o, Posicion d) {
        try {
            if (this.tablero[o.getFila()][o.getColumna()] == null) {
                throw new IllegalArgumentException("En la posicion origen no hay ninguna pieza");
            } else {
                this.tablero[d.getFila()][d.getColumna()] = this.tablero[o.getFila()][o.getColumna()];
                this.tablero[o.getFila()][o.getColumna()] = null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Posicion origen o destino inexistente");
        }
    }
}
