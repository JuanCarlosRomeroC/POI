package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato9DA  extends AbstractDA<Formato9> implements Serializable{

    @Override
    public long registrar(Formato9 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato9 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato9 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato9> listar() {
        return list(Formato9.class);
    }

    @Override
    public List<Formato9> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato9> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato9 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato9 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

