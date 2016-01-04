package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class OrganoUnidad  implements java.io.Serializable {


     private long idorgano;
     private Institucion institucion;
     private String denominacion;
     private String tipoOrgano;
     private String codigo;
     private Set empleados = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public OrganoUnidad() {
    }

	
    public OrganoUnidad(long idorgano) {
        this.idorgano = idorgano;
    }
    public OrganoUnidad(long idorgano, Institucion institucion, String denominacion, String tipoOrgano, String codigo, Set empleados, Set programacionActividadeses) {
       this.idorgano = idorgano;
       this.institucion = institucion;
       this.denominacion = denominacion;
       this.tipoOrgano = tipoOrgano;
       this.codigo = codigo;
       this.empleados = empleados;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdorgano() {
        return this.idorgano;
    }
    
    public void setIdorgano(long idorgano) {
        this.idorgano = idorgano;
    }
    public Institucion getInstitucion() {
        return this.institucion;
    }
    
    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getTipoOrgano() {
        return this.tipoOrgano;
    }
    
    public void setTipoOrgano(String tipoOrgano) {
        this.tipoOrgano = tipoOrgano;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


