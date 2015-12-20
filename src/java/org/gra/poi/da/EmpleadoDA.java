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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

