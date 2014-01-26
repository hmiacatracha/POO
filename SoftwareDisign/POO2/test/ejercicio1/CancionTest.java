/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heidy.izaguirre
 */
public class CancionTest {
    
    private Cancion c;
    
    public CancionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Cancion("hola","heidy","primavera","pop",330);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitulo method, of class Cancion.
     */
    @Test
    public void testGetTitulo() {
        assertEquals("hola", c.getTitulo());
        assertFalse("acac" == c.getTitulo());
    }

    /**
     * Test of getAutor method, of class Cancion.
     */
    @Test
    public void testGetAutor() {
        assertEquals("heidy", c.getAutor());
        assertFalse("acac" == c.getAutor());       
    }

    /**
     * Test of getAlbum method, of class Cancion.
     */
    @Test
    public void testGetAlbum() {
        assertEquals("primavera", c.getAlbum());
        assertFalse("acac" == c.getAlbum()); 
    }

    /**
     * Test of getDuracion method, of class Cancion.
     */
    @Test
    public void testGetDuracion() {
        assertEquals("5:30", c.getDuracion());
        assertFalse("acac" == c.getDuracion());      
    }

    /**
     * Test of getEstilo method, of class Cancion.
     */
    @Test
    public void testGetEstilo() {
        assertEquals("pop", c.getEstilo());
        assertFalse("acac" == c.getEstilo()); 
    }
}