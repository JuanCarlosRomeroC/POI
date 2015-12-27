package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef9DA  extends AbstractDA<Detallef9> implements Serializable{

    @Override
    public long registrar(Detallef9 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef9 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef9 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef9> listar() {
        return list(Detallef9.class);
    }

    @Override
    public List<Detallef9> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef9> listar(long id) {
        return list("FROM Detallef9 df9"
                    +" INNER JOIN FETCH df9.formato9 f9"
                    +" INNER JOIN FETCH df9.actividadOperativa ao"                 
                    +" WHERE f9.idformato9="+id);
    }

    @Override
    public Detallef9 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef9 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

