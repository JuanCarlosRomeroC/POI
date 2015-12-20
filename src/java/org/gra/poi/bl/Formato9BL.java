package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Formato9BL  extends AbstractBL<Formato9> implements Serializable{

    @Autowired
    @Qualifier("formato9DA")
    private Formato9DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Formato9DA) dao;
    }

    @Override
    public long registrar(Formato9 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Formato9 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Formato9 bean) {
         return delete(bean);
    }

    @Override
    public List<Formato9> listar() {
         return list();
    }

    @Override
    public List<Formato9> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Formato9> listar(long id) {
        return list(id);
    }

    @Override
    public Formato9 buscar(long id) {
        return search(id);
    }

    @Override
    public Formato9 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

