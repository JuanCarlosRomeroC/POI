package org.gra.poi.vc;

import java.util.List;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdministrarUEVCIT {
    
    public AdministrarUEVCIT() {
    }

    @Test
    public void testListarOrganosUnidad() {
        System.out.println("listarOrganosUnidad");
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.listarOrganosUnidad();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListarInstituciones() {
        System.out.println("listarInstituciones");
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.listarInstituciones();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRecuperarUnidadOrganica() {
        System.out.println("recuperarUnidadOrganica");
        long id = 0L;
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.recuperarUnidadOrganica(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.registrar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.actualizar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        AdministrarUEVC instance = new AdministrarUEVC();
        instance.eliminar();
        fail("The test case is a prototype.");
    }
}
