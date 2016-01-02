package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AccionEstrategica  implements java.io.Serializable {
     private long idaccionEstrategica;
     private OePei oePei;
     private CategoriaPresupuestal categoriaPresupuestal;
     private CentroCosto centroCosto;
     private String denominacion;
     private String codigo;
     private String correlativo;
     private Set programacionActividadeses = new HashSet(0);

    public AccionEstrategica() {
    }
	
    public AccionEstrategica(long idaccionEstrategica) {
        this.idaccionEstrategica = idaccionEstrategica;
    }
    public AccionEstrategica(long idaccionEstrategica, OePei oePei ,CategoriaPresupuestal categoriaPresupuestal, CentroCosto centroCosto, String denominacion, String codigo,String correlativo , Set programacionActividadeses) {
       this.idaccionEstrategica = idaccionEstrategica;
       this.oePei = oePei;
       this.categoriaPresupuestal = categoriaPresupuestal;
       this.centroCosto = centroCosto;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.correlativo = correlativo;
       this.programacionActividadeses = programacionActividadeses;
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
    
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    
    public OePei getOePei() {
        return oePei;
    }

    public void setOePei(OePei oePei) {
        this.oePei = oePei;
    }

    public CategoriaPresupuestal getCategoriaPresupuestal() {
        return categoriaPresupuestal;
    }

    public void setCategoriaPresupuestal(CategoriaPresupuestal categoriaPresupuestal) {
        this.categoriaPresupuestal = categoriaPresupuestal;
    }

    public CentroCosto getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(CentroCosto centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
}


