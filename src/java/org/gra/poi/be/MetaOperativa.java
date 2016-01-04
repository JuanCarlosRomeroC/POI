package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class MetaOperativa  implements java.io.Serializable {


     private long idmetaOperativa;
     private ActividadOperativa actividadOperativa;
     private String denominacion;
     private Set detallef3s = new HashSet(0);
     private Set detallef4s = new HashSet(0);
     private Set detallef7s = new HashSet(0);
     private Set detallef8s = new HashSet(0);

    public MetaOperativa() {
    }

	
    public MetaOperativa(long idmetaOperativa) {
        this.idmetaOperativa = idmetaOperativa;
    }
    public MetaOperativa(long idmetaOperativa, ActividadOperativa actividadOperativa, String denominacion, Set detallef3s, Set detallef4s, Set detallef7s, Set detallef8s) {
       this.idmetaOperativa = idmetaOperativa;
       this.actividadOperativa = actividadOperativa;
       this.denominacion = denominacion;
       this.detallef3s = detallef3s;
       this.detallef4s = detallef4s;
       this.detallef7s = detallef7s;
       this.detallef8s = detallef8s;
    }
   
    public long getIdmetaOperativa() {
        return this.idmetaOperativa;
    }
    
    public void setIdmetaOperativa(long idmetaOperativa) {
        this.idmetaOperativa = idmetaOperativa;
    }
    public ActividadOperativa getActividadOperativa() {
        return this.actividadOperativa;
    }
    
    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public Set getDetallef3s() {
        return this.detallef3s;
    }
    
    public void setDetallef3s(Set detallef3s) {
        this.detallef3s = detallef3s;
    }
    public Set getDetallef4s() {
        return this.detallef4s;
    }
    
    public void setDetallef4s(Set detallef4s) {
        this.detallef4s = detallef4s;
    }
    public Set getDetallef7s() {
        return this.detallef7s;
    }
    
    public void setDetallef7s(Set detallef7s) {
        this.detallef7s = detallef7s;
    }
    public Set getDetallef8s() {
        return this.detallef8s;
    }
    
    public void setDetallef8s(Set detallef8s) {
        this.detallef8s = detallef8s;
    }




}


