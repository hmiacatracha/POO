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
import org.junit.Ignore;

/**
 *
 * @author HMIA
 */
public class InstitucionTest {

    private Cliente n1 = new Institucion("1234", "MANUEL JIMENEZ", "Calle Melendez Pelayo 34,3-A", TypeInstitucion.AUTONOMICA);
    private Cliente n2 = new Institucion("1456", "FATIMA ALVAREZ", "Calle Juana de Vega 54,5-A", TypeInstitucion.LOCAL);
    private Cliente n3 = new Institucion("4523", "MARIA JIMENEZ", "Calle Juana de Vega 64,5-6", TypeInstitucion.EUROPEA);
    private Cliente n4 = new Institucion("3453K", "SONIA LOVERES", "Calle Juana de Vega 64,5-6", TypeInstitucion.ESTATAL);

    public InstitucionTest() {
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
     * Test of getPlazo method, of class Institucion.
     */
    @Ignore
    public void testGetPlazo() {
        System.out.println("getPlazo");
        Institucion instance = (Institucion) n1;
        int expResult = 6;
        int result = instance.getPlazo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Institucion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Institucion instance1 = (Institucion) n1;
        Institucion instance2 = (Institucion) n2;
        Institucion instance3 = (Institucion) n3;
        Institucion instance4 = (Institucion) n4;
        String expResult1 = "1234";
        String expResult2 = "1456";
        boolean expResult3 = false;
        String expResult4 = "3453K";
        String result1 = instance1.getId();
        String result2 = instance2.getId();
        boolean result3 = instance3.getId().equals("1455");
        String result4 = instance4.getId();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        assertEquals(expResult4, result4);
    }

   
}
