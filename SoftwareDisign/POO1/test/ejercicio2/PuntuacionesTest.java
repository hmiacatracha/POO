/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 */
public class PuntuacionesTest {
    
    double delta = 0.001;
        
    public PuntuacionesTest() {
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
     * Test of calificacionPelicula method, of class Puntuaciones.
     */
    @Test
    public void testCalificacionPelicula() {
        System.out.println("calificacionPelicula");
        assertEquals(3.2, Puntuaciones.calificacionPelicula("The Artist"),delta);
        assertEquals(3.0, Puntuaciones.calificacionPelicula("Biutiful"), delta);
        assertEquals(3.0, Puntuaciones.calificacionPelicula("Drive"), delta);
        assertEquals(3.2, Puntuaciones.calificacionPelicula("Torrente 4"), delta);

    }
}
