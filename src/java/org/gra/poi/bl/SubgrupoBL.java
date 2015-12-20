package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class SubgrupoBL  extends AbstractBL<Subgrupo> implements Serializable{

    @Autowired
    @Qualifier("subgrupoDA")
    private SubgrupoDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (SubgrupoDA) dao;
    }

    @Override
    public long registrar(Subgrupo bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Subgrupo bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Subgrupo bean) {
         return delete(bean);
    }

    @Override
    public List<Subgrupo> listar() {
         return list();
    }

    @Override
    public List<Subgrupo> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Subgrupo> listar(long id) {
        return list(id);
    }

    @Override
    public Subgrupo buscar(long id) {
        return search(id);
    }

    @Override
    public Subgrupo buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

