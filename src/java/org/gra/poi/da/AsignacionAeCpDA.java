package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class AsignacionAeCpDA  extends AbstractDA<AsignacionAeCp> implements Serializable{

    @Override
    public long registrar(AsignacionAeCp bean) {
        return save(bean);
    }

    @Override
    public long actualizar(AsignacionAeCp bean) {
        return update(bean);
    }

    @Override
    public long eliminar(AsignacionAeCp bean) {
        return delete(bean);
    }

    @Override
    public List<AsignacionAeCp> listar() {
        return list(AsignacionAeCp.class);
    }

    @Override
    public List<AsignacionAeCp> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AsignacionAeCp> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeCp buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeCp buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

