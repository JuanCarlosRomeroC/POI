package org.gra.poi.bl;

import java.util.LinkedList;
import java.util.List;
import org.gra.poi.be.AccionEstrategica;
import org.gra.poi.utl.AbstractDA;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccionEstrategicaBLTest {
    
    @Autowired
    private AccionEstrategica accionEstrategica;
    @Autowired
    private AccionEstrategicaBL accionEstrategicaBL;
    private List<AccionEstrategica> listaAccionEstrategica = new LinkedList<>();
    
    public AccionEstrategicaBLTest() {
        
    }

    @Test
    public void testListarCP_CC() {
//        System.out.println("listarCP_CC");
//        long id_cp = 0L;
//        long id_cc = 0L;
//        AccionEstrategicaBL instance = new AccionEstrategicaBL();
//        List<AccionEstrategica> expResult = null;
//        List<AccionEstrategica> result = instance.listarCP_CC(id_cp, id_cc);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testListarCP_OE() {
        System.out.println("LISTA FILTRADA");
        setListaAccionEstrategica(getAccionEstrategicaBL().listarCP_OE(4, 3));
        assertTrue(getListaAccionEstrategica()!=null && getListaAccionEstrategica().size()>0);
        System.out.println(getListaAccionEstrategica().size());
    }

    @Test
    public void testListarCC_OE() {
//        System.out.println("listarCC_OE");
//        long id_cc = 0L;
//        long id_oe = 0L;
//        AccionEstrategicaBL instance = new AccionEstrategicaBL();
//        List<AccionEstrategica> expResult = null;
//        List<AccionEstrategica> result = instance.listarCC_OE(id_cc, id_oe);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }    

    public AccionEstrategica getAccionEstrategica() {
        return accionEstrategica;
    }

    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }

    public AccionEstrategicaBL getAccionEstrategicaBL() {
        return accionEstrategicaBL;
    }

    public void setAccionEstrategicaBL(AccionEstrategicaBL accionEstrategicaBL) {
        this.accionEstrategicaBL = accionEstrategicaBL;
    }

    public List<AccionEstrategica> getListaAccionEstrategica() {
        return listaAccionEstrategica;
    }

    public void setListaAccionEstrategica(List<AccionEstrategica> listaAccionEstrategica) {
        this.listaAccionEstrategica = listaAccionEstrategica;
    }
}
