package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class CategoriaPresupuestalBL  extends AbstractBL<CategoriaPresupuestal> implements Serializable{

    @Autowired
    @Qualifier("categoriaPresupuestalDA")
    private CategoriaPresupuestalDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CategoriaPresupuestalDA) dao;
    }

    @Override
    public long registrar(CategoriaPresupuestal bean) {
         return save(bean);
    }

    @Override
    public long actualizar(CategoriaPresupuestal bean) {
         return update(bean);
    }

    @Override
    public long eliminar(CategoriaPresupuestal bean) {
         return delete(bean);
    }

    @Override
    public List<CategoriaPresupuestal> listar() {
         return list();
    }

    @Override
    public List<CategoriaPresupuestal> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<CategoriaPresupuestal> listar(long id) {
        return list(id);
    }

    @Override
    public CategoriaPresupuestal buscar(long id) {
        return search(id);
    }

    @Override
    public CategoriaPresupuestal buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

