/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 */
public class JuegoEspadas extends JuegoCartas {

    @Override
    public void repartirCartas(Jugador j1, Jugador j2, Mazo mazo) {
        int n = 0;
        do {
            for (int i = 0; i < 5; i++) {
                j1.setCarta(mazo.getCarta());
                j2.setCarta(mazo.getCarta());
                System.out.print(j1.getCarta(n).getNumero() + " " + j1.getCarta(n).getPalo());
                System.out.print("    ");
                System.out.println(j2.getCarta(n).getNumero() + " " + j2.getCarta(n).getPalo());
                n++;
            }
            System.out.println("-----------");
        } while (mazo.tamanoMazo() != 0);
    }

    @Override
    public Jugador analizarPuntuacion(Jugador j1, Jugador j2) {
        int nEsp1 = 0;
        int nEsp2 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0, j = 0; i < j1.getMano().size(); i++, j++) {
            if (j1.getCarta(i).getPalo().equalsIgnoreCase("espadas")) {
                nEsp1++;
                if (j1.getCarta(i).getNumero() > max1) {
                    max1 = j1.getCarta(i).getNumero();
                }
            }
            if (j2.getCarta(i).getPalo().equalsIgnoreCase("espadas")) {
                nEsp2++;
                if (j2.getCarta(i).getNumero() > max2) {
                    max2 = j2.getCarta(i).getNumero();
                }
            }
            if (j == 4 | j == 9 | j == 14 | j == 19) {
                if (nEsp1 > nEsp2) {
                    j1.ganaBaza();
                } else {
                    if (nEsp1 == nEsp2) {
                        if (nEsp1 != 0) {
                            if (max1 > max2) {
                                j1.ganaBaza();
                            } else {
                                j2.ganaBaza();
                            }
                        } else {
                            System.out.println("empatan a 0 espadas");
                        }
                    } else {
                        j2.ganaBaza();
                    }
                }
                //j = 0;
                nEsp1 = 0;
                nEsp2 = 0;
                max1 = 0;
                max2 = 0;
            }
        }
        if (j1.bazasGanadas() > j2.bazasGanadas()) {
            return j1;
        } else {
            if (j1.bazasGanadas() < j2.bazasGanadas()) {
                return j2;
            } else {
                return null;
            }
        }
    }
}
