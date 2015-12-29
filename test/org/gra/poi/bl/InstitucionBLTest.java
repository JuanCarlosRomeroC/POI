package org.gra.poi.bl;

import java.util.LinkedList;
import java.util.List;
import org.gra.poi.be.Institucion;
import org.gra.poi.utl.AbstractDA;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class InstitucionBLTest {

    @Autowired
    private Institucion institucion;
    @Autowired
    private InstitucionBL institucionBL;
    private List<Institucion> listaInstitucion = new LinkedList<>();

    public InstitucionBLTest() {
    }

    @Test
    public void testListar() {
        System.out.println("LISTAR");
        System.out.println("======");

        setListaInstitucion(getInstitucionBL().listar());
        assertTrue(getListaInstitucion() != null && getListaInstitucion().size() >= 0);

        for (Institucion i : listaInstitucion) {
            System.out.println(i.getDenominacion());
        }
    }

    @Test
    public void testRegistrar() {
        System.out.println("REGISTRAR");
        System.out.println("======");
        
        getInstitucion().setCodigo("0012");
        getInstitucion().setDenominacion("GRA");
        
        long rst = getInstitucionBL().registrar(getInstitucion());
        
        assertTrue(rst>=0);
        System.out.println("REGISTRO CORRECTO");
    }
    
    @Test
    public void testActualizar() {
        System.out.println("ACTUALIZAR");
        System.out.println("======");
        
        setInstitucion(getInstitucionBL().buscar(1));
        assertTrue(getInstitucion()!= null);
        System.out.println("CODIGO : "+getInstitucion().getCodigo());
        System.out.println("DENOMINACION : "+getInstitucion().getDenominacion());
        
        getInstitucion().setCodigo("ABCD1234");
        getInstitucion().setDenominacion("GRA ACTUALIZADO");
        long rst = getInstitucionBL().actualizar(getInstitucion());        
        assertTrue(rst>=0);
        System.out.println("ACTUALIZACION CORRECTA");
        
        setInstitucion(getInstitucionBL().buscar(1));
        System.out.println("CODIGO ACTUALIZADO : "+getInstitucion().getCodigo().toUpperCase());
        System.out.println("DENOMINACION ACTUALIZADA : "+getInstitucion().getDenominacion().toUpperCase());
    }

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public InstitucionBL getInstitucionBL() {
        return institucionBL;
    }

    public void setInstitucionBL(InstitucionBL institucionBL) {
        this.institucionBL = institucionBL;
    }

    public List<Institucion> getListaInstitucion() {
        return listaInstitucion;
    }

    public void setListaInstitucion(List<Institucion> listaInstitucion) {
        this.listaInstitucion = listaInstitucion;
    }
    //</editor-fold>
}
