/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class JukeboxTest {

    private Cancion c1;
    private Cancion c2;
    private Cancion c3;
    private Cancion c4;
    private Cancion c5;
    private Jukebox j;
    private Jukebox j1;
    
    public JukeboxTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        j  = new Jukebox();
        j1 = new Jukebox();
        c1 = new Cancion("hola", "besfeq", "a","", 300);
        c2 = new Cancion("vaca", "heidy", "z","", 300);
        c3 = new Cancion("pollito", "aere", "b","", 300);
        c4 = new Cancion("chibola", "ytsrfa", "w","", 300);
        c5 = new Cancion("ale", "bert", "v","", 300);
        j.anadir(c1);  j.anadir(c2);  j.anadir(c3);
        j.anadir(c4);  j.anadir(c5);
        
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cancionTitulo method, of class Jukebox.
     */
    @Test
    public void testCancionTitulo() {
        j1.anadir(c5); j1.anadir(c4);
        j1.anadir(c1); j1.anadir(c3); j1.anadir(c2);
        assertEquals(j1.play(),j.cancionTitulo());
    }

    /**
     * Test of cancionAutor method, of class Jukebox.
     */
    @Test
    public void testCancionAutor() {
        j1.anadir(c3); j1.anadir(c5);
        j1.anadir(c1); j1.anadir(c2); j1.anadir(c4);
        assertEquals(j1.play(),j.cancionAutor());
    }

    /**
     * Test of cancionAlbum method, of class Jukebox.
     */
    @Test
    public void testCancionAlbum() {
        j1.anadir(c1); j1.anadir(c3);
        j1.anadir(c5); j1.anadir(c4); j1.anadir(c2);
        assertEquals(j1.play(),j.cancionAlbum());
    }
    
    /**
     * Test of mostrarLista method, of class Jukebox.
     */
    @Test
    public void testMostrarLista() {
        Jukebox.mostrarLista(j.play());
    }
}
