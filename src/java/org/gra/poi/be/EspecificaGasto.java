package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class EspecificaGasto  implements java.io.Serializable {


     private long idespecificaGasto;
     private GastoPresupuestario gastoPresupuestario;
     private String denominacion;
     private String especifica;
     private Set detallef5s = new HashSet(0);

    public EspecificaGasto() {
    }

	
    public EspecificaGasto(long idespecificaGasto) {
        this.idespecificaGasto = idespecificaGasto;
    }
    public EspecificaGasto(long idespecificaGasto, GastoPresupuestario gastoPresupuestario, String denominacion, String especifica, Set detallef5s) {
       this.idespecificaGasto = idespecificaGasto;
       this.gastoPresupuestario = gastoPresupuestario;
       this.denominacion = denominacion;
       this.especifica = especifica;
       this.detallef5s = detallef5s;
    }
   
    public long getIdespecificaGasto() {
        return this.idespecificaGasto;
    }
    
    public void setIdespecificaGasto(long idespecificaGasto) {
        this.idespecificaGasto = idespecificaGasto;
    }
    public GastoPresupuestario getGastoPresupuestario() {
        return this.gastoPresupuestario;
    }
    
    public void setGastoPresupuestario(GastoPresupuestario gastoPresupuestario) {
        this.gastoPresupuestario = gastoPresupuestario;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getEspecifica() {
        return this.especifica;
    }
    
    public void setEspecifica(String especifica) {
        this.especifica = especifica;
    }
    public Set getDetallef5s() {
        return this.detallef5s;
    }
    
    public void setDetallef5s(Set detallef5s) {
        this.detallef5s = detallef5s;
    }




}


