package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class UsuarioBL  extends AbstractBL<Usuario> implements Serializable{

    @Autowired
    @Qualifier("usuarioDA")
    private UsuarioDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (UsuarioDA) dao;
    }

    @Override
    public long registrar(Usuario bean) {
         return save(bean);
    }

    @Override
    public long actualizar(Usuario bean) {
         return update(bean);
    }

    @Override
    public long eliminar(Usuario bean) {
         return delete(bean);
    }

    @Override
    public List<Usuario> listar() {
         return list();
    }

    @Override
    public List<Usuario> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Usuario> listar(long id) {
        return list(id);
    }

    @Override
    public Usuario buscar(long id) {
        return search(id);
    }

    @Override
    public Usuario buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

