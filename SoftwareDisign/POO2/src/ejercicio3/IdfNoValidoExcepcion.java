/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author HMIA
 */
@SuppressWarnings("serial")
public class IdfNoValidoExcepcion extends Error{
    private String nie;
    public IdfNoValidoExcepcion(String mensaje,String nieincorrecto){
        super  (mensaje);
        nie=nieincorrecto;
}

    /**
     * @return the nie
     */
    public String getNie() {
        return nie;
    }

}
