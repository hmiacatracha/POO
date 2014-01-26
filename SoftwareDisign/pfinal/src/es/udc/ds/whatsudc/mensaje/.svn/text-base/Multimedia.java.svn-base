/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.mensaje;

import es.udc.ds.whatsudc.cliente.Usuario;
import java.util.Date;

/**
 *
 * @author UDC
 */
public abstract class Multimedia extends Mensaje {

    private Mensaje decorado;
    private int tamaño;

    public Multimedia(Mensaje multimedia, int tamaño) {
        this.decorado = multimedia;
        this.tamaño = tamaño;
    }

    @Override
    public String contenido() {

        return decorado.contenido();
    }

    @Override
    public int tamaño() {
        return decorado.tamaño()+tamaño;
    }

    @Override
    public Date fecha() {
        return decorado.fecha();
    }

    @Override
    public Usuario remitente() {
        return decorado.remitente();
    }

    @Override
    public Mensaje eliminaDecorador(Mensaje m) {
        if(m == this) {
            return decorado;
        } else {
            decorado = decorado.eliminaDecorador(m);
        }
        return decorado;
    }
    
    @Override
    public Mensaje añadeDecorador(Mensaje m) {
        if (m instanceof Multimedia) {
            Multimedia multimedia = (Multimedia) m;
            multimedia.cambiarDecorado(decorado);
            decorado = m;            
        }
        return this;
    }
    
    protected void cambiarDecorado(Mensaje m) {
        decorado = m;
    }

}
