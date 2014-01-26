/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author UDC
 */
public class BarometroTest {

    double delta = 0.001;

    public BarometroTest() {
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
    public void testPascales() {
        Barometro b = new Barometro(5, "PASCALES");
        assertEquals(b.getPascales(), 5, delta);
        assertEquals(b.getAtmosferas(), 0.00004935, delta);
        assertEquals(b.getMilibares(), 0.05, delta);

    }

    @Test
    public void testAtmosferas() {
        Barometro b = new Barometro(0.00004935, "ATMOSFERAS");
        assertEquals(b.getPascales(), 5, delta);
        assertEquals(b.getAtmosferas(), 0.00004935, delta);
        assertEquals(b.getMilibares(),0.05, delta);

    }

    @Test
    public void testMilibares() {
        Barometro b = new Barometro(0.05, "milibares");
        assertEquals(b.getPascales(), 5, delta);
        assertEquals(b.getAtmosferas(), 0.00004935, delta);
        assertEquals(b.getMilibares(),0.05, delta);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCosntructorInvalido() {
        Barometro b = new Barometro(500, "milibare");
    }

    @Test
    public void testEquals() {
        Barometro b = new Barometro(500, "milibares");
        Barometro a = new Barometro(500, "milibares");
        assertTrue(a.equals(b));
        
        a = new Barometro(500, "pascales");
        b = new Barometro(500, "pascales");
        assertTrue(a.equals(b));
        
        a = new Barometro(500, "milibares");
        b = new Barometro(500, "milibares");
        assertTrue(a.equals(b));




    }
}
