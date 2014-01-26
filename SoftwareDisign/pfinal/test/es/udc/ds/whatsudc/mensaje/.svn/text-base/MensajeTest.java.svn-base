package es.udc.ds.whatsudc.mensaje;

import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.cliente.Persona;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.mensaje.Texto;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Date;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Esta clase contiene una serie de test de unidad básicos (codificados para JUnit 4) que muestran
 * el funcionamiento de algunas operaciones del sistema WhatsUDC, en concreto del subsistema
 * de mensajes.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */

public class MensajeTest {

    private Usuario lcastro;
    private Usuario cabrero;
    private String saludo;
    private Mensaje texto;

    @Before
    public void setUp() throws MalformedURLException {
	lcastro = new Persona("lcastro");
	cabrero = new Persona("cabrero");
	saludo = new String("Hola, ¿qué tal la clase de DS de hoy?");
	texto = new Texto(saludo, lcastro);
    }

    @Test
    public void contenidos() {
	Date now = new Date();
	assertEquals("["+ now.getHours() + ":" + now.getMinutes() +"] " + texto.remitente().identidad() +" dice: " + saludo, texto.contenido());
    }

    @Test
    public void tamaños() {
	assertEquals(saludo.length(), texto.tamaño());
    }

    @Test
    public void remitentes() {
	assertEquals(lcastro, texto.remitente());
    }
    
    @Test
    public void testDecorador() {
        String textoMensaje = "hola";
        int tamañoFoto = 5;
        String tituloFoto = "Titulo foto";
        Date now = new Date();
	Mensaje m = new Foto(new Texto(textoMensaje, cabrero), tamañoFoto, tituloFoto);

        assertEquals("["+ now.getHours() + ":" + now.getMinutes() +"] " + m.remitente().identidad() +" dice: " + textoMensaje + " Se ha adjuntado la foto " + tituloFoto, m.contenido());
        assertEquals(textoMensaje.length() + tamañoFoto, m.tamaño());
    }
    
}
