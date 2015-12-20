package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Formato1  implements java.io.Serializable {


     private long idformato1;
     private String titulo;
     private Set programacionActividadeses = new HashSet(0);
     private Set detallef1s = new HashSet(0);

    public Formato1() {
    }

	
    public Formato1(long idformato1) {
        this.idformato1 = idformato1;
    }
    public Formato1(long idformato1, String titulo, Set programacionActividadeses, Set detallef1s) {
       this.idformato1 = idformato1;
       this.titulo = titulo;
       this.programacionActividadeses = programacionActividadeses;
       this.detallef1s = detallef1s;
    }
   
    public long getIdformato1() {
        return this.idformato1;
    }
    
    public void setIdformato1(long idformato1) {
        this.idformato1 = idformato1;
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
    public Set getDetallef1s() {
        return this.detallef1s;
    }
    
    public void setDetallef1s(Set detallef1s) {
        this.detallef1s = detallef1s;
    }




}


