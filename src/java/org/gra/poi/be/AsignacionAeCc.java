package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AsignacionAeCc  implements java.io.Serializable {


     private long idasignacionAeCc;
     private AccionEstrategica accionEstrategica;
     private CentroCosto centroCosto;

    public AsignacionAeCc() {
    }

	
    public AsignacionAeCc(long idasignacionAeCc) {
        this.idasignacionAeCc = idasignacionAeCc;
    }
    public AsignacionAeCc(long idasignacionAeCc, AccionEstrategica accionEstrategica, CentroCosto centroCosto) {
       this.idasignacionAeCc = idasignacionAeCc;
       this.accionEstrategica = accionEstrategica;
       this.centroCosto = centroCosto;
    }
   
    public long getIdasignacionAeCc() {
        return this.idasignacionAeCc;
    }
    
    public void setIdasignacionAeCc(long idasignacionAeCc) {
        this.idasignacionAeCc = idasignacionAeCc;
    }
    public AccionEstrategica getAccionEstrategica() {
        return this.accionEstrategica;
    }
    
    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }
    public CentroCosto getCentroCosto() {
        return this.centroCosto;
    }
    
    public void setCentroCosto(CentroCosto centroCosto) {
        this.centroCosto = centroCosto;
    }




}


