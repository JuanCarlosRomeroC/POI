package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


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
     private Set accionEstrategicas = new HashSet(0);

    public CategoriaPresupuestal() {
    }

	
    public CategoriaPresupuestal(long idcategoriaPresupuestal) {
        this.idcategoriaPresupuestal = idcategoriaPresupuestal;
    }
    public CategoriaPresupuestal(long idcategoriaPresupuestal, String tipoCategoria, String denominacion, String numeracion, Set programacionActividadeses, Set accionEstrategicas) {
       this.idcategoriaPresupuestal = idcategoriaPresupuestal;
       this.tipoCategoria = tipoCategoria;
       this.denominacion = denominacion;
       this.numeracion = numeracion;
       this.programacionActividadeses = programacionActividadeses;
       this.accionEstrategicas = accionEstrategicas;
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
    public Set getAccionEstrategicas() {
        return this.accionEstrategicas;
    }
    
    public void setAccionEstrategicas(Set accionEstrategicas) {
        this.accionEstrategicas = accionEstrategicas;
    }




}


