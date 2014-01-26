package es.udc.ds.whatsudc.mensaje;

import es.udc.ds.whatsudc.cliente.Usuario;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * La clase Texto contiene una implementación concreta de la interfaz Mensaje.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public class Texto extends Mensaje {

    private String texto;
    private Date timeStamp;
    private Usuario remitente;

    public Texto(String texto, Usuario remitente) {
        this.texto = texto;
        this.remitente = remitente;
        this.timeStamp = new Date();
    }

    @Override
    public String contenido() {
        Calendar c = new GregorianCalendar(); 
        c.setTime(timeStamp); 
        return "[" + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + "] " + remitente.identidad() + " dice: " + texto;

    }

    @Override
    public int tamaño() {
        return texto.length();
    }

    @Override
    public Date fecha() {
        return timeStamp;
    }

    @Override
    public Usuario remitente() {
        return remitente;
    }

}
