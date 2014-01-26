package es.udc.ds.whatsudc.servidor;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.util.Ordenacion;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;
import java.util.Collection;

/**
 * La clase ServidorSimple contiene una implementación concreta de la interfaz
 * Servidor.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public class ServidorSimple extends Servidor {

  
   

    public ServidorSimple(int capacidad, Ordenacion orden) {
        super(capacidad,orden);
       
    }

    @Override
    public void alta(Usuario u) throws OperacionNoPermitida,ServidorNoFuncional {
        this.estado.alta(u, this);
    }



    

    @Override
    public void enviar(Mensaje m, Usuario a) throws OperacionNoPermitida,ServidorNoFuncional {
        this.estado.enviar(m, a, this);
    }

    @Override
    public Collection<Mensaje> mensajes(Usuario u) throws OperacionNoPermitida,ServidorNoFuncional {
        return this.estado.mensajes(u, this);
    }

    @Override
    public void baja(Usuario u) throws OperacionNoPermitida,ServidorNoFuncional {
        this.estado.baja(u, this);
    }
  
}
