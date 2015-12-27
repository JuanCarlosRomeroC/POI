package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef7DA  extends AbstractDA<Detallef7> implements Serializable{

    @Override
    public long registrar(Detallef7 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef7 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef7 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef7> listar() {
        return list(Detallef7.class);
    }

    @Override
    public List<Detallef7> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef7> listar(long id) {
        return list("FROM Detallef7 df7"
                    +" INNER JOIN FETCH df7.formato7 f7"
                    +" INNER JOIN FETCH df7.metaOperativa mo"                 
                    +" WHERE f7.idformato7="+id);
    }

    @Override
    public Detallef7 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef7 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

