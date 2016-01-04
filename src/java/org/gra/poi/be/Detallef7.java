package org.gra.poi.be;
import org.springframework.stereotype.Component;

@Component
public class Detallef7  implements java.io.Serializable {


     private long iddetallef7;
     private Formato7 formato7;
     private MetaOperativa metaOperativa;
     private String unidadMedida;
     private Integer cantProgTrimestral;
     private Integer cantidadEjecutadaEt;
     private Integer cantidadEjecutadaEat;
     private Double avanceFisicoEt;
     private Double avanceFisicoEat;

    public Detallef7() {
    }

	
    public Detallef7(long iddetallef7) {
        this.iddetallef7 = iddetallef7;
    }
    public Detallef7(long iddetallef7, Formato7 formato7, MetaOperativa metaOperativa, String unidadMedida, Integer cantProgTrimestral, Integer cantidadEjecutadaEt, Integer cantidadEjecutadaEat, Double avanceFisicoEt, Double avanceFisicoEat) {
       this.iddetallef7 = iddetallef7;
       this.formato7 = formato7;
       this.metaOperativa = metaOperativa;
       this.unidadMedida = unidadMedida;
       this.cantProgTrimestral = cantProgTrimestral;
       this.cantidadEjecutadaEt = cantidadEjecutadaEt;
       this.cantidadEjecutadaEat = cantidadEjecutadaEat;
       this.avanceFisicoEt = avanceFisicoEt;
       this.avanceFisicoEat = avanceFisicoEat;
    }
   
    public long getIddetallef7() {
        return this.iddetallef7;
    }
    
    public void setIddetallef7(long iddetallef7) {
        this.iddetallef7 = iddetallef7;
    }
    public Formato7 getFormato7() {
        return this.formato7;
    }
    
    public void setFormato7(Formato7 formato7) {
        this.formato7 = formato7;
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
    public Integer getCantProgTrimestral() {
        return this.cantProgTrimestral;
    }
    
    public void setCantProgTrimestral(Integer cantProgTrimestral) {
        this.cantProgTrimestral = cantProgTrimestral;
    }
    public Integer getCantidadEjecutadaEt() {
        return this.cantidadEjecutadaEt;
    }
    
    public void setCantidadEjecutadaEt(Integer cantidadEjecutadaEt) {
        this.cantidadEjecutadaEt = cantidadEjecutadaEt;
    }
    public Integer getCantidadEjecutadaEat() {
        return this.cantidadEjecutadaEat;
    }
    
    public void setCantidadEjecutadaEat(Integer cantidadEjecutadaEat) {
        this.cantidadEjecutadaEat = cantidadEjecutadaEat;
    }
    public Double getAvanceFisicoEt() {
        return this.avanceFisicoEt;
    }
    
    public void setAvanceFisicoEt(Double avanceFisicoEt) {
        this.avanceFisicoEt = avanceFisicoEt;
    }
    public Double getAvanceFisicoEat() {
        return this.avanceFisicoEat;
    }
    
    public void setAvanceFisicoEat(Double avanceFisicoEat) {
        this.avanceFisicoEat = avanceFisicoEat;
    }




}


