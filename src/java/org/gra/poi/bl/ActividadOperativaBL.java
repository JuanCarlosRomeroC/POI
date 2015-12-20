package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class ActividadOperativaBL  extends AbstractBL<ActividadOperativa> implements Serializable{

    @Autowired
    @Qualifier("actividadOperativaDA")
    private ActividadOperativaDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (ActividadOperativaDA) dao;
    }

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
         return list();
    }

    @Override
    public List<ActividadOperativa> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<ActividadOperativa> listar(long id) {
        return list(id);
    }

    @Override
    public ActividadOperativa buscar(long id) {
        return search(id);
    }

    @Override
    public ActividadOperativa buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    } 
}

