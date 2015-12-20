package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato7DA  extends AbstractDA<Formato7> implements Serializable{

    @Override
    public long registrar(Formato7 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato7 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato7 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato7> listar() {
        return list(Formato7.class);
    }

    @Override
    public List<Formato7> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato7> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato7 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato7 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

