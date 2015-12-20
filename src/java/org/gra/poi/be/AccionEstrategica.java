package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AccionEstrategica  implements java.io.Serializable {


     private long idaccionEstrategica;
     private String denominacion;
     private String codigo;
     private Set asignacionAeCcs = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);
     private Set asignacionAeCps = new HashSet(0);
     private Set asignacionAeOeis = new HashSet(0);

    public AccionEstrategica() {
    }

	
    public AccionEstrategica(long idaccionEstrategica) {
        this.idaccionEstrategica = idaccionEstrategica;
    }
    public AccionEstrategica(long idaccionEstrategica, String denominacion, String codigo, Set asignacionAeCcs, Set programacionActividadeses, Set asignacionAeCps, Set asignacionAeOeis) {
       this.idaccionEstrategica = idaccionEstrategica;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.asignacionAeCcs = asignacionAeCcs;
       this.programacionActividadeses = programacionActividadeses;
       this.asignacionAeCps = asignacionAeCps;
       this.asignacionAeOeis = asignacionAeOeis;
    }
   
    public long getIdaccionEstrategica() {
        return this.idaccionEstrategica;
    }
    
    public void setIdaccionEstrategica(long idaccionEstrategica) {
        this.idaccionEstrategica = idaccionEstrategica;
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
    public Set getAsignacionAeCcs() {
        return this.asignacionAeCcs;
    }
    
    public void setAsignacionAeCcs(Set asignacionAeCcs) {
        this.asignacionAeCcs = asignacionAeCcs;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    public Set getAsignacionAeCps() {
        return this.asignacionAeCps;
    }
    
    public void setAsignacionAeCps(Set asignacionAeCps) {
        this.asignacionAeCps = asignacionAeCps;
    }
    public Set getAsignacionAeOeis() {
        return this.asignacionAeOeis;
    }
    
    public void setAsignacionAeOeis(Set asignacionAeOeis) {
        this.asignacionAeOeis = asignacionAeOeis;
    }




}


