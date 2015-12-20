package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class OrganoUnidadDA  extends AbstractDA<OrganoUnidad> implements Serializable{

    @Override
    public long registrar(OrganoUnidad bean) {
        return save(bean);
    }

    @Override
    public long actualizar(OrganoUnidad bean) {
        return update(bean);
    }

    @Override
    public long eliminar(OrganoUnidad bean) {
        return delete(bean);
    }

    @Override
    public List<OrganoUnidad> listar() {
        return list(OrganoUnidad.class);
    }

    @Override
    public List<OrganoUnidad> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrganoUnidad> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrganoUnidad buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrganoUnidad buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

