package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef7BL  extends AbstractBL<Detallef7> implements Serializable{

    @Autowired
    @Qualifier("detallef7DA")
    private Detallef7DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef7DA) dao;
    }

    @Override
    public long registrar(Detallef7 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef7 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef7 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef7> listar() {
         return list();
    }

    @Override
    public List<Detallef7> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef7> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef7 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef7 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

