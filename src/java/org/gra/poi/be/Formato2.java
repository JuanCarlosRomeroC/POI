package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato2  implements java.io.Serializable {


     private long idformato2;
     private String titulo;
     private Set detallef2s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato2() {
    }

	
    public Formato2(long idformato2) {
        this.idformato2 = idformato2;
    }
    public Formato2(long idformato2, String titulo, Set detallef2s, Set programacionActividadeses) {
       this.idformato2 = idformato2;
       this.titulo = titulo;
       this.detallef2s = detallef2s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato2() {
        return this.idformato2;
    }
    
    public void setIdformato2(long idformato2) {
        this.idformato2 = idformato2;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getDetallef2s() {
        return this.detallef2s;
    }
    
    public void setDetallef2s(Set detallef2s) {
        this.detallef2s = detallef2s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


