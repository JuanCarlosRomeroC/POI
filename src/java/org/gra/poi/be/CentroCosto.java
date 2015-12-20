package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class CentroCosto  implements java.io.Serializable {


     private long idcentroCosto;
     private String denominacion;
     private String abreviatura;
     private Set asignacionAeCcs = new HashSet(0);

    public CentroCosto() {
    }

	
    public CentroCosto(long idcentroCosto) {
        this.idcentroCosto = idcentroCosto;
    }
    public CentroCosto(long idcentroCosto, String denominacion, String abreviatura, Set asignacionAeCcs) {
       this.idcentroCosto = idcentroCosto;
       this.denominacion = denominacion;
       this.abreviatura = abreviatura;
       this.asignacionAeCcs = asignacionAeCcs;
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
    public Set getAsignacionAeCcs() {
        return this.asignacionAeCcs;
    }
    
    public void setAsignacionAeCcs(Set asignacionAeCcs) {
        this.asignacionAeCcs = asignacionAeCcs;
    }




}


