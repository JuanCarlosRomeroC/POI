package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class CentroCosto  implements java.io.Serializable {
     private long idcentroCosto;
     private String denominacion;
     private String abreviatura;
     private Set accionEstrategicas = new HashSet(0);

    public CentroCosto() {
    }
	
    public CentroCosto(long idcentroCosto) {
        this.idcentroCosto = idcentroCosto;
    }
    public CentroCosto(long idcentroCosto, String denominacion, String abreviatura, Set accionEstrategicas) {
       this.idcentroCosto = idcentroCosto;
       this.denominacion = denominacion;
       this.abreviatura = abreviatura;
       this.accionEstrategicas = accionEstrategicas;
    }
   
    public long getIdcentroCosto() {
        return this.idcentroCosto;
    }
    
    public void setIdcentroCosto(long idcentroCosto) {
        this.idcentroCosto = idcentroCosto;
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

    public Set getAccionEstrategicas() {
        return accionEstrategicas;
    }

    public void setAccionEstrategicas(Set accionEstrategicas) {
        this.accionEstrategicas = accionEstrategicas;
    }
}


