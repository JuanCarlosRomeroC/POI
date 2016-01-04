package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Subgrupo  implements java.io.Serializable {


     private long idsubgrupo;
     private AccionEstrategica accionEstrategica;
     private String denominacion;
     private String numeracion;
     private Set programacionActividadeses = new HashSet(0);
     private Set detallef5s = new HashSet(0);
     private Set actividadOperativas = new HashSet(0);

    public Subgrupo() {
    }

	
    public Subgrupo(long idsubgrupo) {
        this.idsubgrupo = idsubgrupo;
    }
    public Subgrupo(long idsubgrupo, AccionEstrategica accionEstrategica, String denominacion, String numeracion, Set programacionActividadeses, Set detallef5s, Set actividadOperativas) {
       this.idsubgrupo = idsubgrupo;
       this.accionEstrategica = accionEstrategica;
       this.denominacion = denominacion;
       this.numeracion = numeracion;
       this.programacionActividadeses = programacionActividadeses;
       this.detallef5s = detallef5s;
       this.actividadOperativas = actividadOperativas;
    }
   
    public long getIdsubgrupo() {
        return this.idsubgrupo;
    }
    
    public void setIdsubgrupo(long idsubgrupo) {
        this.idsubgrupo = idsubgrupo;
    }
    public AccionEstrategica getAccionEstrategica() {
        return this.accionEstrategica;
    }
    
    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getNumeracion() {
        return this.numeracion;
    }
    
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    public Set getDetallef5s() {
        return this.detallef5s;
    }
    
    public void setDetallef5s(Set detallef5s) {
        this.detallef5s = detallef5s;
    }
    public Set getActividadOperativas() {
        return this.actividadOperativas;
    }
    
    public void setActividadOperativas(Set actividadOperativas) {
        this.actividadOperativas = actividadOperativas;
    }




}


