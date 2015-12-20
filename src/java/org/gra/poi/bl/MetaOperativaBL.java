package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class MetaOperativaBL  extends AbstractBL<MetaOperativa> implements Serializable{

    @Autowired
    @Qualifier("metaOperativaDA")
    private MetaOperativaDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (MetaOperativaDA) dao;
    }

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
         return list();
    }

    @Override
    public List<MetaOperativa> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<MetaOperativa> listar(long id) {
        return list(id);
    }

    @Override
    public MetaOperativa buscar(long id) {
        return search(id);
    }

    @Override
    public MetaOperativa buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

