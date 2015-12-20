package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class SubgrupoDA  extends AbstractDA<Subgrupo> implements Serializable{

    @Override
    public long registrar(Subgrupo bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Subgrupo bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Subgrupo bean) {
        return delete(bean);
    }

    @Override
    public List<Subgrupo> listar() {
        return list(Subgrupo.class);
    }

    @Override
    public List<Subgrupo> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subgrupo> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Subgrupo buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Subgrupo buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}

