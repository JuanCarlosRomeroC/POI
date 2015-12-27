package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class EmpleadoDA  extends AbstractDA<Empleado> implements Serializable{

    @Override
    public long registrar(Empleado bean) {
        return save(bean);
    }

    @Override
    public long actualizar(Empleado bean) {
        return update(bean);
    }

    @Override
    public long eliminar(Empleado bean) {
        return delete(bean);
    }

    @Override
    public List<Empleado> listar() {
        return list(Empleado.class);
    }

    @Override
    public List<Empleado> listar(String ref) {
        return list("FROM Empleado e"
                + " WHERE CONCAT(e.nombre,e.apellidoPaterno,e.dni,e.condicion) LIKE '%"+ref+"%'");
    }

    @Override
    public List<Empleado> listar(long id) {
        return list("FROM Empleado e"
                +" INNER JOIN FETCH e.organoUnidad ou"
                +" WHERE ou.idorgano="+id);
    }

    @Override
    public Empleado buscar(long id) {
        return search("FROM Empleado e"
                + " WHERE e.idempleado= "+id);
    }

    @Override
    public Empleado buscar(String ref) {
        return search("FROM Empleado e"
                + " WHERE CONCAT(e.nombre,e.apellidoPaterno,e.dni,e.condicion)= "+ref);
    }

    @Override
    public long id() {
        return maxId(Empleado.class);
    }
    
}

