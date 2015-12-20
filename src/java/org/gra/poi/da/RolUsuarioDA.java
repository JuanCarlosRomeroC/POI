package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class RolUsuarioDA  extends AbstractDA<RolUsuario> implements Serializable{

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
        return list(RolUsuario.class);
    }

    @Override
    public List<RolUsuario> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RolUsuario> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolUsuario buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RolUsuario buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

