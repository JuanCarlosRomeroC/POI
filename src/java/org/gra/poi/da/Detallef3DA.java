package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef3DA  extends AbstractDA<Detallef3> implements Serializable{

    @Override
    public long registrar(Detallef3 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef3 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef3 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef3> listar() {
        return list(AccionEstrategica.class);
    }

    @Override
    public List<Detallef3> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef3> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef3 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef3 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

