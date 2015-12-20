package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef5BL  extends AbstractBL<Detallef5> implements Serializable{

    @Autowired
    @Qualifier("detallef5DA")
    private Detallef5DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef5DA) dao;
    }

    @Override
    public long registrar(Detallef5 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef5 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef5 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef5> listar() {
         return list();
    }

    @Override
    public List<Detallef5> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef5> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef5 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef5 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

