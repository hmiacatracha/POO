/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.udc.ds.whatsudc.cliente;

import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UDC
 */
public class Grupo extends Usuario {

    private String nombre;
    private List<Usuario> usuarios;

    public Grupo(String nombre) {
        this.nombre = nombre;
        usuarios = new ArrayList();
    }

    @Override
    public String identidad() {
        return nombre + "@udc.es";
    }

    @Override
    public boolean esDestinatario(Usuario u) {
        boolean resultado = false;
        for (Usuario hijo : usuarios) {
            if (hijo.esDestinatario(u)) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

   
    public void add(Usuario usuario) throws OperacionNoPermitida {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);  
        } else {
            throw new OperacionNoPermitida("Usuario ya en el grupo");
        }
    }


    public void remove(Usuario usuario) throws OperacionNoPermitida {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
        } else {
            throw new OperacionNoPermitida("Usuario no en el grupo");

        }
    }

    public Usuario getChild(int i){
        return usuarios.get(i);
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       	if (obj instanceof Grupo) {
	    Grupo p = (Grupo) obj;
	    return (this.nombre == p.nombre);
	} else {
	    return false;
	}
    }
    
    @Override
    public boolean tieneGrupo(Usuario p)
     {
        boolean resultado = false;
        for (Usuario hijo : usuarios) {
            if (hijo.tieneGrupo(p)) {
                resultado = true;
                break;
            }
        }
        return resultado;
     }
}
