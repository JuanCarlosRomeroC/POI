package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class RolUsuarioBL  extends AbstractBL<RolUsuario> implements Serializable{

    @Autowired
    @Qualifier("rolUsuarioDA")
    private RolUsuarioDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (RolUsuarioDA) dao;
    }

    @Override
    public long registrar(RolUsuario bean) {
         return save(bean);
    }

    @Override
    public long actualizar(RolUsuario bean) {
         return update(bean);
    }

    @Override
    public long eliminar(RolUsuario bean) {
         return delete(bean);
    }

    @Override
    public List<RolUsuario> listar() {
         return list();
    }

    @Override
    public List<RolUsuario> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<RolUsuario> listar(long id) {
        return list(id);
    }

    @Override
    public RolUsuario buscar(long id) {
        return search(id);
    }

    @Override
    public RolUsuario buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}
