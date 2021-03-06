/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 */
public class Persona {
    
    private final String dni;
    
    public Persona(String dniI) {
        int numero = Integer.parseInt(dniI.substring(0, 8));

        if (Persona.utilidad(numero).equals(dniI.substring(8))) {
            this.dni=dniI;
        } else {
            throw new IllegalArgumentException("EL DNI NO ES CORRECTO");
        }
    }

    /**
     * Este metodo devuelve la letra correspondiente a un dni
     * @param numero los digitos del dni 
     * @return letra del dni introducido
     */    
    public static String utilidad(int numero) {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int i = numero % 23;
        String letra = letras[i];
        return letra;
    }
    
    public String mostrar () {
        return this.dni;
    }
    
}

