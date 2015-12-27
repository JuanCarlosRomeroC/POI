package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef8DA  extends AbstractDA<Detallef8> implements Serializable{

    @Override
    public long registrar(Detallef8 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef8 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef8 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef8> listar() {
        return list(Detallef8.class);
    }

    @Override
    public List<Detallef8> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef8> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef8 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef8 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

