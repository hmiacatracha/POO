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
public class JuegoCartasTest {
    
    public JuegoCartasTest() {
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
     * Test of jugar method, of class JuegoCartas.
     */
    @Test
    public void testJugar() {
        System.out.println("jugar");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        JuegoCartas juego1 = new JuegoCartaMasAlta();
        JuegoCartas juego2 = new JuegoEspadas();   
        System.out.println("JUEGO CARTA MAS ALTA");
        System.out.println(juego1.jugar(j1, j2));
        j1.reset(); j2.reset();
        System.out.println("JUEGO ESPADAS");
        System.out.println(juego2.jugar(j1, j2));
    }


}
