package es.udc.ds.whatsudc.mensaje;

import es.udc.ds.whatsudc.cliente.Usuario;
import java.util.Date;

/**
 * La interfaz Mensaje define el API de los mensajes WhatsUDC.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */

public abstract class Mensaje {

    public abstract String contenido();

    public abstract int tamaño();

    public abstract Date fecha();

    public abstract Usuario remitente();

    public Mensaje añadeDecorador(Mensaje m) {
        return this;
    }
    
    public Mensaje eliminaDecorador(Mensaje m) {
        return this;
    }

}
