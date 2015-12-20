package org.gra.poi.be;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Poi  implements java.io.Serializable {


     private long idpoi;
     private DocumentosGestionReferencial documentosGestionReferencialByIdOrganigrama;
     private DocumentosGestionReferencial documentosGestionReferencialByIdMarcoPresupuestario;
     private OePei oePei;
     private String introduccion;
     private String vision;
     private String mision;
     private String baseLegal;
     private String funcionesGenerales;
     private Integer periodo;
     private Set programacionActividadeses = new HashSet(0);

    public Poi() {
    }

	
    public Poi(long idpoi) {
        this.idpoi = idpoi;
    }
    public Poi(long idpoi, DocumentosGestionReferencial documentosGestionReferencialByIdOrganigrama, DocumentosGestionReferencial documentosGestionReferencialByIdMarcoPresupuestario, OePei oePei, String introduccion, String vision, String mision, String baseLegal, String funcionesGenerales, Integer periodo, Set programacionActividadeses) {
       this.idpoi = idpoi;
       this.documentosGestionReferencialByIdOrganigrama = documentosGestionReferencialByIdOrganigrama;
       this.documentosGestionReferencialByIdMarcoPresupuestario = documentosGestionReferencialByIdMarcoPresupuestario;
       this.oePei = oePei;
       this.introduccion = introduccion;
       this.vision = vision;
       this.mision = mision;
       this.baseLegal = baseLegal;
       this.funcionesGenerales = funcionesGenerales;
       this.periodo = periodo;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdpoi() {
        return this.idpoi;
    }
    
    public void setIdpoi(long idpoi) {
        this.idpoi = idpoi;
    }
    public DocumentosGestionReferencial getDocumentosGestionReferencialByIdOrganigrama() {
        return this.documentosGestionReferencialByIdOrganigrama;
    }
    
    public void setDocumentosGestionReferencialByIdOrganigrama(DocumentosGestionReferencial documentosGestionReferencialByIdOrganigrama) {
        this.documentosGestionReferencialByIdOrganigrama = documentosGestionReferencialByIdOrganigrama;
    }
    public DocumentosGestionReferencial getDocumentosGestionReferencialByIdMarcoPresupuestario() {
        return this.documentosGestionReferencialByIdMarcoPresupuestario;
    }
    
    public void setDocumentosGestionReferencialByIdMarcoPresupuestario(DocumentosGestionReferencial documentosGestionReferencialByIdMarcoPresupuestario) {
        this.documentosGestionReferencialByIdMarcoPresupuestario = documentosGestionReferencialByIdMarcoPresupuestario;
    }
    public OePei getOePei() {
        return this.oePei;
    }
    
    public void setOePei(OePei oePei) {
        this.oePei = oePei;
    }
    public String getIntroduccion() {
        return this.introduccion;
    }
    
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getVision() {
        return this.vision;
    }
    
    public void setVision(String vision) {
        this.vision = vision;
    }
    public String getMision() {
        return this.mision;
    }
    
    public void setMision(String mision) {
        this.mision = mision;
    }
    public String getBaseLegal() {
        return this.baseLegal;
    }
    
    public void setBaseLegal(String baseLegal) {
        this.baseLegal = baseLegal;
    }
    public String getFuncionesGenerales() {
        return this.funcionesGenerales;
    }
    
    public void setFuncionesGenerales(String funcionesGenerales) {
        this.funcionesGenerales = funcionesGenerales;
    }
    public Integer getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


