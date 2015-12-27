package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class ActividadOperativaDA  extends AbstractDA<ActividadOperativa> implements Serializable{

    @Override
    public long registrar(ActividadOperativa bean) {
        return save(bean);
    }

    @Override
    public long actualizar(ActividadOperativa bean) {
        return update(bean);
    }

    @Override
    public long eliminar(ActividadOperativa bean) {
        return delete(bean);
    }

    @Override
    public List<ActividadOperativa> listar() {
        return list(ActividadOperativa.class);
    }

    @Override
    public List<ActividadOperativa> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ActividadOperativa> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActividadOperativa buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActividadOperativa buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

