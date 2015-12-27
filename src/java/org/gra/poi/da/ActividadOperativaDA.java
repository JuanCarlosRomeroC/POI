package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class ActividadOperativaDA  extends AbstractDA<ActividadOperativa> implements Serializable{

    @Override
    public long registrar(ActividadOperativa bean) {
        return save(bean);
    }

    @Override
    public long actualizar(ActividadOperativa bean) {
        return update(bean);
    }

    @Override
    public long eliminar(ActividadOperativa bean) {
        return delete(bean);
    }

    @Override
    public List<ActividadOperativa> listar() {
        return list(ActividadOperativa.class);
    }

    @Override
    public List<ActividadOperativa> listar(String ref) {
        return list("FROM ActividadOperativa ao"
                + " WHERE CONCAT(ao.denominacion,ao.codigo) LIKE '%"+ref+"%'");
    }

    @Override
    public List<ActividadOperativa> listar(long id) {
        return list("FROM ActividadOperativa ao"
                +" INNER JOIN FETCH ao.subgrupo sg"
                +" WHERE sg.idsubgrupo="+id);
    }

    @Override
    public ActividadOperativa buscar(long id) {
        return search("FROM ActividadOperativa ao"
                + " WHERE ao.idactividadOperativa= "+id);
    }

    @Override
    public ActividadOperativa buscar(String ref) {
        return search("FROM ActividadOperativa ao"
                + " WHERE CONCAT(ao.denominacion,ao.codigo)= "+ref);
    }

    @Override
    public long id() {
        return maxId(ActividadOperativa.class);
    }
    
}

