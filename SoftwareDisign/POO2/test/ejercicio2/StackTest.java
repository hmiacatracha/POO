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
public class StackTest {

    public StackTest() {
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
     * Test of esVacia method, of class Stack.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        Stack instance = new Stack();
        boolean expResult = true;
        boolean result = instance.esVacia();
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class Stack.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = 0; i < 11; i++) {
            pila.offer(i);
        }
        Iterator iter = pila.iterator();
        assertEquals(true, iter.hasNext());
        for (int j = 10; j > -1; j--) {
            assertEquals(j, iter.next());
            iter.remove();
        }
        assertEquals(true, pila.esVacia());
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        Stack<String> c = new Stack<String>();
        c.add("hola");
        assertEquals(1, c.size());
        Stack<Integer> s = new Stack<Integer>();
        assertEquals(0, s.size());
    }

    /**
     * Test of offer method, of class Stack.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Stack<String> pila = new Stack<String>();
        pila.offer("hola");
        assertEquals("hola",pila.peek());
        pila.offer("adios");
        assertEquals("adios",pila.peek());

    }

    /**
     * Test of poll method, of class Stack.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = 0; i < 11; i++) {
            pila.offer(i);
        }
        assertEquals(11,pila.size()); //compruebo el tamano de la pila       
        assertEquals(10,pila.poll().intValue()); //compruebo que la cima de la pila es 10
        assertEquals(10,pila.size()); //compruebo que se ha borrado el 10
        assertEquals(9,pila.poll().intValue()); //se ha borrado y ahora la cima es el 9
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = 0; i < 11; i++) {
            pila.offer(i);
        }
        assertEquals(11,pila.size());        
        assertEquals(10,pila.peek().intValue());
        assertEquals(11,pila.size());          
    }
}
