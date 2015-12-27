package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class AsignacionAeOeiDA  extends AbstractDA<AsignacionAeOei> implements Serializable{

    @Override
    public long registrar(AsignacionAeOei bean) {
        return save(bean);
    }

    @Override
    public long actualizar(AsignacionAeOei bean) {
        return update(bean);
    }

    @Override
    public long eliminar(AsignacionAeOei bean) {
        return delete(bean);
    }

    @Override
    public List<AsignacionAeOei> listar() {
        return list(AsignacionAeOei.class);
    }

    @Override
    public List<AsignacionAeOei> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AsignacionAeOei> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeOei buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeOei buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

