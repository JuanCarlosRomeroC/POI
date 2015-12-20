package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class MetaOperativaDA  extends AbstractDA<MetaOperativa> implements Serializable{

    @Override
    public long registrar(MetaOperativa bean) {
        return save(bean);
    }

    @Override
    public long actualizar(MetaOperativa bean) {
        return update(bean);
    }

    @Override
    public long eliminar(MetaOperativa bean) {
        return delete(bean);
    }

    @Override
    public List<MetaOperativa> listar() {
        return list(MetaOperativa.class);
    }

    @Override
    public List<MetaOperativa> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MetaOperativa> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MetaOperativa buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MetaOperativa buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

