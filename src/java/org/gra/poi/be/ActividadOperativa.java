package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class ActividadOperativa  implements java.io.Serializable {


     private long idactividadOperativa;
     private Subgrupo subgrupo;
     private String denominacion;
     private String codigo;
     private Set detallef9s = new HashSet(0);
     private Set metaOperativas = new HashSet(0);
     private Set detallef1s = new HashSet(0);

    public ActividadOperativa() {
    }

	
    public ActividadOperativa(long idactividadOperativa) {
        this.idactividadOperativa = idactividadOperativa;
    }
    public ActividadOperativa(long idactividadOperativa, Subgrupo subgrupo, String denominacion, String codigo, Set detallef9s, Set metaOperativas, Set detallef1s) {
       this.idactividadOperativa = idactividadOperativa;
       this.subgrupo = subgrupo;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.detallef9s = detallef9s;
       this.metaOperativas = metaOperativas;
       this.detallef1s = detallef1s;
    }
   
    public long getIdactividadOperativa() {
        return this.idactividadOperativa;
    }
    
    public void setIdactividadOperativa(long idactividadOperativa) {
        this.idactividadOperativa = idactividadOperativa;
    }
    public Subgrupo getSubgrupo() {
        return this.subgrupo;
    }
    
    public void setSubgrupo(Subgrupo subgrupo) {
        this.subgrupo = subgrupo;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Set getDetallef9s() {
        return this.detallef9s;
    }
    
    public void setDetallef9s(Set detallef9s) {
        this.detallef9s = detallef9s;
    }
    public Set getMetaOperativas() {
        return this.metaOperativas;
    }
    
    public void setMetaOperativas(Set metaOperativas) {
        this.metaOperativas = metaOperativas;
    }
    public Set getDetallef1s() {
        return this.detallef1s;
    }
    
    public void setDetallef1s(Set detallef1s) {
        this.detallef1s = detallef1s;
    }




}


