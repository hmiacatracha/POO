/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.regex.Pattern;

/**
 *
 * @author HMIA
 */
public class Empresa extends Cliente {

    private static final Pattern cifPattern = Pattern.compile("[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]");
    private int numeroEmpleados;

    /**
     *
     * @param cif
     * @param nombre Nombre del la empresa
     * @param domicilio Domicilio
     * @param n Numero de empleados
     */
    public Empresa(String cif, String nombre, String domicilio, int n) {
        super(cif, nombre, domicilio);
            this.numeroEmpleados = n;
    }

    /**
     *
     * @return Plazo
     */
    @Override
    public int getPlazo() {
        return 3;
    }

    /**
     *
     * @param cif
     * @return True si el CIF cumple el patron FALSE en caso contrario.
     */
    public static boolean validateCif(String cif) {
        try {
            if (cifPattern.matcher(cif).matches()) {
                return true;
            }
        } catch (IdfNoValidoExcepcion e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

  
    /**
     * @return the numeroEmpleados
     */
    public int getNumeroEmpleados() {
        return this.numeroEmpleados;
    }

}
