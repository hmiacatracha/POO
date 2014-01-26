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
public class JuegoEspadasTest {
    
    public JuegoEspadasTest() {
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
     * Test of repartirCartas method, of class JuegoEspadas.
     */
    @Test
    public void testRepartirCartas() {
        System.out.println("repartirCartas");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        JuegoEspadas juego = new JuegoEspadas();
        Mazo mazo = new Baraja().barajar();
        juego.repartirCartas(j1, j2, mazo);
    }

    /**
     * Test of analizarPuntuacion method, of class JuegoEspadas.
     */
    @Test
    public void testAnalizarPuntuacion() {
        System.out.println("analizarPuntuacion");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        JuegoEspadas juego = new JuegoEspadas();    
        Baraja b = new Baraja();
      
        j1.setCarta(b.mostrar(1)); //ninguno con espadas para comprobar empate
        j2.setCarta(b.mostrar(2));
        assertEquals(null,juego.analizarPuntuacion(j1,j2)); //se comprueba empate
       
        j1.reset(); j2.reset();
        j1.setCarta(b.mostrar(20)); j2.setCarta(b.mostrar(2)); //gana j1 por mas espadas
        j1.setCarta(b.mostrar(3)); j2.setCarta(b.mostrar(5));
        j1.setCarta(b.mostrar(0)); j2.setCarta(b.mostrar(10));
        j1.setCarta(b.mostrar(7)); j2.setCarta(b.mostrar(11));
        j1.setCarta(b.mostrar(32)); j2.setCarta(b.mostrar(9));
        assertEquals(j1,juego.analizarPuntuacion(j1,j2)); //gana j1
        
        j1.reset(); j2.reset();
        j1.setCarta(b.mostrar(2)); j2.setCarta(b.mostrar(20)); //gana j2 por mas espadas
        j1.setCarta(b.mostrar(3)); j2.setCarta(b.mostrar(5));
        j1.setCarta(b.mostrar(0)); j2.setCarta(b.mostrar(10));
        j1.setCarta(b.mostrar(7)); j2.setCarta(b.mostrar(11));
        j1.setCarta(b.mostrar(32)); j2.setCarta(b.mostrar(9));
        j1.setCarta(b.mostrar(1)); j2.setCarta(b.mostrar(20));
        assertEquals(j2,juego.analizarPuntuacion(j1,j2)); //gana j2 
        
        j1.reset(); j2.reset();
        j1.setCarta(b.mostrar(20)); j2.setCarta(b.mostrar(25)); //gana j2 por espada mas alta
        j1.setCarta(b.mostrar(3)); j2.setCarta(b.mostrar(5));
        j1.setCarta(b.mostrar(0)); j2.setCarta(b.mostrar(10));
        j1.setCarta(b.mostrar(7)); j2.setCarta(b.mostrar(11));
        j1.setCarta(b.mostrar(32)); j2.setCarta(b.mostrar(9));
        j1.setCarta(b.mostrar(1)); j2.setCarta(b.mostrar(20));
        assertEquals(j2,juego.analizarPuntuacion(j1,j2)); //gana j2 
        
        j1.setCarta(b.mostrar(25)); j2.setCarta(b.mostrar(20)); //gana j1 por espada mas alta
        j1.setCarta(b.mostrar(3)); j2.setCarta(b.mostrar(5));
        j1.setCarta(b.mostrar(0)); j2.setCarta(b.mostrar(10));
        j1.setCarta(b.mostrar(7)); j2.setCarta(b.mostrar(11));
        j1.setCarta(b.mostrar(32)); j2.setCarta(b.mostrar(9));
        j1.setCarta(b.mostrar(1)); j2.setCarta(b.mostrar(20));
        assertEquals(j2,juego.analizarPuntuacion(j1,j2)); //gana j2 
    }
}
