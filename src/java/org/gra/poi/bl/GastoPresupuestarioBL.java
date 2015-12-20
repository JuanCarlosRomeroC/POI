package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class GastoPresupuestarioBL  extends AbstractBL<GastoPresupuestario> implements Serializable{

    @Autowired
    @Qualifier("gastoPresupuestarioDA")
    private GastoPresupuestarioDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (GastoPresupuestarioDA) dao;
    }

    @Override
    public long registrar(GastoPresupuestario bean) {
         return save(bean);
    }

    @Override
    public long actualizar(GastoPresupuestario bean) {
         return update(bean);
    }

    @Override
    public long eliminar(GastoPresupuestario bean) {
         return delete(bean);
    }

    @Override
    public List<GastoPresupuestario> listar() {
         return list();
    }

    @Override
    public List<GastoPresupuestario> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<GastoPresupuestario> listar(long id) {
        return list(id);
    }

    @Override
    public GastoPresupuestario buscar(long id) {
        return search(id);
    }

    @Override
    public GastoPresupuestario buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

