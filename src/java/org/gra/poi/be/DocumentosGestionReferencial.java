package org.gra.poi.be;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class DocumentosGestionReferencial  implements java.io.Serializable {


     private long iddocumento;
     private String titulo;
     private byte[] fuente;
     private String nombre;
     private String extencion;
     private Long tamanio;
     private Set poisForIdOrganigrama = new HashSet(0);
     private Set poisForIdMarcoPresupuestario = new HashSet(0);

    public DocumentosGestionReferencial() {
    }

	
    public DocumentosGestionReferencial(long iddocumento) {
        this.iddocumento = iddocumento;
    }
    public DocumentosGestionReferencial(long iddocumento, String titulo, byte[] fuente, String nombre, String extencion, Long tamanio, Set poisForIdOrganigrama, Set poisForIdMarcoPresupuestario) {
       this.iddocumento = iddocumento;
       this.titulo = titulo;
       this.fuente = fuente;
       this.nombre = nombre;
       this.extencion = extencion;
       this.tamanio = tamanio;
       this.poisForIdOrganigrama = poisForIdOrganigrama;
       this.poisForIdMarcoPresupuestario = poisForIdMarcoPresupuestario;
    }
   
    public long getIddocumento() {
        return this.iddocumento;
    }
    
    public void setIddocumento(long iddocumento) {
        this.iddocumento = iddocumento;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public byte[] getFuente() {
        return this.fuente;
    }
    
    public void setFuente(byte[] fuente) {
        this.fuente = fuente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getExtencion() {
        return this.extencion;
    }
    
    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }
    public Long getTamanio() {
        return this.tamanio;
    }
    
    public void setTamanio(Long tamanio) {
        this.tamanio = tamanio;
    }
    public Set getPoisForIdOrganigrama() {
        return this.poisForIdOrganigrama;
    }
    
    public void setPoisForIdOrganigrama(Set poisForIdOrganigrama) {
        this.poisForIdOrganigrama = poisForIdOrganigrama;
    }
    public Set getPoisForIdMarcoPresupuestario() {
        return this.poisForIdMarcoPresupuestario;
    }
    
    public void setPoisForIdMarcoPresupuestario(Set poisForIdMarcoPresupuestario) {
        this.poisForIdMarcoPresupuestario = poisForIdMarcoPresupuestario;
    }




}


