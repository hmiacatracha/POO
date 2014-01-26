package es.udc.ds.whatsudc.cliente;

import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;

/**
 * La clase Persona implementa una especialización de Usuario.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public class Persona extends Usuario {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String identidad() {
        return nombre + "@udc.es";
    }

    @Override
    public boolean esDestinatario(Usuario u) {
        return this.equals(u);
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (o instanceof Persona) {
            Persona p = (Persona) o;
            return (this.nombre.equals(p.nombre));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean tieneGrupo(Usuario u) {
        return this.equals(u);
    }


   
}
