package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef4DA  extends AbstractDA<Detallef4> implements Serializable{

    @Override
    public long registrar(Detallef4 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef4 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef4 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef4> listar() {
        return list(Detallef4.class);
    }

    @Override
    public List<Detallef4> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef4> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef4 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef4 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

