/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class IteradorTest {

    private Stack<Integer> pila;
    private Iterator<Integer> iter;

    public IteradorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pila = new Stack<Integer>();
        for (int i = 0; i < 11; i++) {
            pila.offer(i);
        }
        iter = pila.iterator();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of hasNext method, of class Iterador.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        assertEquals(true, iter.hasNext());
    }

    /**
     * Test of next method, of class Iterador.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        for (int j = 10; j > -1; j--) {
            assertEquals((Integer) j, iter.next());
        }
    }

    /**
     * Test of remove method, of class Iterador.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        iter.next();
        iter.remove();
        
        iter.next(); //9
        iter.next(); //8
        iter.next(); //7
        iter.next(); //6
        
        iter.remove();
        
        while (iter.hasNext()) {
            iter.next();
        } 
        iter.remove();
       
        Stack<Integer> p = new Stack<Integer>();
        p.offer(1); p.offer(2); p.offer(3); p.offer(4);
        p.offer(5); p.offer(7); p.offer(8); p.offer(9);
        
        assertEquals(p.size(),pila.size());
        
        Iterator i  = p.iterator(); 
        Iterator i2 = pila.iterator();
        
        while (i.hasNext()) {
           assertEquals(i.next(),i2.next()); 
        } 
        

    }
}
