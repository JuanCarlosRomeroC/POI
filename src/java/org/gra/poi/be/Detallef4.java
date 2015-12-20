package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef4  implements java.io.Serializable {


     private long iddetallef4;
     private Formato4 formato4;
     private MetaOperativa metaOperativa;
     private String unidadMedida;
     private Double pia;
     private Double presupuesto1;
     private Double presupuesto2;
     private Double presupuesto3;
     private Double presupuesto4;
     private String fteFinanciamiento;

    public Detallef4() {
    }

	
    public Detallef4(long iddetallef4) {
        this.iddetallef4 = iddetallef4;
    }
    public Detallef4(long iddetallef4, Formato4 formato4, MetaOperativa metaOperativa, String unidadMedida, Double pia, Double presupuesto1, Double presupuesto2, Double presupuesto3, Double presupuesto4, String fteFinanciamiento) {
       this.iddetallef4 = iddetallef4;
       this.formato4 = formato4;
       this.metaOperativa = metaOperativa;
       this.unidadMedida = unidadMedida;
       this.pia = pia;
       this.presupuesto1 = presupuesto1;
       this.presupuesto2 = presupuesto2;
       this.presupuesto3 = presupuesto3;
       this.presupuesto4 = presupuesto4;
       this.fteFinanciamiento = fteFinanciamiento;
    }
   
    public long getIddetallef4() {
        return this.iddetallef4;
    }
    
    public void setIddetallef4(long iddetallef4) {
        this.iddetallef4 = iddetallef4;
    }
    public Formato4 getFormato4() {
        return this.formato4;
    }
    
    public void setFormato4(Formato4 formato4) {
        this.formato4 = formato4;
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
    public Double getPia() {
        return this.pia;
    }
    
    public void setPia(Double pia) {
        this.pia = pia;
    }
    public Double getPresupuesto1() {
        return this.presupuesto1;
    }
    
    public void setPresupuesto1(Double presupuesto1) {
        this.presupuesto1 = presupuesto1;
    }
    public Double getPresupuesto2() {
        return this.presupuesto2;
    }
    
    public void setPresupuesto2(Double presupuesto2) {
        this.presupuesto2 = presupuesto2;
    }
    public Double getPresupuesto3() {
        return this.presupuesto3;
    }
    
    public void setPresupuesto3(Double presupuesto3) {
        this.presupuesto3 = presupuesto3;
    }
    public Double getPresupuesto4() {
        return this.presupuesto4;
    }
    
    public void setPresupuesto4(Double presupuesto4) {
        this.presupuesto4 = presupuesto4;
    }
    public String getFteFinanciamiento() {
        return this.fteFinanciamiento;
    }
    
    public void setFteFinanciamiento(String fteFinanciamiento) {
        this.fteFinanciamiento = fteFinanciamiento;
    }




}


