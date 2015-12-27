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
        return list("FROM RolUsuario ru"
                + " WHERE ru.nombreModulo LIKE '%"+ref+"%'");
    }

    @Override
    public List<RolUsuario> listar(long id) {
        return list("FROM RolUsuario ru"
                +" INNER JOIN FETCH ru.usuario u"
                +" WHERE u.idusuario="+id);
    }

    @Override
    public RolUsuario buscar(long id) {
        return search("FROM RolUsuario ru"
                + " WHERE ru.idrolUsuario= "+id);
    }

    @Override
    public RolUsuario buscar(String ref) {
        return search("FROM RolUsuario ru"
                + " WHERE ru.nombreModulo= "+ref);
    }

    @Override
    public long id() {
        return maxId(RolUsuario.class);
    }
    
}

