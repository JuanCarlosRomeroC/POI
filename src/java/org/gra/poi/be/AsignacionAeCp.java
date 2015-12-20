package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class AsignacionAeCp  implements java.io.Serializable {


     private long idasignacionAeCp;
     private AccionEstrategica accionEstrategica;
     private CategoriaPresupuestal categoriaPresupuestal;

    public AsignacionAeCp() {
    }

	
    public AsignacionAeCp(long idasignacionAeCp) {
        this.idasignacionAeCp = idasignacionAeCp;
    }
    public AsignacionAeCp(long idasignacionAeCp, AccionEstrategica accionEstrategica, CategoriaPresupuestal categoriaPresupuestal) {
       this.idasignacionAeCp = idasignacionAeCp;
       this.accionEstrategica = accionEstrategica;
       this.categoriaPresupuestal = categoriaPresupuestal;
    }
   
    public long getIdasignacionAeCp() {
        return this.idasignacionAeCp;
    }
    
    public void setIdasignacionAeCp(long idasignacionAeCp) {
        this.idasignacionAeCp = idasignacionAeCp;
    }
    public AccionEstrategica getAccionEstrategica() {
        return this.accionEstrategica;
    }
    
    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }
    public CategoriaPresupuestal getCategoriaPresupuestal() {
        return this.categoriaPresupuestal;
    }
    
    public void setCategoriaPresupuestal(CategoriaPresupuestal categoriaPresupuestal) {
        this.categoriaPresupuestal = categoriaPresupuestal;
    }




}


