package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AsignacionAeOei  implements java.io.Serializable {


     private long idasignacionAeOei;
     private AccionEstrategica accionEstrategica;
     private OePei oePei;
     private String abreviatura;
     private String correlativo;

    public AsignacionAeOei() {
    }

	
    public AsignacionAeOei(long idasignacionAeOei) {
        this.idasignacionAeOei = idasignacionAeOei;
    }
    public AsignacionAeOei(long idasignacionAeOei, AccionEstrategica accionEstrategica, OePei oePei, String abreviatura, String correlativo) {
       this.idasignacionAeOei = idasignacionAeOei;
       this.accionEstrategica = accionEstrategica;
       this.oePei = oePei;
       this.abreviatura = abreviatura;
       this.correlativo = correlativo;
    }
   
    public long getIdasignacionAeOei() {
        return this.idasignacionAeOei;
    }
    
    public void setIdasignacionAeOei(long idasignacionAeOei) {
        this.idasignacionAeOei = idasignacionAeOei;
    }
    public AccionEstrategica getAccionEstrategica() {
        return this.accionEstrategica;
    }
    
    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }
    public OePei getOePei() {
        return this.oePei;
    }
    
    public void setOePei(OePei oePei) {
        this.oePei = oePei;
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




}


