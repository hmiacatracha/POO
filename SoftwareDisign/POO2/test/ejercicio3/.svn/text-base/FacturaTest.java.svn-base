/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author HMIA
 */
public class FacturaTest {

    public FacturaTest() {
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
     * Test of Facturar method, of class Factura.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testFacturar() {
        try {
            System.out.println("Facturar");
            String nie="Y19074479B";
            String cif="A58818501";
            Cliente p1 = new Persona(nie, "ADAN ROQUE", "Calle Sanchez Tijarro", "16-02-60");
            Cliente e1 = new Empresa(cif, "Abogados Lopez", "Calle Cabo de Santiago", 5);
            Cliente i1 = new Institucion("1234", "Autonomia de Galicia", "Calle Melendez Pelayo 34,3-A", TypeInstitucion.AUTONOMICA);
            Factura f1;
            Factura f2;
            Factura f3;
            f1 = new Factura(p1, "24-08-03", "Prueba", 1.7);
            f2 = new Factura(e1, "31-5-00", "Prueba", 7.99);
            f3 = new Factura(i1, "05-7-78", "Prueba", 12.66);
            Factura instancep1 = f1;
            Factura instacee1 = f2;
            Factura instacei1 = f3;
            String expResult1 = " Fecha:24-08-03 ID:Y19074479B Nombre:ADAN ROQUE Dirección:Calle Sanchez Tijarro Concepto:Prueba Precio:1.7";
            String expResult2 = " Fecha:31-05-00 ID:A58818501 Nombre:Abogados Lopez Dirección:Calle Cabo de Santiago Concepto:Prueba Precio:7.99";
            String expResult3 = " Fecha:05-07-78 ID:1234 Nombre:Autonomia de Galicia Dirección:Calle Melendez Pelayo 34,3-A Concepto:Prueba Precio:12.66";
            String result1 = instancep1.Facturar();
            String result2 = instacee1.Facturar();
            String result3 = instacei1.Facturar();
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            assertEquals(expResult1, result1);
            assertEquals(expResult2, result2);
            assertEquals(expResult3, result3);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            System.out.println(ex);;
        }
    }

    /**
     *
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testFacturar2() {
        System.out.println("ERROR POR PRECIO INCORRECTO (MENORES QUE 0)");
        try {
            System.out.println("Facturar");
            Cliente p1 = new Persona("Y19074479B", "ADAN ROQUE", "Calle Sanchez Tijarro", "16-02-60");
            Factura f1;
            f1 = new Factura(p1, "24-08-03", "Prueba", -1.7);
            Factura instancep1 = f1;
            String result1 = instancep1.Facturar();
            System.out.println(result1);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            System.out.println(ex);;
        }


    }

    @Test
    @SuppressWarnings("empty-statement")
    public void testFacturar3() {
        System.out.println("FORMATO DE FEHA INCORRECTA");
        try {
            System.out.println("Facturar");
            Cliente p1 = new Persona("Y19074479B", "ADAN ROQUE", "Calle Sanchez Tijarro", "16/02/60");
            Factura f1;
            f1 = new Factura(p1, "24/08/03", "Prueba", 1.7);
            Factura instancep1 = f1;
            String result1 = instancep1.Facturar();
            System.out.println(result1);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            System.out.println(ex);;
        }


    }

    /**
     * Test of getFecha method, of class Factura.
     */
    @Test
    public void testGetFecha() {
        try {
            System.out.println("getFecha");

            Cliente p1 = new Persona("Y19074479B", "ADAN ROQUE", "Calle Sanchez Tijarro", "16-02-60");
            Factura f1;
            f1 = new Factura(p1, "24-08-03", "Prueba", 1.7);
            Factura instance = f1;
            String expResult = "24-08-03";
            String result = instance.getFecha();
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            System.out.println(ex);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        }
    }

    /**
     * Test of getConcepto method, of class Factura.
     */
    @Ignore
    public void testGetConcepto() {
        System.out.println("getConcepto");
        Factura instance = null;
        String expResult = "";
        String result = instance.getConcepto();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecio method, of class Factura.
     */
    @Ignore
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Factura instance = null;
        Double expResult = null;
        Double result = instance.getPrecio();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCliente method, of class Factura.
     */
    @Ignore
    public void testGetCliente() {
        System.out.println("getCliente");
        Factura instance = null;
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);

    }
}
