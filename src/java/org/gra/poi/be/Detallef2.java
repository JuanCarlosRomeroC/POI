package org.gra.poi.be;
import org.springframework.stereotype.Component;

@Component
public class Detallef2  implements java.io.Serializable {


     private long iddetallef2Resultado;
     private Formato2 formato2;
     private String denominacionNivelObjetivo;
     private String indicador;
     private String unidadMedida;
     private String lineaBase;
     private Double trimestre1;
     private Double trimestre2;
     private Double trimestre3;
     private Double trimestre4;
     private String tipoNivelObjetivo;

    public Detallef2() {
    }

	
    public Detallef2(long iddetallef2Resultado) {
        this.iddetallef2Resultado = iddetallef2Resultado;
    }
    public Detallef2(long iddetallef2Resultado, Formato2 formato2, String denominacionNivelObjetivo, String indicador, String unidadMedida, String lineaBase, Double trimestre1, Double trimestre2, Double trimestre3, Double trimestre4, String tipoNivelObjetivo) {
       this.iddetallef2Resultado = iddetallef2Resultado;
       this.formato2 = formato2;
       this.denominacionNivelObjetivo = denominacionNivelObjetivo;
       this.indicador = indicador;
       this.unidadMedida = unidadMedida;
       this.lineaBase = lineaBase;
       this.trimestre1 = trimestre1;
       this.trimestre2 = trimestre2;
       this.trimestre3 = trimestre3;
       this.trimestre4 = trimestre4;
       this.tipoNivelObjetivo = tipoNivelObjetivo;
    }
   
    public long getIddetallef2Resultado() {
        return this.iddetallef2Resultado;
    }
    
    public void setIddetallef2Resultado(long iddetallef2Resultado) {
        this.iddetallef2Resultado = iddetallef2Resultado;
    }
    public Formato2 getFormato2() {
        return this.formato2;
    }
    
    public void setFormato2(Formato2 formato2) {
        this.formato2 = formato2;
    }
    public String getDenominacionNivelObjetivo() {
        return this.denominacionNivelObjetivo;
    }
    
    public void setDenominacionNivelObjetivo(String denominacionNivelObjetivo) {
        this.denominacionNivelObjetivo = denominacionNivelObjetivo;
    }
    public String getIndicador() {
        return this.indicador;
    }
    
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    public String getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public String getLineaBase() {
        return this.lineaBase;
    }
    
    public void setLineaBase(String lineaBase) {
        this.lineaBase = lineaBase;
    }
    public Double getTrimestre1() {
        return this.trimestre1;
    }
    
    public void setTrimestre1(Double trimestre1) {
        this.trimestre1 = trimestre1;
    }
    public Double getTrimestre2() {
        return this.trimestre2;
    }
    
    public void setTrimestre2(Double trimestre2) {
        this.trimestre2 = trimestre2;
    }
    public Double getTrimestre3() {
        return this.trimestre3;
    }
    
    public void setTrimestre3(Double trimestre3) {
        this.trimestre3 = trimestre3;
    }
    public Double getTrimestre4() {
        return this.trimestre4;
    }
    
    public void setTrimestre4(Double trimestre4) {
        this.trimestre4 = trimestre4;
    }
    public String getTipoNivelObjetivo() {
        return this.tipoNivelObjetivo;
    }
    
    public void setTipoNivelObjetivo(String tipoNivelObjetivo) {
        this.tipoNivelObjetivo = tipoNivelObjetivo;
    }




}


