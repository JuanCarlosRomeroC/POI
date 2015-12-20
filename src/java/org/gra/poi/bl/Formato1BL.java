package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Formato1BL  extends AbstractBL<Formato1> implements Serializable{

    @Autowired
    @Qualifier("formato1DA")
    private Formato1DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Formato1DA) dao;
    }

    @Override
    public long registrar(Formato1 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Formato1 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Formato1 bean) {
         return delete(bean);
    }

    @Override
    public List<Formato1> listar() {
         return list();
    }

    @Override
    public List<Formato1> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Formato1> listar(long id) {
        return list(id);
    }

    @Override
    public Formato1 buscar(long id) {
        return search(id);
    }

    @Override
    public Formato1 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

