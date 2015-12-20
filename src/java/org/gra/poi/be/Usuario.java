package org.gra.poi.be;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Usuario  implements java.io.Serializable {


     private long idusuario;
     private Empleado empleado;
     private String nombre;
     private String clave;
     private Boolean estado;
     private String tipoUsuario;
     private Set rolUsuarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(long idusuario) {
        this.idusuario = idusuario;
    }
    public Usuario(long idusuario, Empleado empleado, String nombre, String clave, Boolean estado, String tipoUsuario, Set rolUsuarios) {
       this.idusuario = idusuario;
       this.empleado = empleado;
       this.nombre = nombre;
       this.clave = clave;
       this.estado = estado;
       this.tipoUsuario = tipoUsuario;
       this.rolUsuarios = rolUsuarios;
    }
   
    public long getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public Set getRolUsuarios() {
        return this.rolUsuarios;
    }
    
    public void setRolUsuarios(Set rolUsuarios) {
        this.rolUsuarios = rolUsuarios;
    }




}


