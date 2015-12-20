package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Formato5BL  extends AbstractBL<Formato5> implements Serializable{

    @Autowired
    @Qualifier("formato5DA")
    private Formato5DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Formato5DA) dao;
    }

    @Override
    public long registrar(Formato5 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Formato5 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Formato5 bean) {
         return delete(bean);
    }

    @Override
    public List<Formato5> listar() {
         return list();
    }

    @Override
    public List<Formato5> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Formato5> listar(long id) {
        return list(id);
    }

    @Override
    public Formato5 buscar(long id) {
        return search(id);
    }

    @Override
    public Formato5 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

