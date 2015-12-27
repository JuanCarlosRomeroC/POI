package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato1DA  extends AbstractDA<Formato1> implements Serializable{

    @Override
    public long registrar(Formato1 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato1 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato1 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato1> listar() {
        return list(Formato1.class);
    }

    @Override
    public List<Formato1> listar(String ref) {
        return list("FROM Formato1 f1"
                + " WHERE f1.titulo LIKE '%"+ref+"%'");
    }

    @Override
    public List<Formato1> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato1 buscar(long id) {
        return search("FROM Formato1 f1"
                + " WHERE f1.idformato1= "+id);
    }

    @Override
    public Formato1 buscar(String ref) {
        return search("FROM Formato1 f1"
                + " WHERE f1.titulo= "+ref);
    }

    @Override
    public long id() {
        return maxId(Formato1.class);
    }
    
}

