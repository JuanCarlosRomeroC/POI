package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato6  implements java.io.Serializable {


     private long idformato6;
     private String titulo;
     private Set detallef6s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato6() {
    }

	
    public Formato6(long idformato6) {
        this.idformato6 = idformato6;
    }
    public Formato6(long idformato6, String titulo, Set detallef6s, Set programacionActividadeses) {
       this.idformato6 = idformato6;
       this.titulo = titulo;
       this.detallef6s = detallef6s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato6() {
        return this.idformato6;
    }
    
    public void setIdformato6(long idformato6) {
        this.idformato6 = idformato6;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getDetallef6s() {
        return this.detallef6s;
    }
    
    public void setDetallef6s(Set detallef6s) {
        this.detallef6s = detallef6s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


