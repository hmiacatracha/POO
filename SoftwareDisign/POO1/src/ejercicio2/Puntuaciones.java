/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 */
public class Puntuaciones {

    private static String[] pelis = {"The Artist", "Hugo", "Biutiful", "Drive", "X-Men", "Torrente 4"};
    private static int punt[][] = {{5, 1, 3, 2, 5}, {4, 2, 4, 2, 4}, {3, 2, 3, 5, 2}, {3, 3, 1, 3, 5}, {1, 4, 2, 2, 1}, {2, 5, 3, 4, 2}};
    private static double media;

    static double calificacionPelicula(String pelicula) {
        media=0.0;
        for (int k = 0; k < pelis.length; k++) {
            if (pelis[k].equals(pelicula)) {
                for (int j = 0; j < punt[k].length; j++) {
                    media = media + punt[k][j];
                }
                media = (media / punt[k].length);
            }
        }
        return media;
    }
}

