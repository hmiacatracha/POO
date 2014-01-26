/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.ArrayList;
import ejercicio6.Pieza.Color;
import ejercicio6.Pieza.Tipo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UDC
 */
public class TableroTest {
    
    public TableroTest() {
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
     * Test of iniciarPartida method, of class Tablero.
     */
    @Test
    public void testIniciarPartidaYToString() {
        System.out.println("iniciarPartida");
        String estadoInicial = "TCARDACT/PPPPPPPP/8/8/8/8/pppppppp/tcardact/";
        Tablero tablero = new Tablero();
        tablero.iniciarPartida();
        assertTrue(tablero.toString().equals(estadoInicial));
    }
    
    
    @Test
    public void testBuscarPiezas() {
        Tablero tablero = new Tablero();
        tablero.iniciarPartida();
        List<Posicion> posicionesDeseadas = new ArrayList();
        List<Posicion> posicionesEncontradas;
        posicionesDeseadas.add(new Posicion(0, 0));
        posicionesDeseadas.add(new Posicion(0, 7));
        posicionesDeseadas.add(new Posicion(7, 0));
        posicionesDeseadas.add(new Posicion(7, 7));
        posicionesEncontradas = tablero.buscarPiezas(Tipo.TORRE);
        assertEquals(posicionesEncontradas, posicionesDeseadas);          
    }
    

    @Test
    public void testMoverYGetPieza() {
        Tablero tablero = new Tablero();
        tablero.iniciarPartida();
        tablero.mover(new Posicion(1, 0), new Posicion(2, 0));
        assertTrue(tablero.getPieza(new Posicion(1, 0)) == null);
        assertEquals(tablero.getPieza(new Posicion(2, 0)), new Pieza(Tipo.PEON, Color.BLANCO));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMovimientInvalido() {
        Tablero tablero = new Tablero();
        tablero.iniciarPartida();
        tablero.mover(new Posicion(2, 0), new Posicion(1, 1));
    }
    
    

}
