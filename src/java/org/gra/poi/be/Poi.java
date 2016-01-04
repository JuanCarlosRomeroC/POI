package org.gra.poi.be;
// Generated 04/01/2016 10:07:34 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Poi  implements java.io.Serializable {


     private long idpoi;
     private DocumentosGestionReferencial documentosGestionReferencial;
     private MarcoPresupuestario marcoPresupuestario;
     private String introduccion;
     private String vision;
     private String mision;
     private String baseLegal;
     private String funcionesGenerales;
     private Integer periodo;
     private Set programacionActividadeses = new HashSet(0);
     private Set detallePois = new HashSet(0);

    public Poi() {
    }

	
    public Poi(long idpoi) {
        this.idpoi = idpoi;
    }
    public Poi(long idpoi, DocumentosGestionReferencial documentosGestionReferencial, MarcoPresupuestario marcoPresupuestario, String introduccion, String vision, String mision, String baseLegal, String funcionesGenerales, Integer periodo, Set programacionActividadeses, Set detallePois) {
       this.idpoi = idpoi;
       this.documentosGestionReferencial = documentosGestionReferencial;
       this.marcoPresupuestario = marcoPresupuestario;
       this.introduccion = introduccion;
       this.vision = vision;
       this.mision = mision;
       this.baseLegal = baseLegal;
       this.funcionesGenerales = funcionesGenerales;
       this.periodo = periodo;
       this.programacionActividadeses = programacionActividadeses;
       this.detallePois = detallePois;
    }
   
    public long getIdpoi() {
        return this.idpoi;
    }
    
    public void setIdpoi(long idpoi) {
        this.idpoi = idpoi;
    }
    public DocumentosGestionReferencial getDocumentosGestionReferencial() {
        return this.documentosGestionReferencial;
    }
    
    public void setDocumentosGestionReferencial(DocumentosGestionReferencial documentosGestionReferencial) {
        this.documentosGestionReferencial = documentosGestionReferencial;
    }
    public MarcoPresupuestario getMarcoPresupuestario() {
        return this.marcoPresupuestario;
    }
    
    public void setMarcoPresupuestario(MarcoPresupuestario marcoPresupuestario) {
        this.marcoPresupuestario = marcoPresupuestario;
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
    public Set getDetallePois() {
        return this.detallePois;
    }
    
    public void setDetallePois(Set detallePois) {
        this.detallePois = detallePois;
    }




}


