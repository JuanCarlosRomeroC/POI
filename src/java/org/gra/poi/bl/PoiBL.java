package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class PoiBL  extends AbstractBL<Poi> implements Serializable{

    @Autowired
    @Qualifier("poiDA")
    private PoiDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (PoiDA) dao;
    }

    @Override
    public long registrar(Poi bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Poi bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Poi bean) {
         return delete(bean);
    }

    @Override
    public List<Poi> listar() {
         return list();
    }

    @Override
    public List<Poi> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Poi> listar(long id) {
        return list(id);
    }

    @Override
    public Poi buscar(long id) {
        return search(id);
    }

    @Override
    public Poi buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

