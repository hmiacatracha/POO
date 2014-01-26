package es.udc.ds.whatsudc.servidor;

import java.util.List;
import es.udc.ds.whatsudc.cliente.Usuario;
import es.udc.ds.whatsudc.cliente.Persona;
import es.udc.ds.whatsudc.mensaje.Mensaje;
import es.udc.ds.whatsudc.mensaje.Texto;
import es.udc.ds.whatsudc.servidor.Servidor;
import es.udc.ds.whatsudc.servidor.ServidorSimple;
import es.udc.ds.whatsudc.util.OrdenacionPorFecha;
import es.udc.ds.whatsudc.util.excepciones.OperacionNoPermitida;
import es.udc.ds.whatsudc.util.excepciones.ServidorNoFuncional;

//import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Esta clase contiene una serie de test de unidad básicos (codificados para JUnit 4) que muestran
 * el funcionamiento de algunas operaciones del sistema WhatsUDC, en concreto del subsistema
 * de servidores.
 *
 * @author Equipo de desarrollo original de WhatsUDC
 */

public class ServidorTest {

    private Usuario lcastro;
    private Usuario paris;
    private String saludo;
    private String respuesta;
    private String despedida;
    private Mensaje ping;
    private Mensaje pong;
    private Mensaje pang;

    private Servidor fic;

    @Before
    public void setUp() throws MalformedURLException, OperacionNoPermitida {
	lcastro = new Persona("lcastro");
	paris = new Persona("javier.paris");
	saludo = "Hey, ¿puedes avisar en DS que voy a llegar un poco tarde hoy? Estoy atrapada en el atasco de Alfonso Molina";
	respuesta = "Sí, ya les aviso, no te preocupes!";
	despedida = "Ok, hasta ahora!";
	ping = new Texto(saludo, lcastro);
	pong = new Texto(respuesta, paris);
	pang = new Texto(despedida, paris);

	fic = new ServidorSimple(200, new OrdenacionPorFecha());
    }

    @Test(expected=OperacionNoPermitida.class)
    public void altaDuplicada() throws OperacionNoPermitida, ServidorNoFuncional {
	fic.alta(paris);
	fic.alta(paris);
    }

    @Test
    public void envío() throws ServidorNoFuncional {
	try {
	    fic.alta(lcastro);
	    fic.alta(paris);
	    fic.enviar(ping, paris);
	    Collection<Mensaje> expected = new ArrayList<Mensaje>();
	    expected.add(ping);
	    assertEquals(expected, fic.mensajes(paris));
	    expected.clear();
	    fic.enviar(pong, lcastro);
	    fic.enviar(pang, lcastro);
	    expected.add(pong);
	    expected.add(pang);
	    assertEquals(expected, fic.mensajes(lcastro));
	} catch (OperacionNoPermitida e) {
	    fail("La operación sí es válida.");
	}
    }

    @Test(expected=OperacionNoPermitida.class)
    public void envíoSinAlta() throws OperacionNoPermitida, ServidorNoFuncional {
	fic.enviar(ping, paris);
    }

    @Test(expected=OperacionNoPermitida.class)
    public void envíoSinDestinatario() throws OperacionNoPermitida, ServidorNoFuncional {
	fic.alta(lcastro);
	fic.enviar(ping, paris);
    }

    @Test(expected=OperacionNoPermitida.class)
    public void recepcionSinAlta() throws OperacionNoPermitida, ServidorNoFuncional {
	fic.mensajes(lcastro);
    }
    
    
    @Test
    public void testEstadoMantenimiento() throws OperacionNoPermitida, ServidorNoFuncional {
	boolean exito = false;
        Persona personaLocal = new Persona("personaLoal");
        fic.apagarServidor();
        try{
            fic.alta(personaLocal);
        } catch (ServidorNoFuncional e) {
            exito = true;
        }
        assertTrue(exito);
        
        fic.encenderServidor();
        
        try{
            fic.alta(personaLocal);
            fic.baja(personaLocal);
        } catch (ServidorNoFuncional e) {
            exito = false;
        }
        assertTrue(exito);
        
    }
    
    @Test
    public void testColapsarServidor() throws OperacionNoPermitida, ServidorNoFuncional{
        Servidor colapsado = new ServidorSimple(5, new OrdenacionPorFecha());
        colapsado.alta(paris);
        colapsado.alta(lcastro);
        String textoMensaje = "aaaaa"; // 5 letras
        Mensaje mensaje = new Texto(textoMensaje, paris);
        colapsado.enviar(mensaje, lcastro);
        //Ahora mismo el servidor esta a su maxima capacidad
        boolean exito = false;
        try{
            colapsado.enviar(mensaje, lcastro);
        } catch (ServidorNoFuncional e) {
            exito = true;
        }
        assertTrue(exito);
    }
    
    @Test
    public void testServidorRespaldo() throws OperacionNoPermitida, ServidorNoFuncional {
        Servidor respaldado = new ServidorSimple(200, new OrdenacionPorFecha());
        
        Servidor respaldo = new ServidorDeRespaldo(200, new OrdenacionPorFecha(), respaldado);
        
        Servidor ultimoRespaldo = new ServidorDeRespaldo(200, new OrdenacionPorFecha(), respaldo);
        
        ultimoRespaldo.alta(paris);
        ultimoRespaldo.alta(lcastro);
        
        ultimoRespaldo.enviar(ping, paris);
        
        respaldado.apagarServidor();
        
        ultimoRespaldo.enviar(ping, paris);        
        
        respaldo.apagarServidor();
        
        ultimoRespaldo.enviar(ping, paris);  
        
        ultimoRespaldo.apagarServidor();
        
        boolean exito = false;
        try{
            ultimoRespaldo.enviar(ping, paris);
        } catch (ServidorNoFuncional e) {
            exito = true;
        }
        assertTrue(exito);
        
    }
    
    
    @Test
    public void testIntervencion() throws OperacionNoPermitida, ServidorNoFuncional {
        List <String> palabrasIntervenidas = new ArrayList();
        palabrasIntervenidas.add("atasco");
        Servidor servidorSimple = new ServidorSimple(200, new OrdenacionPorFecha());
        Servidor servidorFiltro = new ServidorIntervenido(200, new OrdenacionPorFecha(), palabrasIntervenidas, servidorSimple);
        
        servidorFiltro.alta(paris);
        servidorFiltro.alta(lcastro);
        
        servidorFiltro.enviar(ping, lcastro);
        
        // El mensaje se ha filtrado porque tiene la palabra "atasco"
        assertEquals(servidorFiltro.mensajes(lcastro).size(), 0);
        
        
        servidorFiltro.enviar(pong, lcastro);
        
        // El mensaje se ha filtrado porque tiene la palabra "atasco"
        assertEquals(servidorFiltro.mensajes(lcastro).size(), 1);
        
    }

}

