/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HMIA
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author heidy.izaguirre
 */
public class Factura {

    private Cliente cliente;
    private Date fecha;
    private String concepto;
    private Double precio;

    /**
     *
     * @param cliente
     * @param fechaFact
     * @param concepto
     * @param precio
     * @throws ParseException
     * @throws PrecioExcepcion
     */
    public Factura(Cliente cliente, String fechaFact, String concepto, Double precio) throws ParseException, PrecioExcepcion {
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd-MM-yy");
        this.fecha = formatter.parse(fechaFact);
        this.cliente = cliente;
        this.concepto = concepto;
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new PrecioExcepcion("Precio Incorrecto", precio);
        }

    }

    public String Facturar() {
        return " Fecha:" + getFecha() + " ID:" + getCliente().getId() + " Nombre:" + getCliente().getNombre() + " Dirección:" + getCliente().getDomicilio() + " Concepto:" + getConcepto() + " Precio:" + getPrecio();
    }

    /**
     * @return the Date
     */
    public String getFecha() {
        DateFormat formatter;
        formatter = new SimpleDateFormat("dd-MM-yy");
        return formatter.format(fecha);
    }

    /**
     * @return the Concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @return the Precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
}
