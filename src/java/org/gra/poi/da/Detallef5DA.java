package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Detallef5DA  extends AbstractDA<Detallef5> implements Serializable{

    @Override
    public long registrar(Detallef5 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Detallef5 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Detallef5 bean) {
        return delete(bean);
    }

    @Override
    public List<Detallef5> listar() {
        return list(Detallef5.class);
    }

    @Override
    public List<Detallef5> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detallef5> listar(long id) {
        return list("FROM Detallef5 df5"
                    +" INNER JOIN FETCH df5.formato5 f5"
                    +" INNER JOIN FETCH df5.subgrupo sg"
                    +" INNER JOIN FETCH df5.especificaGasto eg"                    
                    +" WHERE f5.idformato5="+id);
    }

    @Override
    public Detallef5 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detallef5 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

