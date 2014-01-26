/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author HMIA
 */
public class Contabilidad {

    private List<Factura> listFactura;

    public Contabilidad() {
        this.listFactura = new LinkedList<Factura>();
    }

    public boolean incluirFactura(Factura f) {
        boolean add = listFactura.add(f);
        return add;
    }
    public String procesarFacturas() {
        StringBuilder s = new StringBuilder();
        for(Factura f:listFactura){
            s.append(" ");
            s.append(f.Facturar());
            s.append(" ");
            String g=String.valueOf(f.getCliente().getPlazo());
            s.append(g);
        }
        return s.toString();
    }
    /**
     *
     * @param c cliente
     */
    public void eliminarFacturas(Cliente c) {  
      for (Factura f : listFactura){
          if(f.getCliente().equals(c)){
              listFactura.remove(f);
          }
      }  
    }

    /**
     * @return the factura
     */
    public List<Factura> getFactura() {
        return Collections.unmodifiableList(listFactura);
    }
}
