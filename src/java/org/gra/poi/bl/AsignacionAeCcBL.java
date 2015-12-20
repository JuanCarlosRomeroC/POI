package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class AsignacionAeCcBL  extends AbstractBL<AsignacionAeCc> implements Serializable{

    @Autowired
    @Qualifier("asignacionAeCcDA")
    private AsignacionAeCcDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (AsignacionAeCcDA) dao;
    }

    @Override
    public long registrar(AsignacionAeCc bean) {
         return save(bean);
    }

    @Override
    public long actualizar(AsignacionAeCc bean) {
         return update(bean);
    }

    @Override
    public long eliminar(AsignacionAeCc bean) {
         return delete(bean);
    }

    @Override
    public List<AsignacionAeCc> listar() {
         return list();
    }

    @Override
    public List<AsignacionAeCc> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<AsignacionAeCc> listar(long id) {
        return list(id);
    }

    @Override
    public AsignacionAeCc buscar(long id) {
        return search(id);
    }

    @Override
    public AsignacionAeCc buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

