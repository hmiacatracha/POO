/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author HMIA
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
     * Test of getPlazo method, of class Persona.
     */
    @Test
    public void testGetPlazo() {
        Cliente p1;
        try {
            p1 = new Persona("Y19074479B", "ADAN ROQUE", "Calle Sanchez Tijarro","16-02-60");
            System.out.println("getPlazo");
            Persona instance = (Persona) p1;
            int expResult = 1;
            int result = instance.getPlazo();
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.out.println(ex);
        }


    }

    /**
     * Test of nif method, of class Persona.
     */
    @Test
    public void testNif() {
        try {
            String nif="Y19074479B";
            Cliente p1 = new Persona(nif, "ADAN ROQUE", "Calle Sanchez Tijarro","25-08-87");
            System.out.println("Test Nif");
            String n = "X0284977K";
            String n1 = "Y0284977K";
            String n2 = "34529223J";
            boolean result3 = (p1.getId().equals("X0284977K"));
            boolean result = Persona.nif(n);
            boolean result1 = Persona.nif(n1);
            boolean result2 = Persona.nif(n2);
            boolean expResultF = false;
            boolean expResultT = true;
            assertEquals(expResultF, result);
            assertEquals(expResultT, result1);
            assertEquals(expResultT, result2);
            assertEquals(expResultF, result3);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }

    
    

    /**
     * Test of utilidad method, of class Persona.
     */
    @Test
    public void testUtilidad() {
        System.out.println("utilidad");
        String letra = "K";
        String result = Persona.utilidad(10284977);
        assertEquals(letra, result);
    }

    /**
     * @return the fecha
     */
    @Test
    public void testGetFechaNac() {
        try {
            Cliente p1 = new Persona("Y19074479B", "ADAN ROQUE", "Calle Sanchez Tijarro","30/06/99");
            System.out.println("getFechaNac");
            Persona instance = (Persona) p1;
            String expResult = "30/6/1999";
            String result;
            result = instance.getFechaNac();
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }
}
