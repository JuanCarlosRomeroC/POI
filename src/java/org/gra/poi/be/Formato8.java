package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato8  implements java.io.Serializable {


     private long idformato8;
     private String titulo;
     private Set programacionActividadeses = new HashSet(0);
     private Set detallef8s = new HashSet(0);

    public Formato8() {
    }

	
    public Formato8(long idformato8) {
        this.idformato8 = idformato8;
    }
    public Formato8(long idformato8, String titulo, Set programacionActividadeses, Set detallef8s) {
       this.idformato8 = idformato8;
       this.titulo = titulo;
       this.programacionActividadeses = programacionActividadeses;
       this.detallef8s = detallef8s;
    }
   
    public long getIdformato8() {
        return this.idformato8;
    }
    
    public void setIdformato8(long idformato8) {
        this.idformato8 = idformato8;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    public Set getDetallef8s() {
        return this.detallef8s;
    }
    
    public void setDetallef8s(Set detallef8s) {
        this.detallef8s = detallef8s;
    }




}


