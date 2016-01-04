package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class OePei  implements java.io.Serializable {


     private long idoePei;
     private String denominacion;
     private String abreviatura;
     private String correlativo;
     private Set accionEstrategicas = new HashSet(0);
     private Set detallef1s = new HashSet(0);
     private Set pois = new HashSet(0);

    public OePei() {
    }

	
    public OePei(long idoePei) {
        this.idoePei = idoePei;
    }
    public OePei(long idoePei, String denominacion, String abreviatura, String correlativo, Set accionEstrategicas, Set detallef1s, Set pois) {
       this.idoePei = idoePei;
       this.denominacion = denominacion;
       this.abreviatura = abreviatura;
       this.correlativo = correlativo;
       this.accionEstrategicas = accionEstrategicas;
       this.detallef1s = detallef1s;
       this.pois = pois;
    }
   
    public long getIdoePei() {
        return this.idoePei;
    }
    
    public void setIdoePei(long idoePei) {
        this.idoePei = idoePei;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public String getCorrelativo() {
        return this.correlativo;
    }
    
    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
    public Set getAccionEstrategicas() {
        return this.accionEstrategicas;
    }
    
    public void setAccionEstrategicas(Set accionEstrategicas) {
        this.accionEstrategicas = accionEstrategicas;
    }
    public Set getDetallef1s() {
        return this.detallef1s;
    }
    
    public void setDetallef1s(Set detallef1s) {
        this.detallef1s = detallef1s;
    }
    public Set getPois() {
        return this.pois;
    }
    
    public void setPois(Set pois) {
        this.pois = pois;
    }




}


