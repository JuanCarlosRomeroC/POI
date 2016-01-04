package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Institucion  implements java.io.Serializable {


     private long idinstitucion;
     private String denominacion;
     private String codigo;
     private Set marcoPresupuestarios = new HashSet(0);
     private Set documentosGestionReferencials = new HashSet(0);
     private Set organoUnidads = new HashSet(0);

    public Institucion() {
    }

	
    public Institucion(long idinstitucion) {
        this.idinstitucion = idinstitucion;
    }
    public Institucion(long idinstitucion, String denominacion, String codigo, Set marcoPresupuestarios, Set documentosGestionReferencials, Set organoUnidads) {
       this.idinstitucion = idinstitucion;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.marcoPresupuestarios = marcoPresupuestarios;
       this.documentosGestionReferencials = documentosGestionReferencials;
       this.organoUnidads = organoUnidads;
    }
   
    public long getIdinstitucion() {
        return this.idinstitucion;
    }
    
    public void setIdinstitucion(long idinstitucion) {
        this.idinstitucion = idinstitucion;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Set getMarcoPresupuestarios() {
        return this.marcoPresupuestarios;
    }
    
    public void setMarcoPresupuestarios(Set marcoPresupuestarios) {
        this.marcoPresupuestarios = marcoPresupuestarios;
    }
    public Set getDocumentosGestionReferencials() {
        return this.documentosGestionReferencials;
    }
    
    public void setDocumentosGestionReferencials(Set documentosGestionReferencials) {
        this.documentosGestionReferencials = documentosGestionReferencials;
    }
    public Set getOrganoUnidads() {
        return this.organoUnidads;
    }
    
    public void setOrganoUnidads(Set organoUnidads) {
        this.organoUnidads = organoUnidads;
    }




}


