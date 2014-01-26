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
public class Foto extends Multimedia {


    private String nombre;

    public Foto(Mensaje m, int size, String title) {
        super(m,size);
        this.nombre = title;
    }

    @Override
    public String contenido() {
        return super.contenido() + " Se ha adjuntado la foto " + this.nombre;
    }

}
