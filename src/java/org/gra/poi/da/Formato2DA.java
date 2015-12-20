package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato2DA  extends AbstractDA<Formato2> implements Serializable{

    @Override
    public long registrar(Formato2 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato2 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato2 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato2> listar() {
        return list(Formato2.class);
    }

    @Override
    public List<Formato2> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

