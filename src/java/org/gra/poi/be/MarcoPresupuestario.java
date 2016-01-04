package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class MarcoPresupuestario  implements java.io.Serializable {


     private long idmarcoPresupuestario;
     private Institucion institucion;
     private String descripcion;
     private Double importeTotal;
     private Set detalleMarcoPresupuestarios = new HashSet(0);
     private Set pois = new HashSet(0);

    public MarcoPresupuestario() {
    }

	
    public MarcoPresupuestario(long idmarcoPresupuestario) {
        this.idmarcoPresupuestario = idmarcoPresupuestario;
    }
    public MarcoPresupuestario(long idmarcoPresupuestario, Institucion institucion, String descripcion, Double importeTotal, Set detalleMarcoPresupuestarios, Set pois) {
       this.idmarcoPresupuestario = idmarcoPresupuestario;
       this.institucion = institucion;
       this.descripcion = descripcion;
       this.importeTotal = importeTotal;
       this.detalleMarcoPresupuestarios = detalleMarcoPresupuestarios;
       this.pois = pois;
    }
   
    public long getIdmarcoPresupuestario() {
        return this.idmarcoPresupuestario;
    }
    
    public void setIdmarcoPresupuestario(long idmarcoPresupuestario) {
        this.idmarcoPresupuestario = idmarcoPresupuestario;
    }
    public Institucion getInstitucion() {
        return this.institucion;
    }
    
    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getImporteTotal() {
        return this.importeTotal;
    }
    
    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }
    public Set getDetalleMarcoPresupuestarios() {
        return this.detalleMarcoPresupuestarios;
    }
    
    public void setDetalleMarcoPresupuestarios(Set detalleMarcoPresupuestarios) {
        this.detalleMarcoPresupuestarios = detalleMarcoPresupuestarios;
    }
    public Set getPois() {
        return this.pois;
    }
    
    public void setPois(Set pois) {
        this.pois = pois;
    }




}


