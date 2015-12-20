package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef6BL  extends AbstractBL<Detallef6> implements Serializable{

    @Autowired
    @Qualifier("detallef6DA")
    private Detallef6DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef6DA) dao;
    }

    @Override
    public long registrar(Detallef6 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef6 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef6 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef6> listar() {
         return list();
    }

    @Override
    public List<Detallef6> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef6> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef6 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef6 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

