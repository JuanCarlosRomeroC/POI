package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class PoiDA  extends AbstractDA<Poi> implements Serializable{

    @Override
    public long registrar(Poi bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Poi bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Poi bean) {
        return delete(bean);
    }

    @Override
    public List<Poi> listar() {
        return list("FROM Poi poi");
    }

    @Override
    public List<Poi> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Poi> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Poi buscar(long id) {
        return search("FROM Poi poi"
                + " WHERE poi.idpoi= "+id);
    }

    @Override
    public Poi buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        return maxId(Poi.class);
    }
    
}

