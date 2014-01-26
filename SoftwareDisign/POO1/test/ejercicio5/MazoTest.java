/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author UDC
 */
public class MazoTest {

    public MazoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of barajar method, of class Mazo.
     */
    @Test
    public void QuitarYAgregarCarta() {
        Baraja b = new Baraja();
        Mazo m = b.barajar();
        Carta oro7 = new Carta(7, "Oros");
        Carta basto11 = new Carta(11, "Bastos");
        Carta oro5 = new Carta(5, "Oros");
        m.quitarCartas(oro7);
        m.quitarCartas(oro5);
        m.quitarCartas(basto11);
      
        assertFalse(m.buscarCarta(oro7));
        assertFalse(m.buscarCarta(oro5));
        assertFalse(m.buscarCarta(basto11));
        m.anadirCartas(oro7);
        m.anadirCartas(oro5);

        assertTrue(m.buscarCarta(oro7));
        assertFalse(m.buscarCarta(basto11));
        assertTrue(m.buscarCarta(oro5));
       
    }

    @Test(expected = IllegalArgumentException.class)
    public void AgregarCartaInvalidas() {

        Baraja b = new Baraja();
        Mazo m = b.barajar();
        Carta oros8 = new Carta(8, "Oros");
        Carta bastos9 = new Carta(9, "Bastos");
        Carta oros13 = new Carta(13, "Oros");
        m.anadirCartas(bastos9);
        m.anadirCartas(oros8);
        m.anadirCartas(oros13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void quitarCartasInvalidas() {

        Baraja b = new Baraja();
        Mazo m = b.barajar();
        Carta bastos9 = new Carta(9, "Bastos");
        m.quitarCartas(bastos9);
        assertFalse(m.buscarCarta(bastos9));



    }
}
