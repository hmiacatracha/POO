/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class JuegoCartaMasAltaTest {
    
    public JuegoCartaMasAltaTest() {
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
     * Test of repartirCartas method, of class JuegoCartaMasAlta.
     */
    @Test
    public void testRepartirCartas() {
        System.out.println("repartirCartas");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        JuegoCartaMasAlta juego = new JuegoCartaMasAlta();
        Mazo mazo = new Baraja().barajar();        
        juego.repartirCartas(j1, j2, mazo);
    }

    /**
     * Test of analizarPuntuacion method, of class JuegoCartaMasAlta.
     */
    @Test
    public void testAnalizarPuntuacion() {
        System.out.println("analizarPuntuacion");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        JuegoCartaMasAlta juego = new JuegoCartaMasAlta();
        Baraja b = new Baraja();
        for(int i=0 ; i<20 ; i++) {  //se reparten los mismos numeros a los dos jugares para provocar un empate
            j1.setCarta(b.mostrar(i));
            j2.setCarta(b.mostrar(i+20));
        }
        assertEquals(null,juego.analizarPuntuacion(j1,j2)); //se comprueba empate
        
        j1.reset(); j2.reset();
        j1.setCarta(b.mostrar(9)); j2.setCarta(b.mostrar(2));
        assertEquals(j1,juego.analizarPuntuacion(j1,j2)); //gana j1
        
        j1.reset(); j2.reset();
        j1.setCarta(b.mostrar(1)); j2.setCarta(b.mostrar(8));
        assertEquals(j2,juego.analizarPuntuacion(j1,j2)); //gana j2
        
    }
}
