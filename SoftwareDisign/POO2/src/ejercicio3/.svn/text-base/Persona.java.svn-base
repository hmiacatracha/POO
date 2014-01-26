/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HMIA
 */
public class Persona extends Cliente {
  
    private Date fechaNac;
    private static final Pattern patron = Pattern.compile("^(X(-|\\.)?0?\\d{7}(-|\\.)?[A-Z]|[A-Z](-|\\.)?\\d{7}(-|\\.)?[0-9A-Z]|\\d{8}(-|\\.)?[A-Z])$");
    //private static final Pattern patron=Pattern.compile("^(([A-Z]\\d{8})|(\\d{8}[A-Z]))|([A-Z]\\d{1})(\\d{7})$");

    /**
     *
     * @param nif NIF
     * @param nombre Nombre
     * @param domicilio Domicilio
     * @param fecha Fecha de nacimiento
     */
    Persona(String nif, String nombre, String domicilio, String fechaNac) throws ParseException {
        super(nif, nombre, domicilio);      
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd-MM-yy");
        this.fechaNac= formatter.parse(fechaNac);
    }

    /**
     *
     * @return
     */
    @Override
    public int getPlazo() {
        return 1;
    }

    /**
     *
     * @param nif
     * @return true si el dni cumple el patron y falso en caso contrario.
     * @throws NifNoValidoExcepcion
     */
    @SuppressWarnings("fallthrough")
    public static boolean nif(String dniI) {
        Matcher m = patron.matcher(dniI);
        boolean esnie = false;
        //Verificamos si cumple el patron
        try {
            if (m.matches()) {
                String v[] = {"X", "Y", "Z"};
                int numero = 0;
                String nie = dniI.substring(0, 1);
                //para cambiar la letra del nie por un numero  calcular la letra final
                for (int i = 0; i < 3; i++) {
                    if (nie.equals(v[i])) {
                        switch (i) {
                            case 0:
                                numero = Integer.parseInt("0" + dniI.substring(1, 8));
                                esnie = true;
                                break;
                            case 1:
                                numero = Integer.parseInt("1" + dniI.substring(1, 8));
                                esnie = true;
                                break;
                            case 2:
                                numero = Integer.parseInt("2" + dniI.substring(1, 8));
                                esnie = true;
                                break;
                        }
                    }

                }
                if (!esnie) {
                    numero = Integer.parseInt(dniI.substring(0, 8));
                }
                if (Persona.utilidad(numero).equals(dniI.substring(8))) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (IdfNoValidoExcepcion e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    public static String utilidad(int numero) {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int i = numero % 23;
        String letra = letras[i];
        return letra;
    }

    /**
     *
     * @return Fecha de Nacimiento
     */
    public String getFechaNac() {
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd-MM-yy");
        return formatter.format(fechaNac);
    }
}
