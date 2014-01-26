/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 */
public class Barometro {

    private double presion;
    
    
    public Barometro (double pres, String unidad) {
        if (unidad.equalsIgnoreCase("pascales")) {
            this.setPascales(pres);
        }
        else {
            if (unidad.equalsIgnoreCase("atmosferas")) {
                //this.presion=pres*(101325);
                this.setAtmosferas(pres);
            }
            else {
                if (unidad.equalsIgnoreCase("milibares")) {
                    //this.presion=pres*(100);
                    this.setMilibares(pres);
                   
                }
                else {
                    throw new IllegalArgumentException("LAS UNIDADES NO SON CORRECTAS");
                }    
            }
        }
    }
 
    public double getPascales () {
        return presion;
    }
    
    public double getMilibares () {
        return presion*0.01;
    }
    
    public double getAtmosferas () {
        return presion*0.00000987;
    }

    private void setPascales (double pres) {
        this.presion=pres;
    }
    
   private void setMilibares (double pres) {
        this.presion=pres*100;
    }
    
    private void setAtmosferas (double pres) {
        this.presion=pres*101325;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barometro other = (Barometro) obj;
        if (Double.doubleToLongBits(this.presion) != Double.doubleToLongBits(other.presion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.presion) ^ (Double.doubleToLongBits(this.presion) >>> 32));
        return hash;
    }
    
    
}
