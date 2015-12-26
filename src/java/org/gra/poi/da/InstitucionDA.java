package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class InstitucionDA extends AbstractDA<Institucion> implements Serializable {

    @Override
    public long registrar(Institucion bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Institucion bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Institucion bean) {
        return delete(bean);
    }

    @Override
    public List<Institucion> listar() {
        return list(Institucion.class);
    }

    @Override
    public List<Institucion> listar(String ref) {
        return list("FROM Institucion i"
                + " WHERE i.denominacion LIKE '%" + ref + "%'");
    }

    @Override
    public List<Institucion> listar(long id) { //No tiene tabla maestra del cual dependa
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Institucion buscar(long id) {
        return search("FROM Institucion i"
                + " WHERE i.idinstitucion= "+id);
    }

    @Override
    public Institucion buscar(String ref) {
        return search("FROM Institucion i"
                + " WHERE i.denominacion= "+ref);
    }

    @Override
    public long id() {
        return maxId(Institucion.class);
    }
}
