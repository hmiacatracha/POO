/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.servidor;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;
import java.util.Collection;

/**
 *
 * @author UDC
 */
public interface Estado {

    public void alta(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional;

    public void enviar(Mensaje m, Usuario a, Servidor servidor) throws OperacionNoPermitida, ServidorNoFuncional;

    public Collection<Mensaje> mensajes(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional;

    public void baja(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional;

}
