package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class UsuarioDA  extends AbstractDA<Usuario> implements Serializable{

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
        return list(Usuario.class);
    }

    @Override
    public List<Usuario> listar(String ref) {
        return list("FROM Usuario u"
                + " WHERE u.nombre LIKE '%"+ref+"%'");
    }

    @Override
    public List<Usuario> listar(long id) {
        return list("FROM Usuario u"
                +" INNER JOIN FETCH u.empleado e"
                +" WHERE e.idempleado="+id);
    }

    @Override
    public Usuario buscar(long id) {
        return search("FROM Usuario u"
                + " WHERE u.idusuario= "+id);
    }

    @Override
    public Usuario buscar(String ref) {
        return search("FROM Usuario u"
                + " WHERE u.nombre= "+ref);
    }

    @Override
    public long id() {
        return maxId(Usuario.class);
    }
}


