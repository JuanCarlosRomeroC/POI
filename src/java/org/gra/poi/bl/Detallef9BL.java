package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef9BL  extends AbstractBL<Detallef9> implements Serializable{

    @Autowired
    @Qualifier("detallef9DA")
    private Detallef9DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef9DA) dao;
    }

    @Override
    public long registrar(Detallef9 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef9 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef9 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef9> listar() {
         return list();
    }

    @Override
    public List<Detallef9> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef9> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef9 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef9 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

