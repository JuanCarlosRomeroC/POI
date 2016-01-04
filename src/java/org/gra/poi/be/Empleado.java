package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Empleado  implements java.io.Serializable {


     private long idempleado;
     private OrganoUnidad organoUnidad;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String dni;
     private String telefono;
     private String condicion;
     private String abreviaturaProfesion;
     private Set usuarios = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(long idempleado) {
        this.idempleado = idempleado;
    }
    public Empleado(long idempleado, OrganoUnidad organoUnidad, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String condicion, String abreviaturaProfesion, Set usuarios) {
       this.idempleado = idempleado;
       this.organoUnidad = organoUnidad;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.dni = dni;
       this.telefono = telefono;
       this.condicion = condicion;
       this.abreviaturaProfesion = abreviaturaProfesion;
       this.usuarios = usuarios;
    }
   
    public long getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(long idempleado) {
        this.idempleado = idempleado;
    }
    public OrganoUnidad getOrganoUnidad() {
        return this.organoUnidad;
    }
    
    public void setOrganoUnidad(OrganoUnidad organoUnidad) {
        this.organoUnidad = organoUnidad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCondicion() {
        return this.condicion;
    }
    
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    public String getAbreviaturaProfesion() {
        return this.abreviaturaProfesion;
    }
    
    public void setAbreviaturaProfesion(String abreviaturaProfesion) {
        this.abreviaturaProfesion = abreviaturaProfesion;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


