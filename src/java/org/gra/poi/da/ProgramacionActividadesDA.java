package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class ProgramacionActividadesDA  extends AbstractDA<ProgramacionActividades> implements Serializable{

    @Override
    public long registrar(ProgramacionActividades bean) {
        return save(bean);
    }

    @Override
    public long actualizar(ProgramacionActividades bean) {
        return update(bean);
    }

    @Override
    public long eliminar(ProgramacionActividades bean) {
        return delete(bean);
    }

    @Override
    public List<ProgramacionActividades> listar() {
        return list(ProgramacionActividades.class);
    }

    @Override
    public List<ProgramacionActividades> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProgramacionActividades> listar(long id) {
        return list("FROM ProgramacionActividades pa"
                    +" INNER JOIN FETCH pa.poi poi"
                    +" INNER JOIN FETCH pa.accionEstrategica ae"
                    +" INNER JOIN FETCH pa.categoriaPresupuestal cp"
                    +" INNER JOIN FETCH pa.formato1 f1"
                    +" INNER JOIN FETCH pa.formato2 f2"
                    +" INNER JOIN FETCH pa.formato3 f3"
                    +" INNER JOIN FETCH pa.formato4 f4"
                    +" INNER JOIN FETCH pa.formato5 f5"
                    +" INNER JOIN FETCH pa.formato6 f6"
                    +" INNER JOIN FETCH pa.formato7 f7"
                    +" INNER JOIN FETCH pa.formato8 f8"
                    +" INNER JOIN FETCH pa.formato9 f9"
                    +" INNER JOIN FETCH pa.organoUnidad ou"              
                    +" INNER JOIN FETCH pa.subgrupo sg"              
                    +" WHERE poi.idpoi="+id);
    }

    @Override
    public ProgramacionActividades buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProgramacionActividades buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

