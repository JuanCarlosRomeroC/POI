package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class MetaOperativaDA extends AbstractDA<MetaOperativa> implements Serializable {

    @Override
    public long registrar(MetaOperativa bean) {
        return save(bean);
    }

    @Override
    public long actualizar(MetaOperativa bean) {
        return update(bean);
    }

    @Override
    public long eliminar(MetaOperativa bean) {
        return delete(bean);
    }

    @Override
    public List<MetaOperativa> listar() {
        return list("FROM MetaOperativa mo"
                + " INNER JOIN FETCH mo.actividadOperativa ao"
                + " INNER JOIN FETCH ao.subgrupo sg"
                + " INNER JOIN FETCH sg.accionEstrategica ae"
                + " INNER JOIN FETCH ae.categoriaPresupuestal cp");
    }

    @Override
    public List<MetaOperativa> listar(String ref) {
        return list("FROM MetaOperativa mo"
                + " INNER JOIN FETCH mo.actividadOperativa ao"
                + " INNER JOIN FETCH ao.subgrupo sg"
                + " INNER JOIN FETCH sg.accionEstrategica ae"
                + " INNER JOIN FETCH ae.categoriaPresupuestal cp"
                + " WHERE mo.denominacion LIKE '%" + ref + "%'");
    }

    @Override
    public List<MetaOperativa> listar(long id) {
        return list("FROM MetaOperativa mo"
                + " INNER JOIN FETCH mo.actividadOperativa ao"
                + " INNER JOIN FETCH ao.subgrupo sg"
                + " INNER JOIN FETCH sg.accionEstrategica ae"
                + " INNER JOIN FETCH ae.categoriaPresupuestal cp"
                + " WHERE ao.idactividadOperativa=" + id);
    }

    @Override
    public MetaOperativa buscar(long id) {
        return search("FROM MetaOperativa mo"
                + " INNER JOIN FETCH mo.actividadOperativa ao"
                + " INNER JOIN FETCH ao.subgrupo sg"
                + " INNER JOIN FETCH sg.accionEstrategica ae"
                + " INNER JOIN FETCH ae.categoriaPresupuestal cp"
                + " WHERE mo.idmetaOperativa= " + id);
    }

    @Override
    public MetaOperativa buscar(String ref) {
        return search("FROM MetaOperativa mo"
                + " INNER JOIN FETCH mo.actividadOperativa ao"
                + " INNER JOIN FETCH ao.subgrupo sg"
                + " INNER JOIN FETCH sg.accionEstrategica ae"
                + " INNER JOIN FETCH ae.categoriaPresupuestal cp"
                + " WHERE mo.denominacion= " + ref);
    }

    @Override
    public long id() {
        return maxId(MetaOperativa.class);
    }

}
