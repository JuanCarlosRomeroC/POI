package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AccionEstrategica  implements java.io.Serializable {


     private long idaccionEstrategica;
     private CategoriaPresupuestal categoriaPresupuestal;
     private CentroCosto centroCosto;
     private OePei oePei;
     private String denominacion;
     private String codigo;
     private String correlativo;
     private Set programacionActividadeses = new HashSet(0);
     private Set subgrupos = new HashSet(0);

    public AccionEstrategica() {
    }

	
    public AccionEstrategica(long idaccionEstrategica) {
        this.idaccionEstrategica = idaccionEstrategica;
    }
    public AccionEstrategica(long idaccionEstrategica, CategoriaPresupuestal categoriaPresupuestal, CentroCosto centroCosto, OePei oePei, String denominacion, String codigo, String correlativo, Set programacionActividadeses, Set subgrupos) {
       this.idaccionEstrategica = idaccionEstrategica;
       this.categoriaPresupuestal = categoriaPresupuestal;
       this.centroCosto = centroCosto;
       this.oePei = oePei;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.correlativo = correlativo;
       this.programacionActividadeses = programacionActividadeses;
       this.subgrupos = subgrupos;
    }
   
    public long getIdaccionEstrategica() {
        return this.idaccionEstrategica;
    }
    
    public void setIdaccionEstrategica(long idaccionEstrategica) {
        this.idaccionEstrategica = idaccionEstrategica;
    }
    public CategoriaPresupuestal getCategoriaPresupuestal() {
        return this.categoriaPresupuestal;
    }
    
    public void setCategoriaPresupuestal(CategoriaPresupuestal categoriaPresupuestal) {
        this.categoriaPresupuestal = categoriaPresupuestal;
    }
    public CentroCosto getCentroCosto() {
        return this.centroCosto;
    }
    
    public void setCentroCosto(CentroCosto centroCosto) {
        this.centroCosto = centroCosto;
    }
    public OePei getOePei() {
        return this.oePei;
    }
    
    public void setOePei(OePei oePei) {
        this.oePei = oePei;
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
    public String getCorrelativo() {
        return this.correlativo;
    }
    
    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    public Set getSubgrupos() {
        return this.subgrupos;
    }
    
    public void setSubgrupos(Set subgrupos) {
        this.subgrupos = subgrupos;
    }




}


