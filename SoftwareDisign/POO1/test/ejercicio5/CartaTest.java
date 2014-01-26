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
public class CartaTest {

    public CartaTest() {
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

    @Test
    public void testConstructores() {
        Carta carta = new Carta(1, "bastos");
        assertEquals(carta.getNumero(), 1);
        assertEquals(carta.getPalo(), "bastos");

        carta = new Carta(12, "oros");
        assertEquals(carta.getNumero(), 12);
        assertEquals(carta.getPalo(), "oros");

        carta = new Carta(7, "espadas");
        assertEquals(carta.getNumero(), 7);
        assertEquals(carta.getPalo(), "espadas");

        carta = new Carta(10, "copas");
        assertEquals(carta.getNumero(), 10);
        assertEquals(carta.getPalo(), "copas");
    }

    @Test
    public void testConstructorMal() {
        boolean exito;
        Carta carta;
        exito = false;
        try {
            carta = new Carta(8, "bastos");
        } catch (IllegalArgumentException e) {
            exito = true;
        }
        assertTrue(exito);


        exito = false;
        try {
            carta = new Carta(9, "bastos");
        } catch (IllegalArgumentException e) {
            exito = true;
        }
        assertTrue(exito);

        exito = false;
        try {
            carta = new Carta(0, "bastos");
        } catch (IllegalArgumentException e) {
            exito = true;
        }
        assertTrue(exito);

        exito = false;
        try {
            carta = new Carta(13, "bastos");
        } catch (IllegalArgumentException e) {
            exito = true;
        }
        assertTrue(exito);




    }

    @Test
    public void testEquals() {
        Carta carta = new Carta(5, "bastos");
        Carta carta2 = new Carta(5, "bastos");
        assertEquals(carta,carta2);
        
        carta = new Carta(10, "copas");
        carta2 = new Carta(10, "copas");
        assertEquals(carta,carta2);
        
        carta = new Carta(2, "oros");
        carta2 = new Carta(2, "oros");
        assertEquals(carta,carta2);
        
        carta = new Carta(1, "espadas");
        carta2 = new Carta(1, "espadas");
        assertEquals(carta,carta2);
        
    }
}
