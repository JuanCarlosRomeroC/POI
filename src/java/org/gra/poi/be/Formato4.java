package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato4  implements java.io.Serializable {


     private long idformato4;
     private String titulo;
     private Set detallef4s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato4() {
    }

	
    public Formato4(long idformato4) {
        this.idformato4 = idformato4;
    }
    public Formato4(long idformato4, String titulo, Set detallef4s, Set programacionActividadeses) {
       this.idformato4 = idformato4;
       this.titulo = titulo;
       this.detallef4s = detallef4s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato4() {
        return this.idformato4;
    }
    
    public void setIdformato4(long idformato4) {
        this.idformato4 = idformato4;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getDetallef4s() {
        return this.detallef4s;
    }
    
    public void setDetallef4s(Set detallef4s) {
        this.detallef4s = detallef4s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


