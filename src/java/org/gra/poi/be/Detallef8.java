package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef8  implements java.io.Serializable {


     private long iddetallef8;
     private Formato8 formato8;
     private MetaOperativa metaOperativa;
     private String unidadMedida;
     private Double presupuestoAnual;
     private Double pptoProgTrimestral;
     private Double pptoEjecutadoEt;
     private Double pptoEjecutadoEat;
     private Double avanceFinancieroEt;
     private Double avanceFinancieroEat;

    public Detallef8() {
    }

	
    public Detallef8(long iddetallef8) {
        this.iddetallef8 = iddetallef8;
    }
    public Detallef8(long iddetallef8, Formato8 formato8, MetaOperativa metaOperativa, String unidadMedida, Double presupuestoAnual, Double pptoProgTrimestral, Double pptoEjecutadoEt, Double pptoEjecutadoEat, Double avanceFinancieroEt, Double avanceFinancieroEat) {
       this.iddetallef8 = iddetallef8;
       this.formato8 = formato8;
       this.metaOperativa = metaOperativa;
       this.unidadMedida = unidadMedida;
       this.presupuestoAnual = presupuestoAnual;
       this.pptoProgTrimestral = pptoProgTrimestral;
       this.pptoEjecutadoEt = pptoEjecutadoEt;
       this.pptoEjecutadoEat = pptoEjecutadoEat;
       this.avanceFinancieroEt = avanceFinancieroEt;
       this.avanceFinancieroEat = avanceFinancieroEat;
    }
   
    public long getIddetallef8() {
        return this.iddetallef8;
    }
    
    public void setIddetallef8(long iddetallef8) {
        this.iddetallef8 = iddetallef8;
    }
    public Formato8 getFormato8() {
        return this.formato8;
    }
    
    public void setFormato8(Formato8 formato8) {
        this.formato8 = formato8;
    }
    public MetaOperativa getMetaOperativa() {
        return this.metaOperativa;
    }
    
    public void setMetaOperativa(MetaOperativa metaOperativa) {
        this.metaOperativa = metaOperativa;
    }
    public String getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public Double getPresupuestoAnual() {
        return this.presupuestoAnual;
    }
    
    public void setPresupuestoAnual(Double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }
    public Double getPptoProgTrimestral() {
        return this.pptoProgTrimestral;
    }
    
    public void setPptoProgTrimestral(Double pptoProgTrimestral) {
        this.pptoProgTrimestral = pptoProgTrimestral;
    }
    public Double getPptoEjecutadoEt() {
        return this.pptoEjecutadoEt;
    }
    
    public void setPptoEjecutadoEt(Double pptoEjecutadoEt) {
        this.pptoEjecutadoEt = pptoEjecutadoEt;
    }
    public Double getPptoEjecutadoEat() {
        return this.pptoEjecutadoEat;
    }
    
    public void setPptoEjecutadoEat(Double pptoEjecutadoEat) {
        this.pptoEjecutadoEat = pptoEjecutadoEat;
    }
    public Double getAvanceFinancieroEt() {
        return this.avanceFinancieroEt;
    }
    
    public void setAvanceFinancieroEt(Double avanceFinancieroEt) {
        this.avanceFinancieroEt = avanceFinancieroEt;
    }
    public Double getAvanceFinancieroEat() {
        return this.avanceFinancieroEat;
    }
    
    public void setAvanceFinancieroEat(Double avanceFinancieroEat) {
        this.avanceFinancieroEat = avanceFinancieroEat;
    }




}


