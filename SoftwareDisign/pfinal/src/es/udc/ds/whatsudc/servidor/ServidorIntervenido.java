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
import java.util.List;

/**
 *
 * @author UDC
 */
public class ServidorIntervenido extends Decorador {

    private List<String> palabrasIntervenidas; //[] = {"descarga", "party", "huelga"};

    public ServidorIntervenido(int capacidad, Ordenacion orden, List<String> palabrasIntervenidas, Servidor servidor) {
        super(capacidad, orden, servidor);
        this.palabrasIntervenidas = palabrasIntervenidas;
    }

    @Override
    public void enviar(Mensaje m, Usuario a) throws OperacionNoPermitida, ServidorNoFuncional {
        boolean mensajePermitido = comprobarPalabras(m);
        try {
            if (mensajePermitido) {
                super.enviar(m, a);
            }

        } catch (ServidorNoFuncional ex) {
            if (mensajePermitido) {
                if (!this.existeUsuario(a)) {
                    this.estado.alta(a, this);
                }
                if (!this.existeUsuario(m.remitente())) {
                    this.estado.alta(m.remitente(), this);
                }
                this.estado.enviar(m, a, this);
            }
        }

    }

    private boolean comprobarPalabras(Mensaje m) {
        for (String palabra : palabrasIntervenidas) {
            if (m.contenido().contains(palabra)) {
                return false;
            }
        }

        return true;
    }
}
