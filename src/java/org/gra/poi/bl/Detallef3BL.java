package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Detallef3BL  extends AbstractBL<Detallef3> implements Serializable{

    @Autowired
    @Qualifier("detallef3DA")
    private Detallef3DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Detallef3DA) dao;
    }

    @Override
    public long registrar(Detallef3 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Detallef3 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Detallef3 bean) {
         return delete(bean);
    }

    @Override
    public List<Detallef3> listar() {
         return list();
    }

    @Override
    public List<Detallef3> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Detallef3> listar(long id) {
        return list(id);
    }

    @Override
    public Detallef3 buscar(long id) {
        return search(id);
    }

    @Override
    public Detallef3 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

