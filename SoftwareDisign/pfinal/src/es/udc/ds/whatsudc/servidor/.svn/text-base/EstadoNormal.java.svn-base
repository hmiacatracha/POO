/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.servidor;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * @author UDC
 */
public class EstadoNormal implements Estado {

    @Override
    public void alta(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional {
        if (!servidor.obtenerMensajes().containsKey(p)) {
            servidor.obtenerMensajes().put(p, new ArrayList<Mensaje>());
        } else {
            throw new OperacionNoPermitida("Usuario ya registrado");
        }
    }

    @Override
    public void enviar(Mensaje m, Usuario a, Servidor servidor) throws OperacionNoPermitida, ServidorNoFuncional {
        Collection<Mensaje> msjs;
        int capacidad = servidor.getCapacidad();
        Map<Usuario, List<Mensaje>> mensajes = servidor.obtenerMensajes();
        if (mensajes.containsKey(m.remitente())) {
            if (mensajes.containsKey(a)) {
                capacidad -= m.tamaño();
                if (capacidad >= 0) {
                    msjs = mensajes.get(a);
                    msjs.add(m);
                    servidor.setCapacidad(capacidad);
                } else {
                    servidor.cambiarEstado(new EstadoSaturado());
                    throw new ServidorNoFuncional("El Servidor se ha saturado");
                }


                servidor.setCapacidad(capacidad);
            } else {
                throw new OperacionNoPermitida("Destinatario no registrado");
            }
        } else {
            throw new OperacionNoPermitida("Remitente no registrado");
        }
    }

    @Override
    public Collection<Mensaje> mensajes(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional {
        int capacidad = servidor.getCapacidad();
        Map<Usuario, List<Mensaje>> mensajes = servidor.obtenerMensajes();

        if (mensajes.containsKey(p)) {
            List<Mensaje> msjs = mensajes.get(p);
            capacidad += calcularTamaño(msjs);
            mensajes.put(p, new ArrayList<Mensaje>());
            Collections.sort(msjs, servidor.getOrden());
            return msjs;
        } else {
            throw new OperacionNoPermitida("Destinatario no registrado");
        }
    }

    private int calcularTamaño(Collection<Mensaje> msjs) {
        int tamaño = 0;
        for (Mensaje m : msjs) {
            tamaño += m.tamaño();
        }
        return tamaño;
    }

    @Override
    public void baja(Usuario p, Servidor servidor) throws OperacionNoPermitida,ServidorNoFuncional {
        if (servidor.obtenerMensajes().containsKey(p)) {
            servidor.obtenerMensajes().remove(p);
        } else {
            throw new OperacionNoPermitida("Usuario no registrado");
        }
    }
}
