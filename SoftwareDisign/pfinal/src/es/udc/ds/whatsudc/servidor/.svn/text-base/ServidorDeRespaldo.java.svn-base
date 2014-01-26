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
public class ServidorDeRespaldo extends Decorador {
    
    public ServidorDeRespaldo(int capacidad, Ordenacion orden, Servidor servidor) {
        
        super(capacidad,orden,servidor);
    }
    
    @Override
    public void enviar(Mensaje m, Usuario a) throws OperacionNoPermitida, ServidorNoFuncional {
        try {
            super.enviar(m, a);
        } catch (ServidorNoFuncional ex) {
            if (!this.existeUsuario(a)) {
                this.estado.alta(a, this);
            }
            if (!this.existeUsuario(m.remitente())) {
                this.estado.alta(m.remitente(), this);
            }
            this.estado.enviar(m, a, this);
        }
        
    }
    
    @Override
    public Collection<Mensaje> mensajes(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional {
        try {
            return super.mensajes(p);
        } catch (ServidorNoFuncional ex) {
            
            return this.estado.mensajes(p, this);
        }
    }
    
    @Override
    public void alta(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional {
        try {
            super.alta(p);
        } catch (ServidorNoFuncional ex) {
            
            this.estado.alta(p, this);
        }
    }
    
    @Override
    public void baja(Usuario p) throws OperacionNoPermitida, ServidorNoFuncional {
        try {
            super.baja(p);
        } catch (ServidorNoFuncional ex) {
            
            this.estado.baja(p, this);
        }
    }
    
   
}
