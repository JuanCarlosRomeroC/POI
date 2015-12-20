package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class EspecificaGastoBL  extends AbstractBL<EspecificaGasto> implements Serializable{

    @Autowired
    @Qualifier("especificaGastoDA")
    private EspecificaGastoDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (EspecificaGastoDA) dao;
    }

    @Override
    public long registrar(EspecificaGasto bean) {
         return save(bean);
    }

    @Override
    public long actualizar(EspecificaGasto bean) {
         return update(bean);
    }

    @Override
    public long eliminar(EspecificaGasto bean) {
         return delete(bean);
    }

    @Override
    public List<EspecificaGasto> listar() {
         return list();
    }

    @Override
    public List<EspecificaGasto> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<EspecificaGasto> listar(long id) {
        return list(id);
    }

    @Override
    public EspecificaGasto buscar(long id) {
        return search(id);
    }

    @Override
    public EspecificaGasto buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

