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
        return list("FROM DocumentosGestionReferencial dg"
                + " WHERE dg.titulo LIKE '%"+ref+"%'");
    }

    @Override
    public List<DocumentosGestionReferencial> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DocumentosGestionReferencial buscar(long id) {
        return search("FROM DocumentosGestionReferencial dg"
                + " WHERE dg.iddocumento= "+id);
    }

    @Override
    public DocumentosGestionReferencial buscar(String ref) {
        return search("FROM DocumentosGestionReferencial dg"
                + " WHERE dg.titulo= "+ref);
    }

    @Override
    public long id() {
        return maxId(DocumentosGestionReferencial.class);
    }
    
}

