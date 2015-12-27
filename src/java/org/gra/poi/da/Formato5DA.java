package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato5DA  extends AbstractDA<Formato5> implements Serializable{

    @Override
    public long registrar(Formato5 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato5 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato5 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato5> listar() {
        return list(Formato5.class);
    }

    @Override
    public List<Formato5> listar(String ref) {
        return list("FROM Formato5 f5"
                + " WHERE f5.titulo LIKE '%"+ref+"%'");
    }

    @Override
    public List<Formato5> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato5 buscar(long id) {
        return search("FROM Formato5 f5"
                + " WHERE f5.idformato5= "+id);
    }

    @Override
    public Formato5 buscar(String ref) {
        return search("FROM Formato5 f5"
                + " WHERE f5.titulo= "+ref);
    }

    @Override
    public long id() {
        return maxId(Formato5.class);
    }
    
}

