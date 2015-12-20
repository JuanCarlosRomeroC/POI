package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class EmpleadoBL  extends AbstractBL<Empleado> implements Serializable{

    @Autowired
    @Qualifier("empleadoDA")
    private EmpleadoDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (EmpleadoDA) dao;
    }

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
         return list();
    }

    @Override
    public List<Empleado> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<Empleado> listar(long id) {
        return list(id);
    }

    @Override
    public Empleado buscar(long id) {
        return search(id);
    }

    @Override
    public Empleado buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

