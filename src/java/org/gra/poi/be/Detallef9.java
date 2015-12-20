package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef9  implements java.io.Serializable {


     private long iddetallef9;
     private ActividadOperativa actividadOperativa;
     private Formato9 formato9;
     private String obsNegativa;
     private String accionesSoluciones;
     private String recomendaciones;

    public Detallef9() {
    }

	
    public Detallef9(long iddetallef9) {
        this.iddetallef9 = iddetallef9;
    }
    public Detallef9(long iddetallef9, ActividadOperativa actividadOperativa, Formato9 formato9, String obsNegativa, String accionesSoluciones, String recomendaciones) {
       this.iddetallef9 = iddetallef9;
       this.actividadOperativa = actividadOperativa;
       this.formato9 = formato9;
       this.obsNegativa = obsNegativa;
       this.accionesSoluciones = accionesSoluciones;
       this.recomendaciones = recomendaciones;
    }
   
    public long getIddetallef9() {
        return this.iddetallef9;
    }
    
    public void setIddetallef9(long iddetallef9) {
        this.iddetallef9 = iddetallef9;
    }
    public ActividadOperativa getActividadOperativa() {
        return this.actividadOperativa;
    }
    
    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }
    public Formato9 getFormato9() {
        return this.formato9;
    }
    
    public void setFormato9(Formato9 formato9) {
        this.formato9 = formato9;
    }
    public String getObsNegativa() {
        return this.obsNegativa;
    }
    
    public void setObsNegativa(String obsNegativa) {
        this.obsNegativa = obsNegativa;
    }
    public String getAccionesSoluciones() {
        return this.accionesSoluciones;
    }
    
    public void setAccionesSoluciones(String accionesSoluciones) {
        this.accionesSoluciones = accionesSoluciones;
    }
    public String getRecomendaciones() {
        return this.recomendaciones;
    }
    
    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }




}


