package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class AsignacionAeCcDA  extends AbstractDA<AsignacionAeCc> implements Serializable{

    @Override
    public long registrar(AsignacionAeCc bean) {
        return save(bean);
    }

    @Override
    public long actualizar(AsignacionAeCc bean) {
        return update(bean);
    }

    @Override
    public long eliminar(AsignacionAeCc bean) {
        return delete(bean);
    }

    @Override
    public List<AsignacionAeCc> listar() {
        return list(AsignacionAeCc.class);
    }

    @Override
    public List<AsignacionAeCc> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AsignacionAeCc> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeCc buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsignacionAeCc buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

