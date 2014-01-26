/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author HMIA
 */
public class Institucion extends Cliente {
    
    private TypeInstitucion tipoInst;
/**
 * 
 * @param id Identificador
 * @param nombre Nombre de la Institucion
 * @param domicilio Domicilio de la Institucion
 * @param tipoInst  Tipo de Institucion
 */
    Institucion(String id, String nombre, String domicilio, TypeInstitucion tipoInst) {
        super(id, nombre, domicilio);
        this.tipoInst=tipoInst;       
    }

    /**
     *
     * @return plazo
     */

    @Override
    public int getPlazo() {
        return 6;
    }
 
    /**
     *
     * @return tipo de Institucion.
     */
    public String getTipoInst(){
        return this.tipoInst.toString();
       
   }
   
}
 enum TypeInstitucion {
    LOCAL, AUTONOMICA, ESTATAL, EUROPEA
    
}
