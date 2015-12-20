package org.gra.poi.bl;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.gra.poi.be.*;
import org.gra.poi.da.*;
import org.gra.poi.utl.*;

@Service
public class DocumentosGestionReferencialBL  extends AbstractBL<DocumentosGestionReferencial> implements Serializable{

    @Autowired
    @Qualifier("documentosGestionReferencialDA")
    private DocumentosGestionReferencialDA dao;
    
    @Override
    public AbstractDA getDAO() {
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (DocumentosGestionReferencialDA) dao;
    }

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
         return list();
    }

    @Override
    public List<DocumentosGestionReferencial> listar(String ref) {
        return list(ref);
    }

    @Override
    public List<DocumentosGestionReferencial> listar(long id) {
        return list(id);
    }

    @Override
    public DocumentosGestionReferencial buscar(long id) {
        return search(id);
    }

    @Override
    public DocumentosGestionReferencial buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        return maxId();
    }
    
}

