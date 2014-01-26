/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author HMIA
 */
public class EmpresaTest {

    public EmpresaTest() {
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
     * Test of getPlazo method, of class Empresa.
     */
    @Test
    public void testGetPlazo() {
        Cliente c1 = new Empresa("A58818501", "Abogados Lopez", "Calle Cabo de Santiago", 5);
        System.out.println("getPlazo");
        Empresa instance = (Empresa) c1;
        int expResult = 3;
        int result = instance.getPlazo();
        assertEquals(expResult, result);

    }

    /**
     * Test of validateCif method, of class Empresa.
     */

    public void testValidateCif() {
        System.out.println("Comprobar NIF");
        String cif = "A38397246";
        String cif2 = "A58818501";
        String cif3 = "T62345466";
        boolean result = Empresa.validateCif(cif);
        boolean result1 = Empresa.validateCif(cif2);
        boolean result2 = Empresa.validateCif(cif3);
        boolean expResult = true;
        boolean expResultF = false;
        assertEquals(expResult, result);
        assertEquals(expResult, result1);
        assertEquals(expResultF, result2);

    }
    
    @Test
    public void testGetNumeroEmpleados() {
        Cliente c2 = new Empresa("A58818501", "Abogados Lopez", "Calle Cabo de Santiago", 5);
        System.out.println("getNumeroEmpleados");
        Empresa instance = (Empresa) c2;
        int expResult = 5;
        int result = instance.getNumeroEmpleados();
        assertEquals(expResult, result);
    }
}
