/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class PersonaTest {

    public PersonaTest() {
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
     * Test of utilidad method, of class Persona.
     */
    @Test
    public void testUtilidad() {
        assertEquals("A", Persona.utilidad(32718768));
        assertEquals("K", Persona.utilidad(10284977));
    }

    /**
     * Test of mostrar method, of class Persona.
     */
    @Test
    public void testConstructorValido() {

        Persona juan = new Persona("32718768A");    
        assertEquals("32718768A", juan.mostrar());

    }

    /**
     * Test of exception of class Persona.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalido() {
        
        Persona pepe = new Persona("11111111B");
       
    }
}
