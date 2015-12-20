package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class CategoriaPresupuestal  implements java.io.Serializable {


     private long idcategoriaPresupuestal;
     private String tipoCategoria;
     private String denominacion;
     private String numeracion;
     private Set programacionActividadeses = new HashSet(0);
     private Set asignacionAeCps = new HashSet(0);
     private Set subgrupos = new HashSet(0);

    public CategoriaPresupuestal() {
    }

	
    public CategoriaPresupuestal(long idcategoriaPresupuestal) {
        this.idcategoriaPresupuestal = idcategoriaPresupuestal;
    }
    public CategoriaPresupuestal(long idcategoriaPresupuestal, String tipoCategoria, String denominacion, String numeracion, Set programacionActividadeses, Set asignacionAeCps, Set subgrupos) {
       this.idcategoriaPresupuestal = idcategoriaPresupuestal;
       this.tipoCategoria = tipoCategoria;
       this.denominacion = denominacion;
       this.numeracion = numeracion;
       this.programacionActividadeses = programacionActividadeses;
       this.asignacionAeCps = asignacionAeCps;
       this.subgrupos = subgrupos;
    }
   
    public long getIdcategoriaPresupuestal() {
        return this.idcategoriaPresupuestal;
    }
    
    public void setIdcategoriaPresupuestal(long idcategoriaPresupuestal) {
        this.idcategoriaPresupuestal = idcategoriaPresupuestal;
    }
    public String getTipoCategoria() {
        return this.tipoCategoria;
    }
    
    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
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
    public Set getAsignacionAeCps() {
        return this.asignacionAeCps;
    }
    
    public void setAsignacionAeCps(Set asignacionAeCps) {
        this.asignacionAeCps = asignacionAeCps;
    }
    public Set getSubgrupos() {
        return this.subgrupos;
    }
    
    public void setSubgrupos(Set subgrupos) {
        this.subgrupos = subgrupos;
    }




}


