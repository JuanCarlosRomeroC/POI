package org.gra.poi.da;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.gra.poi.be.*;
import org.gra.poi.utl.*;

@Repository
public class DocumentosGestionReferencialDA  extends AbstractDA<DocumentosGestionReferencial> implements Serializable{

    @Override
    public long registrar(DocumentosGestionReferencial bean) {
        return save(bean);
    }

    @Override
    public long actualizar(DocumentosGestionReferencial bean) {
        return update(bean);
    }

    @Override
    public long eliminar(DocumentosGestionReferencial bean) {
        return delete(bean);
    }

    @Override
    public List<DocumentosGestionReferencial> listar() {
        return list(DocumentosGestionReferencial.class);
    }

    @Override
    public List<DocumentosGestionReferencial> listar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DocumentosGestionReferencial> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DocumentosGestionReferencial buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DocumentosGestionReferencial buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

