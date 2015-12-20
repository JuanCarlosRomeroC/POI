package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef6DA  extends AbstractDA<Detallef6> implements Serializable{

    @Override
    public long registrar(Detallef6 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef6 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef6 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef6> listar() {
        return list(Detallef6.class);
    }

    @Override
    public List<Detallef6> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef6> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef6 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef6 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

