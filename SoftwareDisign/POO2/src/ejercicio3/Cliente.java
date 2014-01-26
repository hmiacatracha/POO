/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author HMIA
 */
public abstract class Cliente {

    private String nombre;
    private String domicilio;
    private String id;
    
    public Cliente(String id, String nombre, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;

    }

    public abstract int getPlazo();  
    
    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public String getId() {
        return this.id;
    }

    void setId(String i) {
        this.id = i;
    }

    void setNombre(String n) {
        this.nombre = n;
    }

    void setDomicilio(String d) {
        this.domicilio = d;
    }
}
