package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato8DA  extends AbstractDA<Formato8> implements Serializable{

    @Override
    public long registrar(Formato8 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato8 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato8 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato8> listar() {
        return list(Formato8.class);
    }

    @Override
    public List<Formato8> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato8> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato8 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato8 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

