package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class EspecificaGastoDA  extends AbstractDA<EspecificaGasto> implements Serializable{

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
        return list(EspecificaGasto.class);
    }

    @Override
    public List<EspecificaGasto> listar(String ref) {
        return list("FROM EspecificaGasto eg"
                + " WHERE CONCAT(eg.denominacion,eg.especifica) LIKE '%"+ref+"%'");
    }

    @Override
    public List<EspecificaGasto> listar(long id) {
        return list("FROM EspecificaGasto eg"
                +" INNER JOIN FETCH eg.gastoPresupuestario gp"
                +" WHERE gp.idgastoPresupuestario="+id);
    }

    @Override
    public EspecificaGasto buscar(long id) {
        return search("FROM EspecificaGasto eg"
                + " WHERE eg.idespecificaGasto= "+id);
    }

    @Override
    public EspecificaGasto buscar(String ref) {
        return search("FROM EspecificaGasto eg"
                + " WHERE CONCAT(eg.denominacion,eg.especifica)= "+ref);
    }

    @Override
    public long id() {
        return maxId(EspecificaGasto.class);
    }    
}

