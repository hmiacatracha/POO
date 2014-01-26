/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 */
public class UtilidadesString {

    /**
     * Este metodo cuenta los caracteres de una cadena
     * @param cadena la cadena de la que queremos saber la longitud
     * @return longitud de la cadena
     */
    public static int longitud(String cadena) {
        return cadena.length();
    }

    /**
     * Este metodo cuenta las vocales de una cadena
     * @param cadena la cadena de la que queremos saber el numero de vocales
     * @return numero de vocales
     */
    public static int contarVocales(String cadena) {
        int cont = 0;
        String cadenaMay = cadena.toUpperCase();
        char v[] = {'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < UtilidadesString.longitud(cadena); i++) {
            for (int j = 0; j < v.length; j++) {
                if (cadenaMay.charAt(i) == v[j]) {
                    cont++;
                }
            }
        }
        return cont;
    }//FIN CONTAR VOCALES
   
    /**
     * Este metodo cuenta el numero de veces que aparece un caracter en la cadena
     * @param cadena la cadena de la que queremos saber las veces que aparece el caracter
     * @param l caracter del que queremos saber las veces que está en la cadena
     * @return numero de veces que aparece el caracter en la cadena
     */
    public static int contar(String cadena, char l) {
        int cont = 0;
        for (int i = 0; i < UtilidadesString.longitud(cadena); i++) {
            if (cadena.charAt(i) == l) {
                cont++;
            } else {
                cont += 0;
            }
        }
        return cont;
    }//FIN CONTAR

}//FIN CLASE
