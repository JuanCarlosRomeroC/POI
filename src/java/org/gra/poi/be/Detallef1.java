package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Detallef1  implements java.io.Serializable {


     private long iddetallef1;
     private ActividadOperativa actividadOperativa;
     private Formato1 formato1;
     private OePei oePei;
     private String programaPresupuestalResumen;
     private Long idAccionEstrategica;
     private String accionEstragicaResumen;
     private String subgrupoResumen;

    public Detallef1() {
    }

	
    public Detallef1(long iddetallef1) {
        this.iddetallef1 = iddetallef1;
    }
    public Detallef1(long iddetallef1, ActividadOperativa actividadOperativa, Formato1 formato1, OePei oePei, String programaPresupuestalResumen, Long idAccionEstrategica, String accionEstragicaResumen, String subgrupoResumen) {
       this.iddetallef1 = iddetallef1;
       this.actividadOperativa = actividadOperativa;
       this.formato1 = formato1;
       this.oePei = oePei;
       this.programaPresupuestalResumen = programaPresupuestalResumen;
       this.idAccionEstrategica = idAccionEstrategica;
       this.accionEstragicaResumen = accionEstragicaResumen;
       this.subgrupoResumen = subgrupoResumen;
    }
   
    public long getIddetallef1() {
        return this.iddetallef1;
    }
    
    public void setIddetallef1(long iddetallef1) {
        this.iddetallef1 = iddetallef1;
    }
    public ActividadOperativa getActividadOperativa() {
        return this.actividadOperativa;
    }
    
    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }
    public Formato1 getFormato1() {
        return this.formato1;
    }
    
    public void setFormato1(Formato1 formato1) {
        this.formato1 = formato1;
    }
    public OePei getOePei() {
        return this.oePei;
    }
    
    public void setOePei(OePei oePei) {
        this.oePei = oePei;
    }
    public String getProgramaPresupuestalResumen() {
        return this.programaPresupuestalResumen;
    }
    
    public void setProgramaPresupuestalResumen(String programaPresupuestalResumen) {
        this.programaPresupuestalResumen = programaPresupuestalResumen;
    }
    public Long getIdAccionEstrategica() {
        return this.idAccionEstrategica;
    }
    
    public void setIdAccionEstrategica(Long idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }
    public String getAccionEstragicaResumen() {
        return this.accionEstragicaResumen;
    }
    
    public void setAccionEstragicaResumen(String accionEstragicaResumen) {
        this.accionEstragicaResumen = accionEstragicaResumen;
    }
    public String getSubgrupoResumen() {
        return this.subgrupoResumen;
    }
    
    public void setSubgrupoResumen(String subgrupoResumen) {
        this.subgrupoResumen = subgrupoResumen;
    }




}


