package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class CentroCostoDA  extends AbstractDA<CentroCosto> implements Serializable{

    @Override
    public long registrar(CentroCosto bean) {
        return save(bean);
    }

    @Override
    public long actualizar(CentroCosto bean) {
        return update(bean);
    }

    @Override
    public long eliminar(CentroCosto bean) {
        return delete(bean);
    }

    @Override
    public List<CentroCosto> listar() {
        return list(CentroCosto.class);
    }

    @Override
    public List<CentroCosto> listar(String ref) {
        return list("FROM CentroCosto cc"
                + " WHERE cc.denominacion LIKE '%"+ref+"%'");
    }

    @Override
    public List<CentroCosto> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CentroCosto buscar(long id) {
        return search("FROM CentroCosto cc"
                + " WHERE cc.idcentroCosto= "+id);
    }

    @Override
    public CentroCosto buscar(String ref) {
        return search("FROM CentroCosto cc"
                + " WHERE cc.denominacion= "+ref);
    }

    @Override
    public long id() {
        return maxId(CentroCosto.class);
    }
    
}

