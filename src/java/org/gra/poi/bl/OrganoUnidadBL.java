package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class OrganoUnidadBL  extends AbstractBL<OrganoUnidad> implements Serializable{

    @Autowired
    @Qualifier("organoUnidadDA")
    private OrganoUnidadDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (OrganoUnidadDA) dao;
    }

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
         return list();
    }

    @Override
    public List<OrganoUnidad> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<OrganoUnidad> listar(long id) {
        return list(id);
    }

    @Override
    public OrganoUnidad buscar(long id) {
        return search(id);
    }

    @Override
    public OrganoUnidad buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

