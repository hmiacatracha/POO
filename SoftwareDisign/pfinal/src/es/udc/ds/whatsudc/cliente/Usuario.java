package es.udc.ds.whatsudc.cliente;

import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;

/**
 * La interfaz Usuario define el API de los clientes WhatsUDC.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public abstract class Usuario {

    public abstract String identidad();

    public abstract boolean esDestinatario(Usuario u);
    
    public abstract boolean tieneGrupo(Usuario u);
    
    public void add(Usuario usuario) throws OperacionNoPermitida {
        
    }    
    
    public void remove(Usuario usuario) throws OperacionNoPermitida {
        
    }
    
    public Usuario getChild(int i) {
        return null;
    }

    
}
