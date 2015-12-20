package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef6  implements java.io.Serializable {


     private long iddetallef6Resultado;
     private Formato6 formato6;
     private String unidadMedida;
     private String lineaBase;
     private Double cantidadProgramada;
     private Double cantidadEjecutadaEt;
     private Double avanceFisicoEt;
     private Double cantidadEjecutadaEat;
     private Double avanceFisicoEat;
     private String denominacionNivelObjetivo;
     private String indicador;
     private String tipoNivelObjetivo;

    public Detallef6() {
    }

	
    public Detallef6(long iddetallef6Resultado) {
        this.iddetallef6Resultado = iddetallef6Resultado;
    }
    public Detallef6(long iddetallef6Resultado, Formato6 formato6, String unidadMedida, String lineaBase, Double cantidadProgramada, Double cantidadEjecutadaEt, Double avanceFisicoEt, Double cantidadEjecutadaEat, Double avanceFisicoEat, String denominacionNivelObjetivo, String indicador, String tipoNivelObjetivo) {
       this.iddetallef6Resultado = iddetallef6Resultado;
       this.formato6 = formato6;
       this.unidadMedida = unidadMedida;
       this.lineaBase = lineaBase;
       this.cantidadProgramada = cantidadProgramada;
       this.cantidadEjecutadaEt = cantidadEjecutadaEt;
       this.avanceFisicoEt = avanceFisicoEt;
       this.cantidadEjecutadaEat = cantidadEjecutadaEat;
       this.avanceFisicoEat = avanceFisicoEat;
       this.denominacionNivelObjetivo = denominacionNivelObjetivo;
       this.indicador = indicador;
       this.tipoNivelObjetivo = tipoNivelObjetivo;
    }
   
    public long getIddetallef6Resultado() {
        return this.iddetallef6Resultado;
    }
    
    public void setIddetallef6Resultado(long iddetallef6Resultado) {
        this.iddetallef6Resultado = iddetallef6Resultado;
    }
    public Formato6 getFormato6() {
        return this.formato6;
    }
    
    public void setFormato6(Formato6 formato6) {
        this.formato6 = formato6;
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
    public Double getCantidadProgramada() {
        return this.cantidadProgramada;
    }
    
    public void setCantidadProgramada(Double cantidadProgramada) {
        this.cantidadProgramada = cantidadProgramada;
    }
    public Double getCantidadEjecutadaEt() {
        return this.cantidadEjecutadaEt;
    }
    
    public void setCantidadEjecutadaEt(Double cantidadEjecutadaEt) {
        this.cantidadEjecutadaEt = cantidadEjecutadaEt;
    }
    public Double getAvanceFisicoEt() {
        return this.avanceFisicoEt;
    }
    
    public void setAvanceFisicoEt(Double avanceFisicoEt) {
        this.avanceFisicoEt = avanceFisicoEt;
    }
    public Double getCantidadEjecutadaEat() {
        return this.cantidadEjecutadaEat;
    }
    
    public void setCantidadEjecutadaEat(Double cantidadEjecutadaEat) {
        this.cantidadEjecutadaEat = cantidadEjecutadaEat;
    }
    public Double getAvanceFisicoEat() {
        return this.avanceFisicoEat;
    }
    
    public void setAvanceFisicoEat(Double avanceFisicoEat) {
        this.avanceFisicoEat = avanceFisicoEat;
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
    public String getTipoNivelObjetivo() {
        return this.tipoNivelObjetivo;
    }
    
    public void setTipoNivelObjetivo(String tipoNivelObjetivo) {
        this.tipoNivelObjetivo = tipoNivelObjetivo;
    }




}


