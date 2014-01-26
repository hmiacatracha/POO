package es.udc.ds.whatsudc.util;

import es.udc.ds.whatsudc.mensaje.Mensaje;

import java.util.Comparator;

/**
 * La interfaz Ordenacion define el API de los algoritmos de ordenación de mensajes WhatsUDC.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */

public interface Ordenacion extends Comparator<Mensaje> {

    public int compare(Mensaje o1, Mensaje o2);

}
