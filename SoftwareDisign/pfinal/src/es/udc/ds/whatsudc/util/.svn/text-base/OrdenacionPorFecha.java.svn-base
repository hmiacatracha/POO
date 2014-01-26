package es.udc.ds.whatsudc.util;

import es.udc.ds.whatsudc.mensaje.Mensaje;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

/**
 * La clase OrdenacionPorFecha contiene una implementación concreta de la interfaz Ordenacion.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */

public class OrdenacionPorFecha implements Ordenacion {

    @Override
    public int compare(Mensaje o1, Mensaje o2) {
	Date d1 = o1.fecha();
	Date d2 = o2.fecha();
	return d1.compareTo(d2);
    }

}
