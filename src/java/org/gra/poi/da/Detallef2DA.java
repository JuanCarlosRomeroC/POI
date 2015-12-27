package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef2DA  extends AbstractDA<Detallef2> implements Serializable{

    @Override
    public long registrar(Detallef2 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef2 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef2 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef2> listar() {
        return list(Detallef2.class);
    }

    @Override
    public List<Detallef2> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef2> listar(long id) {
        return list("FROM Detallef2 df2"
                    +" INNER JOIN FETCH df2.formato2 f2"                
                    +" WHERE f2.idformato2="+id);
    }

    @Override
    public Detallef2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

