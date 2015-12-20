package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class CentroCostoBL  extends AbstractBL<CentroCosto> implements Serializable{

    @Autowired
    @Qualifier("centroCostoDA")
    private CentroCostoDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CentroCostoDA) dao;
    }

    @Override
    public long registrar(CentroCosto bean) {
         return save(bean);
    }

    @Override
    public long actualizar(CentroCosto bean) {
         return update(bean);
    }

    @Override
    public long eliminar(CentroCosto bean) {
         return delete(bean);
    }

    @Override
    public List<CentroCosto> listar() {
         return list();
    }

    @Override
    public List<CentroCosto> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<CentroCosto> listar(long id) {
        return list(id);
    }

    @Override
    public CentroCosto buscar(long id) {
        return search(id);
    }

    @Override
    public CentroCosto buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

