package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class InstitucionDA  extends AbstractDA<Institucion> implements Serializable{

    @Override
    public long registrar(Institucion bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Institucion bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Institucion bean) {
        return delete(bean);
    }

    @Override
    public List<Institucion> listar() {
        return list(Institucion.class);
    }

    @Override
    public List<Institucion> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Institucion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

