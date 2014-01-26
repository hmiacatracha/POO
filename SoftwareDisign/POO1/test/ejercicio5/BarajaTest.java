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

 */
public class BarajaTest {

    public BarajaTest() {
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
     * Test of Barajar method, of class Baraja.
     */
    @Test
    public void testConstructorBaraja() {
        Baraja baraja = new Baraja();
        int numeroCartas = baraja.getNumeroCartas();
        assertEquals(40, numeroCartas);
    }

    /**
     * Test of mostrar method, of class Baraja.
     */
    @Test
    public void testVerificarCartas() {
        Baraja baraja = new Baraja();
        Carta carta = baraja.mostrar(0);
        assertEquals(1, carta.getNumero(), 0.000001);
        assertEquals("oros", carta.getPalo());
        
        carta = baraja.mostrar(11);
        assertEquals(2, carta.getNumero(), 0.000001);
        assertEquals("bastos", carta.getPalo());

        carta = baraja.mostrar(22);
        assertEquals(3, carta.getNumero(), 0.000001);
        assertEquals("espadas", carta.getPalo());
        
        carta = baraja.mostrar(33);
        assertEquals(4, carta.getNumero(), 0.000001);
        assertEquals("copas", carta.getPalo());
    }
}
