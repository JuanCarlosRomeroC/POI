package org.gra.poi.be;
import org.springframework.stereotype.Component;

@Component
public class DetalleMarcoPresupuestario  implements java.io.Serializable {


     private long iddetalleMp;
     private MarcoPresupuestario marcoPresupuestario;
     private String fuenteFinanciamiento;
     private String codigoFf;
     private Double monto;

    public DetalleMarcoPresupuestario() {
    }

	
    public DetalleMarcoPresupuestario(long iddetalleMp) {
        this.iddetalleMp = iddetalleMp;
    }
    public DetalleMarcoPresupuestario(long iddetalleMp, MarcoPresupuestario marcoPresupuestario, String fuenteFinanciamiento, String codigoFf, Double monto) {
       this.iddetalleMp = iddetalleMp;
       this.marcoPresupuestario = marcoPresupuestario;
       this.fuenteFinanciamiento = fuenteFinanciamiento;
       this.codigoFf = codigoFf;
       this.monto = monto;
    }
   
    public long getIddetalleMp() {
        return this.iddetalleMp;
    }
    
    public void setIddetalleMp(long iddetalleMp) {
        this.iddetalleMp = iddetalleMp;
    }
    public MarcoPresupuestario getMarcoPresupuestario() {
        return this.marcoPresupuestario;
    }
    
    public void setMarcoPresupuestario(MarcoPresupuestario marcoPresupuestario) {
        this.marcoPresupuestario = marcoPresupuestario;
    }
    public String getFuenteFinanciamiento() {
        return this.fuenteFinanciamiento;
    }
    
    public void setFuenteFinanciamiento(String fuenteFinanciamiento) {
        this.fuenteFinanciamiento = fuenteFinanciamiento;
    }
    public String getCodigoFf() {
        return this.codigoFf;
    }
    
    public void setCodigoFf(String codigoFf) {
        this.codigoFf = codigoFf;
    }
    public Double getMonto() {
        return this.monto;
    }
    
    public void setMonto(Double monto) {
        this.monto = monto;
    }




}


