package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class EspecificaGastoDA  extends AbstractDA<EspecificaGasto> implements Serializable{

    @Override
    public long registrar(EspecificaGasto bean) {
        return save(bean);
    }

    @Override
    public long actualizar(EspecificaGasto bean) {
        return update(bean);
    }

    @Override
    public long eliminar(EspecificaGasto bean) {
        return delete(bean);
    }

    @Override
    public List<EspecificaGasto> listar() {
        return list(EspecificaGasto.class);
    }

    @Override
    public List<EspecificaGasto> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EspecificaGasto> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EspecificaGasto buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EspecificaGasto buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

