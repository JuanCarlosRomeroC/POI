package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef1BL  extends AbstractBL<Detallef1> implements Serializable{

    @Autowired
    @Qualifier("detallef1DA")
    private Detallef1DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef1DA) dao;
    }

    @Override
    public long registrar(Detallef1 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef1 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef1 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef1> listar() {
         return list();
    }

    @Override
    public List<Detallef1> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef1> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef1 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef1 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

