package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef4BL  extends AbstractBL<Detallef4> implements Serializable{

    @Autowired
    @Qualifier("detallef4DA")
    private Detallef4DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef4DA) dao;
    }

    @Override
    public long registrar(Detallef4 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef4 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef4 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef4> listar() {
         return list();
    }

    @Override
    public List<Detallef4> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef4> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef4 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef4 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

