package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato9  implements java.io.Serializable {


     private long idformato9;
     private String titulo;
     private String periodo;
     private Set programacionActividadeses = new HashSet(0);
     private Set detallef9s = new HashSet(0);

    public Formato9() {
    }

	
    public Formato9(long idformato9) {
        this.idformato9 = idformato9;
    }
    public Formato9(long idformato9, String titulo, String periodo, Set programacionActividadeses, Set detallef9s) {
       this.idformato9 = idformato9;
       this.titulo = titulo;
       this.periodo = periodo;
       this.programacionActividadeses = programacionActividadeses;
       this.detallef9s = detallef9s;
    }
   
    public long getIdformato9() {
        return this.idformato9;
    }
    
    public void setIdformato9(long idformato9) {
        this.idformato9 = idformato9;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public Set getProgramacionActividadeses() {
        return this.programacionActividadeses;
    }
    
    public void setProgramacionActividadeses(Set programacionActividadeses) {
        this.programacionActividadeses = programacionActividadeses;
    }
    public Set getDetallef9s() {
        return this.detallef9s;
    }
    
    public void setDetallef9s(Set detallef9s) {
        this.detallef9s = detallef9s;
    }




}


