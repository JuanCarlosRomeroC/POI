package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class Formato8BL  extends AbstractBL<Formato8> implements Serializable{

    @Autowired
    @Qualifier("formato8DA")
    private Formato8DA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (Formato8DA) dao;
    }

    @Override
    public long registrar(Formato8 bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Formato8 bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Formato8 bean) {
         return delete(bean);
    }

    @Override
    public List<Formato8> listar() {
         return list();
    }

    @Override
    public List<Formato8> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Formato8> listar(long id) {
        return list(id);
    }

    @Override
    public Formato8 buscar(long id) {
        return search(id);
    }

    @Override
    public Formato8 buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

