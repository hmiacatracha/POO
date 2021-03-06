/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 */
public class JuegoCartaMasAlta extends JuegoCartas{

    @Override
    public void repartirCartas(Jugador j1, Jugador j2, Mazo mazo) {
        int n = 0;
        System.out.println("J1   J2");
        do{
        j1.setCarta(mazo.getCarta());
        j2.setCarta(mazo.getCarta());
        System.out.print(j1.getCarta(n).getNumero());
        System.out.print("    ");
        System.out.println(j2.getCarta(n).getNumero());
        n++; 
        } while(mazo.tamanoMazo() != 0);
    }

    @Override
    public Jugador analizarPuntuacion(Jugador j1, Jugador j2) {
        for (int i = 0 ; i<j1.getMano().size(); i++) {
            if (j1.getCarta(i).getNumero() > j2.getCarta(i).getNumero()) {
                j1.ganaBaza();
            } else {
                if (j1.getCarta(i).getNumero() < j2.getCarta(i).getNumero()) {
                    j2.ganaBaza();
                }
            }
        }
        if (j1.bazasGanadas() > j2.bazasGanadas()){
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
