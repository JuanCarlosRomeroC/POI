package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Institucion  implements java.io.Serializable {


     private long idinstitucion;
     private String denominacion;
     private String codigo;
     private Set organoUnidads = new HashSet(0);

    public Institucion() {
    }

	
    public Institucion(long idinstitucion) {
        this.idinstitucion = idinstitucion;
    }
    public Institucion(long idinstitucion, String denominacion, String codigo, Set organoUnidads) {
       this.idinstitucion = idinstitucion;
       this.denominacion = denominacion;
       this.codigo = codigo;
       this.organoUnidads = organoUnidads;
    }
   
    public long getIdinstitucion() {
        return this.idinstitucion;
    }
    
    public void setIdinstitucion(long idinstitucion) {
        this.idinstitucion = idinstitucion;
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
    public Set getOrganoUnidads() {
        return this.organoUnidads;
    }
    
    public void setOrganoUnidads(Set organoUnidads) {
        this.organoUnidads = organoUnidads;
    }




}


