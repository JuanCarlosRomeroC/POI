package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef1DA  extends AbstractDA<Detallef1> implements Serializable{

    @Override
    public long registrar(Detallef1 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef1 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef1 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef1> listar() {
        return list(Detallef1.class);
    }

    @Override
    public List<Detallef1> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef1> listar(long id) {
        return list("FROM Detallef1 df1"
                    +" INNER JOIN FETCH df1.formato1 f1"
                    +" INNER JOIN FETCH df1.oePei oe"
                    +" INNER JOIN FETCH df1.actividadOperativa ao"                    
                    +" WHERE f1.idformato1="+id);
    }

    @Override
    public Detallef1 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef1 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

