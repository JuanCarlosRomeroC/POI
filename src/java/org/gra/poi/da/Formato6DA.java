package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato6DA  extends AbstractDA<Formato6> implements Serializable{

    @Override
    public long registrar(Formato6 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato6 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato6 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato6> listar() {
        return list(Formato6.class);
    }

    @Override
    public List<Formato6> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formato6> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato6 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato6 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
