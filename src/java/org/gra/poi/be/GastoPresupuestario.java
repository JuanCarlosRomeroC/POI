package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class GastoPresupuestario  implements java.io.Serializable {


     private long idgastoPresupuestario;
     private String denominacion;
     private String genericaGasto;
     private Set especificaGastos = new HashSet(0);

    public GastoPresupuestario() {
    }

	
    public GastoPresupuestario(long idgastoPresupuestario) {
        this.idgastoPresupuestario = idgastoPresupuestario;
    }
    public GastoPresupuestario(long idgastoPresupuestario, String denominacion, String genericaGasto, Set especificaGastos) {
       this.idgastoPresupuestario = idgastoPresupuestario;
       this.denominacion = denominacion;
       this.genericaGasto = genericaGasto;
       this.especificaGastos = especificaGastos;
    }
   
    public long getIdgastoPresupuestario() {
        return this.idgastoPresupuestario;
    }
    
    public void setIdgastoPresupuestario(long idgastoPresupuestario) {
        this.idgastoPresupuestario = idgastoPresupuestario;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getGenericaGasto() {
        return this.genericaGasto;
    }
    
    public void setGenericaGasto(String genericaGasto) {
        this.genericaGasto = genericaGasto;
    }
    public Set getEspecificaGastos() {
        return this.especificaGastos;
    }
    
    public void setEspecificaGastos(Set especificaGastos) {
        this.especificaGastos = especificaGastos;
    }




}


