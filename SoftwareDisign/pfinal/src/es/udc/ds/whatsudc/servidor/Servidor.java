package es.udc.ds.whatsudc.servidor;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.util.Ordenacion;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La interfaz Servidor define el API de los servidores WhatsUDC.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public abstract class Servidor {

    protected Map<Usuario, List<Mensaje>> mensajes;
    protected int capacidad;
    protected Ordenacion orden;
    protected Estado estado;

    public Servidor(int capacidad, Ordenacion orden) {
        this.mensajes = new HashMap<Usuario, List<Mensaje>>();
        this.capacidad = capacidad;
        this.orden = orden;
        this.estado = new EstadoNormal();

    }

    public abstract void alta(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional;

    public abstract void enviar(Mensaje m, Usuario a) throws OperacionNoPermitida, ServidorNoFuncional;

    public abstract Collection<Mensaje> mensajes(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional;

    public abstract void baja(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional;

    public void apagarServidor() throws OperacionNoPermitida, ServidorNoFuncional {
        this.estado = new EstadoMantenimiento();
    }

    public void encenderServidor() throws OperacionNoPermitida, ServidorNoFuncional {
        this.estado = new EstadoNormal();
    }

    Map obtenerMensajes() {
        return mensajes;
    }

    int getCapacidad() {
        return capacidad;
    }

    void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    Ordenacion getOrden() {
        return orden;
    }

    void setOrden(Ordenacion orden) {
        this.orden = orden;
    }

    void cambiarEstado(Estado estado) throws OperacionNoPermitida {

        this.estado = estado;
    }

    boolean existeUsuario(Usuario u) {
        return this.mensajes.containsKey(u);
    }
}
