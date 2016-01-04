package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato3  implements java.io.Serializable {


     private long idformato3;
     private String titulo;
     private Set detallef3s = new HashSet(0);
     private Set programacionActividadeses = new HashSet(0);

    public Formato3() {
    }

	
    public Formato3(long idformato3) {
        this.idformato3 = idformato3;
    }
    public Formato3(long idformato3, String titulo, Set detallef3s, Set programacionActividadeses) {
       this.idformato3 = idformato3;
       this.titulo = titulo;
       this.detallef3s = detallef3s;
       this.programacionActividadeses = programacionActividadeses;
    }
   
    public long getIdformato3() {
        return this.idformato3;
    }
    
    public void setIdformato3(long idformato3) {
        this.idformato3 = idformato3;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set getDetallef3s() {
        return this.detallef3s;
    }
    
    public void setDetallef3s(Set detallef3s) {
        this.detallef3s = detallef3s;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }




}


