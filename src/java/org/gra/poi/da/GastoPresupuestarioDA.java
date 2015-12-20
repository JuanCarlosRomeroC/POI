package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class GastoPresupuestarioDA  extends AbstractDA<GastoPresupuestario> implements Serializable{

    @Override
    public long registrar(GastoPresupuestario bean) {
        return save(bean);
    }

    @Override
    public long actualizar(GastoPresupuestario bean) {
        return update(bean);
    }

    @Override
    public long eliminar(GastoPresupuestario bean) {
        return delete(bean);
    }

    @Override
    public List<GastoPresupuestario> listar() {
        return list(GastoPresupuestario.class);
    }

    @Override
    public List<GastoPresupuestario> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GastoPresupuestario> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GastoPresupuestario buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GastoPresupuestario buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

