package es.udc.ds.whatsudc.cliente;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.cliente.Persona;
import es.udc.ds.whatsudc.cliente.Grupo;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Esta clase contiene una serie de test de unidad básicos (codificados para
 * JUnit 4) que muestran el funcionamiento de algunas operaciones del sistema
 * WhatsUDC, en concreto del subsistema cliente.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */
public class ClienteTest {

    private Usuario lcastro;
    private Usuario cabrero;
    private Usuario paris;
    private Usuario mosqueira;
    Grupo grupo1;
    Grupo grupo2;

    @Before
    public void setUp() throws OperacionNoPermitida {


        cabrero = new Persona("cabrero");
        lcastro = new Persona("lcastro");
        paris = new Persona("javier.paris");
        mosqueira = new Persona("mosqueira");
        grupo1 = new Grupo("grupo");
        grupo2 = new Grupo("Grupo ds");

        grupo1.add(mosqueira);
        grupo1.add(lcastro);
        assertTrue(grupo1.esDestinatario(mosqueira));
        grupo1.remove(mosqueira);
        assertFalse(grupo1.esDestinatario(mosqueira));
    }

    @Test
    public void destinatarioPersona() {
        assertTrue(lcastro.esDestinatario(lcastro));
        assertFalse(cabrero.esDestinatario(paris));
        assertTrue(grupo1.tieneGrupo(lcastro));
    }
    
}