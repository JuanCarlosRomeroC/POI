package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class OePeiBL  extends AbstractBL<OePei> implements Serializable{

    @Autowired
    @Qualifier("oePeiDA")
    private OePeiDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (OePeiDA) dao;
    }

    @Override
    public long registrar(OePei bean) {
         return save(bean);
    }

    @Override
    public long actualizar(OePei bean) {
         return update(bean);
    }

    @Override
    public long eliminar(OePei bean) {
         return delete(bean);
    }

    @Override
    public List<OePei> listar() {
         return list();
    }

    @Override
    public List<OePei> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<OePei> listar(long id) {
        return list(id);
    }

    @Override
    public OePei buscar(long id) {
        return search(id);
    }

    @Override
    public OePei buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

