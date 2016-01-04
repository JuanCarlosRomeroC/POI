package org.gra.poi.be;
import org.springframework.stereotype.Component;

@Component
public class Detallef5  implements java.io.Serializable {


     private long iddetallef5;
     private EspecificaGasto especificaGasto;
     private Formato5 formato5;
     private Subgrupo subgrupo;
     private Double costo;

    public Detallef5() {
    }

	
    public Detallef5(long iddetallef5) {
        this.iddetallef5 = iddetallef5;
    }
    public Detallef5(long iddetallef5, EspecificaGasto especificaGasto, Formato5 formato5, Subgrupo subgrupo, Double costo) {
       this.iddetallef5 = iddetallef5;
       this.especificaGasto = especificaGasto;
       this.formato5 = formato5;
       this.subgrupo = subgrupo;
       this.costo = costo;
    }
   
    public long getIddetallef5() {
        return this.iddetallef5;
    }
    
    public void setIddetallef5(long iddetallef5) {
        this.iddetallef5 = iddetallef5;
    }
    public EspecificaGasto getEspecificaGasto() {
        return this.especificaGasto;
    }
    
    public void setEspecificaGasto(EspecificaGasto especificaGasto) {
        this.especificaGasto = especificaGasto;
    }
    public Formato5 getFormato5() {
        return this.formato5;
    }
    
    public void setFormato5(Formato5 formato5) {
        this.formato5 = formato5;
    }
    public Subgrupo getSubgrupo() {
        return this.subgrupo;
    }
    
    public void setSubgrupo(Subgrupo subgrupo) {
        this.subgrupo = subgrupo;
    }
    public Double getCosto() {
        return this.costo;
    }
    
    public void setCosto(Double costo) {
        this.costo = costo;
    }




}


