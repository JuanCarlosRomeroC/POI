package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class Formato4DA  extends AbstractDA<Formato4> implements Serializable{

    @Override
    public long registrar(Formato4 bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Formato4 bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Formato4 bean) {
        return delete(bean);
    }

    @Override
    public List<Formato4> listar() {
        return list(Formato4.class);
    }

    @Override
    public List<Formato4> listar(String ref) {
        return list("FROM Formato4 f4"
                + " WHERE f4.titulo LIKE '%"+ref+"%'");
    }

    @Override
    public List<Formato4> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formato4 buscar(long id) {
        return search("FROM Formato4 f4"
                + " WHERE f4.idformato4= "+id);
    }

    @Override
    public Formato4 buscar(String ref) {
        return search("FROM Formato4 f4"
                + " WHERE f4.titulo= "+ref);
    }

    @Override
    public long id() {
        return maxId(Formato4.class);
    }
    
}

