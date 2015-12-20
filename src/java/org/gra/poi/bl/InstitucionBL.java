package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class InstitucionBL  extends AbstractBL<Institucion> implements Serializable{

    @Autowired
    @Qualifier("institucionDA")
    private InstitucionDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (InstitucionDA) dao;
    }

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
         return list();
    }

    @Override
    public List<Institucion> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Institucion> listar(long id) {
        return list(id);
    }

    @Override
    public Institucion buscar(long id) {
        return search(id);
    }

    @Override
    public Institucion buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

