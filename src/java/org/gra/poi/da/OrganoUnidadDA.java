package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class OrganoUnidadDA  extends AbstractDA<OrganoUnidad> implements Serializable{

    @Override
    public long registrar(OrganoUnidad bean) {
        return save(bean);
    }

    @Override
    public long actualizar(OrganoUnidad bean) {
        return update(bean);
    }

    @Override
    public long eliminar(OrganoUnidad bean) {
        return delete(bean);
    }

    @Override
    public List<OrganoUnidad> listar() {
        return list("FROM OrganoUnidad");
    }

    @Override
    public List<OrganoUnidad> listar(String ref) {
        return list("FROM OrganoUnidad ou"
                + " WHERE CONCAT(ou.denominacion,ou.tipoOrgano,uo.codigo) LIKE '%"+ref+"%'");
    }

    @Override
    public List<OrganoUnidad> listar(long id) {
        return list("FROM OrganoUnidad ou"
                +" INNER JOIN FETCH ou.institucion i"
                +" WHERE i.idinstitucion="+id);
    }

    @Override
    public OrganoUnidad buscar(long id) {
        return search("FROM OrganoUnidad ou"
                + " WHERE ou.idorgano= "+id);
    }

    @Override
    public OrganoUnidad buscar(String ref) {
        return search("FROM OrganoUnidad ou"
                + " WHERE CONCAT(ou.denominacion,ou.tipoOrgano,uo.codigo)= "+ref);
    }

    @Override
    public long id() {
        return maxId(OrganoUnidad.class);
    }   
}

