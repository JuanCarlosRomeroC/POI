package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef2BL  extends AbstractBL<Detallef2> implements Serializable{

    @Autowired
    @Qualifier("detallef2DA")
    private Detallef2DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef2DA) dao;
    }

    @Override
    public long registrar(Detallef2 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef2 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef2 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef2> listar() {
         return list();
    }

    @Override
    public List<Detallef2> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef2> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef2 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef2 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

