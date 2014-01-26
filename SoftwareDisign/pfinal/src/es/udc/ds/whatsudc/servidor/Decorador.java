/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.servidor;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.util.Ordenacion;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;
import java.util.Collection;

/**
 *
 * @author UDC
 */
public abstract class Decorador extends Servidor {

    private Servidor servidorDecorado; 

    public Decorador(int capacidad, Ordenacion orden, Servidor servidor) {
        super(capacidad, orden);
        this.servidorDecorado = servidor;
    }

    @Override
    public void alta(Usuario p) throws OperacionNoPermitida,ServidorNoFuncional {

        servidorDecorado.alta(p);
    }

    @Override
    public void enviar(Mensaje m, Usuario a) throws OperacionNoPermitida,ServidorNoFuncional {

        servidorDecorado.enviar(m, a);
    }

    @Override
    public Collection<Mensaje> mensajes(Usuario p) throws OperacionNoPermitida,ServidorNoFuncional {

        return servidorDecorado.mensajes(p);
    }

    @Override
    public void baja(Usuario p) throws OperacionNoPermitida,ServidorNoFuncional {

        servidorDecorado.baja(p);
    }
}
