package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class AccionEstrategicaBL  extends AbstractBL<AccionEstrategica> implements Serializable{

    @Autowired
    @Qualifier("accionEstrategicaDA")
    private AccionEstrategicaDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (AccionEstrategicaDA) dao;
    }

    @Override
    public long registrar(AccionEstrategica bean) {
         return save(bean);
    }

    @Override
    public long actualizar(AccionEstrategica bean) {
         return update(bean);
    }

    @Override
    public long eliminar(AccionEstrategica bean) {
         return delete(bean);
    }

    @Override
    public List<AccionEstrategica> listar() {
         return list();
    }

    @Override
    public List<AccionEstrategica> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<AccionEstrategica> listar(long id) {
        return list(id);
    }
    
    public List<AccionEstrategica> listarCP_CC(long id_cp,long id_cc) {
        return dao.listarCP_CC(id_cc, id_cc);
    }
    public List<AccionEstrategica> listarCP_OE(long id_cp,long id_oe) {
        return dao.listarCP_OE(id_cp, id_oe);
    }
    public List<AccionEstrategica> listarCC_OE(long id_cc,long id_oe) {
        return dao.listarCC_OE(id_cc, id_oe);
    }

    @Override
    public AccionEstrategica buscar(long id) {
        return search(id);
    }

    @Override
    public AccionEstrategica
         buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    } 
}
