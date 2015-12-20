package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato7  implements java.io.Serializable {


     private long idformato7;
     private String titulo;
     private Set detallef7s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato7() {
    }

	
    public Formato7(long idformato7) {
        this.idformato7 = idformato7;
    }
    public Formato7(long idformato7, String titulo, Set detallef7s, Set programacionActividadeses) {
       this.idformato7 = idformato7;
       this.titulo = titulo;
       this.detallef7s = detallef7s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato7() {
        return this.idformato7;
    }
    
    public void setIdformato7(long idformato7) {
        this.idformato7 = idformato7;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getDetallef7s() {
        return this.detallef7s;
    }
    
    public void setDetallef7s(Set detallef7s) {
        this.detallef7s = detallef7s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


