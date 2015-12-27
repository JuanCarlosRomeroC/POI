package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class OePeiDA  extends AbstractDA<OePei> implements Serializable{

    @Override
    public long registrar(OePei bean) {
        return save(bean);
    }

    @Override
    public long actualizar(OePei bean) {
        return update(bean);
    }

    @Override
    public long eliminar(OePei bean) {
        return delete(bean);
    }

    @Override
    public List<OePei> listar() {
        return list(OePei.class);
    }

    @Override
    public List<OePei> listar(String ref) {
        return list("FROM OePei oe"
                + " WHERE CONCAT(oe.denominacion,oe.correlativo) LIKE '%"+ref+"%'");
    }

    @Override
    public List<OePei> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OePei buscar(long id) {
        return search("FROM OePei oe"
                + " WHERE oe.idoePei= "+id);
    }

    @Override
    public OePei buscar(String ref) {
        return search("FROM OePei oe"
                + " WHERE CONCAT(oe.denominacion,oe.correlativo)= "+ref);
    }

    @Override
    public long id() {
        return maxId(OePei.class);
    }
    
}

