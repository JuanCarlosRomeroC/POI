package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato5  implements java.io.Serializable {


     private long idformato5;
     private String titulo;
     private String fteFinanciamiento;
     private Set detallef5s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato5() {
    }

	
    public Formato5(long idformato5) {
        this.idformato5 = idformato5;
    }
    public Formato5(long idformato5, String titulo, String fteFinanciamiento, Set detallef5s, Set programacionActividadeses) {
       this.idformato5 = idformato5;
       this.titulo = titulo;
       this.fteFinanciamiento = fteFinanciamiento;
       this.detallef5s = detallef5s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato5() {
        return this.idformato5;
    }
    
    public void setIdformato5(long idformato5) {
        this.idformato5 = idformato5;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFteFinanciamiento() {
        return this.fteFinanciamiento;
    }
    
    public void setFteFinanciamiento(String fteFinanciamiento) {
        this.fteFinanciamiento = fteFinanciamiento;
    }
    public Set getDetallef5s() {
        return this.detallef5s;
    }
    
    public void setDetallef5s(Set detallef5s) {
        this.detallef5s = detallef5s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


