package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef3  implements java.io.Serializable {


     private long iddetallef3;
     private Formato3 formato3;
     private MetaOperativa metaOperativa;
     private String responsable;
     private String unidadMedida;
     private Integer trimestre1;
     private Integer trimestre2;
     private Integer trimestre3;
     private Integer trimestre4;

    public Detallef3() {
    }

	
    public Detallef3(long iddetallef3) {
        this.iddetallef3 = iddetallef3;
    }
    public Detallef3(long iddetallef3, Formato3 formato3, MetaOperativa metaOperativa, String responsable, String unidadMedida, Integer trimestre1, Integer trimestre2, Integer trimestre3, Integer trimestre4) {
       this.iddetallef3 = iddetallef3;
       this.formato3 = formato3;
       this.metaOperativa = metaOperativa;
       this.responsable = responsable;
       this.unidadMedida = unidadMedida;
       this.trimestre1 = trimestre1;
       this.trimestre2 = trimestre2;
       this.trimestre3 = trimestre3;
       this.trimestre4 = trimestre4;
    }
   
    public long getIddetallef3() {
        return this.iddetallef3;
    }
    
    public void setIddetallef3(long iddetallef3) {
        this.iddetallef3 = iddetallef3;
    }
    public Formato3 getFormato3() {
        return this.formato3;
    }
    
    public void setFormato3(Formato3 formato3) {
        this.formato3 = formato3;
    }
    public MetaOperativa getMetaOperativa() {
        return this.metaOperativa;
    }
    
    public void setMetaOperativa(MetaOperativa metaOperativa) {
        this.metaOperativa = metaOperativa;
    }
    public String getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    public String getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public Integer getTrimestre1() {
        return this.trimestre1;
    }
    
    public void setTrimestre1(Integer trimestre1) {
        this.trimestre1 = trimestre1;
    }
    public Integer getTrimestre2() {
        return this.trimestre2;
    }
    
    public void setTrimestre2(Integer trimestre2) {
        this.trimestre2 = trimestre2;
    }
    public Integer getTrimestre3() {
        return this.trimestre3;
    }
    
    public void setTrimestre3(Integer trimestre3) {
        this.trimestre3 = trimestre3;
    }
    public Integer getTrimestre4() {
        return this.trimestre4;
    }
    
    public void setTrimestre4(Integer trimestre4) {
        this.trimestre4 = trimestre4;
    }




}


