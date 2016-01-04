package org.gra.poi.be;
import org.springframework.stereotype.Component;

@Component
public class ProgramacionActividades  implements java.io.Serializable {


     private long idprogramacion;
     private AccionEstrategica accionEstrategica;
     private CategoriaPresupuestal categoriaPresupuestal;
     private Formato1 formato1;
     private Formato2 formato2;
     private Formato3 formato3;
     private Formato4 formato4;
     private Formato5 formato5;
     private Formato6 formato6;
     private Formato7 formato7;
     private Formato8 formato8;
     private Formato9 formato9;
     private OrganoUnidad organoUnidad;
     private Poi poi;
     private Subgrupo subgrupo;
     private Long idMeta;

    public ProgramacionActividades() {
    }

	
    public ProgramacionActividades(long idprogramacion) {
        this.idprogramacion = idprogramacion;
    }
    public ProgramacionActividades(long idprogramacion, AccionEstrategica accionEstrategica, CategoriaPresupuestal categoriaPresupuestal, Formato1 formato1, Formato2 formato2, Formato3 formato3, Formato4 formato4, Formato5 formato5, Formato6 formato6, Formato7 formato7, Formato8 formato8, Formato9 formato9, OrganoUnidad organoUnidad, Poi poi, Subgrupo subgrupo, Long idMeta) {
       this.idprogramacion = idprogramacion;
       this.accionEstrategica = accionEstrategica;
       this.categoriaPresupuestal = categoriaPresupuestal;
       this.formato1 = formato1;
       this.formato2 = formato2;
       this.formato3 = formato3;
       this.formato4 = formato4;
       this.formato5 = formato5;
       this.formato6 = formato6;
       this.formato7 = formato7;
       this.formato8 = formato8;
       this.formato9 = formato9;
       this.organoUnidad = organoUnidad;
       this.poi = poi;
       this.subgrupo = subgrupo;
       this.idMeta = idMeta;
    }
   
    public long getIdprogramacion() {
        return this.idprogramacion;
    }
    
    public void setIdprogramacion(long idprogramacion) {
        this.idprogramacion = idprogramacion;
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
    public Formato1 getFormato1() {
        return this.formato1;
    }
    
    public void setFormato1(Formato1 formato1) {
        this.formato1 = formato1;
    }
    public Formato2 getFormato2() {
        return this.formato2;
    }
    
    public void setFormato2(Formato2 formato2) {
        this.formato2 = formato2;
    }
    public Formato3 getFormato3() {
        return this.formato3;
    }
    
    public void setFormato3(Formato3 formato3) {
        this.formato3 = formato3;
    }
    public Formato4 getFormato4() {
        return this.formato4;
    }
    
    public void setFormato4(Formato4 formato4) {
        this.formato4 = formato4;
    }
    public Formato5 getFormato5() {
        return this.formato5;
    }
    
    public void setFormato5(Formato5 formato5) {
        this.formato5 = formato5;
    }
    public Formato6 getFormato6() {
        return this.formato6;
    }
    
    public void setFormato6(Formato6 formato6) {
        this.formato6 = formato6;
    }
    public Formato7 getFormato7() {
        return this.formato7;
    }
    
    public void setFormato7(Formato7 formato7) {
        this.formato7 = formato7;
    }
    public Formato8 getFormato8() {
        return this.formato8;
    }
    
    public void setFormato8(Formato8 formato8) {
        this.formato8 = formato8;
    }
    public Formato9 getFormato9() {
        return this.formato9;
    }
    
    public void setFormato9(Formato9 formato9) {
        this.formato9 = formato9;
    }
    public OrganoUnidad getOrganoUnidad() {
        return this.organoUnidad;
    }
    
    public void setOrganoUnidad(OrganoUnidad organoUnidad) {
        this.organoUnidad = organoUnidad;
    }
    public Poi getPoi() {
        return this.poi;
    }
    
    public void setPoi(Poi poi) {
        this.poi = poi;
    }
    public Subgrupo getSubgrupo() {
        return this.subgrupo;
    }
    
    public void setSubgrupo(Subgrupo subgrupo) {
        this.subgrupo = subgrupo;
    }
    public Long getIdMeta() {
        return this.idMeta;
    }
    
    public void setIdMeta(Long idMeta) {
        this.idMeta = idMeta;
    }




}


