/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.mensaje;

import es.udc.ds.whatsudc.cliente.Usuario;
import java.util.Collection;

/**
 *
 * @author UDC
 */
public class Video extends Multimedia {

    private String nombre;

    public Video(Mensaje m, int size, String title) {
        super(m, size);

        this.nombre = title;
    }

    @Override
    public String contenido() {
        return super.contenido() + " Se ha adjuntado la video " + this.nombre;
    }

}
