/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ContabilidadTest {

    public ContabilidadTest() {
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
     * Test of incluirFactura method, of class Contabilidad.
     */
    @Test
    public void testIncluirFactura() {
        try {
            System.out.println("incluirFactura");
            Cliente p1 = new Persona("119074479B", "FATIMA ARMENTEROS", "Calle Sanchez Tijarro", "16-02-60");
            Cliente e1 = new Empresa("A58818501", "Abogados Lopez", "Calle Cabo de Santiago", 5);
            Factura f = new Factura(p1, "24-08-03", "Prueba", 1.7);
            Factura f1 = new Factura(e1, "23-11-2012", "Compra ", 17.20);
            Contabilidad c = new Contabilidad();
            c.incluirFactura(f);
            c.incluirFactura(f1);
            String v1[] = new String[2];
            String ve[] = new String[2];
            v1[0] = " Fecha:24-08-03 ID:119074479B Nombre:FATIMA ARMENTEROS Dirección:Calle Sanchez Tijarro Concepto:Prueba Precio:1.7";
            v1[1] = " Fecha:23-11-12 ID:A58818501 Nombre:Abogados Lopez Dirección:Calle Cabo de Santiago Concepto:Compra  Precio:17.2";
            List<Factura> lFacturas;
            lFacturas = c.getFactura();
            for (Factura fact : lFacturas) {
                String s = fact.Facturar();
                assertEquals(v1[lFacturas.indexOf(fact)], s);
            }
        } catch (ParseException ex) {
            System.out.println(ex);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        }
    }

    /**
     * Test of procesarFacturas method, of class Contabilidad.
     */
    @Test
    public void testProcesarFacturas() throws ParseException, PrecioExcepcion {

        System.out.println("procesarFacturas");
        Cliente p1 = new Persona("119074479B", "FATIMA ARMENTEROS", "Calle Sanchez Tijarro", "16-02-60");
        Cliente e1 = new Empresa("A58818501", "Abogados Lopez", "Calle Cabo de Santiago", 5);
        Factura f = new Factura(p1, "24-08-03", "Prueba", 1.7);
        Factura f1 = new Factura(e1, "23-11-2012", "Compra ", 17.20);
        Contabilidad c = new Contabilidad();
        c.incluirFactura(f);
        c.incluirFactura(f1);
        String s = c.procesarFacturas();
        String exp = "  Fecha:24-08-03 ID:119074479B Nombre:FATIMA ARMENTEROS Dirección:Calle Sanchez Tijarro Concepto:Prueba Precio:1.7 1  Fecha:23-11-12 ID:A58818501 Nombre:Abogados Lopez Dirección:Calle Cabo de Santiago Concepto:Compra  Precio:17.2 1";
        assertEquals(exp, s);
    }

    /**
     * Test of eliminarFacturas method, of class Contabilidad.
     */
    @Test
    public void testEliminarFacturas() {
        System.out.println("eliminarFacturas");
        try {
            System.out.println("incluirFactura");
            Cliente p1 = new Persona("119074479B", "FATIMA ARMENTEROS", "Calle Sanchez Tijarro", "16-02-60");
            Cliente e1 = new Empresa("A58818501", "Abogados Lopez", "Calle Cabo de Santiago", 5);
            Factura f = new Factura(p1, "24-08-03", "Prueba", 1.7);
            Factura f1 = new Factura(p1, "24-08-03", "Prueba", 1.7);
            Contabilidad c = new Contabilidad();
            c.incluirFactura(f);
            c.incluirFactura(f1);
            c.eliminarFacturas(f.getCliente());
            List<Factura> lFacturas;
            lFacturas = c.getFactura();
            String exp=" Fecha:24-08-03 ID:119074479B Nombre:FATIMA ARMENTEROS Dirección:Calle Sanchez Tijarro Concepto:Prueba Precio:1.7";
            String v = lFacturas.iterator().next().Facturar();
            assertEquals(exp, v);
        } catch (ParseException ex) {
            System.out.println(ex);
        } catch (PrecioExcepcion ex) {
            System.out.println(ex);
        }
    }

    /**
     * Test of getFactura method, of class Contabilidad.
     */
}
