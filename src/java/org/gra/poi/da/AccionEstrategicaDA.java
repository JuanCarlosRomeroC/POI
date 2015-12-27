package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class AccionEstrategicaDA  extends AbstractDA<AccionEstrategica> implements Serializable{

    @Override
    public long registrar(AccionEstrategica bean) {
        return save(bean);
    }

    @Override
    public long actualizar(AccionEstrategica bean) {
        return update(bean);
    }

    @Override
    public long eliminar(AccionEstrategica bean) {
        return delete(bean);
    }

    @Override
    public List<AccionEstrategica> listar() {
        return list(AccionEstrategica.class);
    }

    @Override
    public List<AccionEstrategica> listar(String ref) {
        return list("FROM AccionEstrategica ae"
                + " WHERE CONCAT(ae.denominacion,ae.codigo) LIKE '%"+ref+"%'");
    }

    @Override
    public List<AccionEstrategica> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccionEstrategica buscar(long id) {
        return search("FROM AccionEstrategica ae"
                + " WHERE ae.idaccionEstrategica= "+id);
    }

    @Override
    public AccionEstrategica buscar(String ref) {
        return search("FROM AccionEstrategica ae"
                + " WHERE CONCAT(ae.denominacion,ae.codigo)= "+ref);
    }

    @Override
    public long id() {
        return maxId(AccionEstrategica.class);
    }
    
}
