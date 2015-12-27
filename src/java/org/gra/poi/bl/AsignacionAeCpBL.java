package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class AsignacionAeCpBL  extends AbstractBL<AsignacionAeCp> implements Serializable{

    @Autowired
    @Qualifier("asignacionAeCpDA")
    private AsignacionAeCpDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (AsignacionAeCpDA) dao;
    }

    @Override
    public long registrar(AsignacionAeCp bean) {
         return save(bean);
    }

    @Override
    public long actualizar(AsignacionAeCp bean) {
         return update(bean);
    }

    @Override
    public long eliminar(AsignacionAeCp bean) {
         return delete(bean);
    }

    @Override
    public List<AsignacionAeCp> listar() {
         return list();
    }

    @Override
    public List<AsignacionAeCp> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<AsignacionAeCp> listar(long id) {        
        return list(id);
    }

    @Override
    public AsignacionAeCp buscar(long id) {
        return search(id);
    }

    @Override
    public AsignacionAeCp buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

