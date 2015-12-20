package org.gra.poi.be;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class RolUsuario  implements java.io.Serializable {


     private long idrolUsuario;
     private Usuario usuario;
     private String nombreModulo;

    public RolUsuario() {
    }

	
    public RolUsuario(long idrolUsuario) {
        this.idrolUsuario = idrolUsuario;
    }
    public RolUsuario(long idrolUsuario, Usuario usuario, String nombreModulo) {
       this.idrolUsuario = idrolUsuario;
       this.usuario = usuario;
       this.nombreModulo = nombreModulo;
    }
   
    public long getIdrolUsuario() {
        return this.idrolUsuario;
    }
    
    public void setIdrolUsuario(long idrolUsuario) {
        this.idrolUsuario = idrolUsuario;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombreModulo() {
        return this.nombreModulo;
    }
    
    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }




}


