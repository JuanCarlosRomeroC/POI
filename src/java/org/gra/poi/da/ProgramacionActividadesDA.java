package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class ProgramacionActividadesDA  extends AbstractDA<ProgramacionActividades> implements Serializable{

    @Override
    public long registrar(ProgramacionActividades bean) {
        return save(bean);
    }

    @Override
    public long actualizar(ProgramacionActividades bean) {
        return update(bean);
    }

    @Override
    public long eliminar(ProgramacionActividades bean) {
        return delete(bean);
    }

    @Override
    public List<ProgramacionActividades> listar() {
        return list(ProgramacionActividades.class);
    }

    @Override
    public List<ProgramacionActividades> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProgramacionActividades> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProgramacionActividades buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProgramacionActividades buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

