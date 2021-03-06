package org.gra.poi.be;
// Generated 03/01/2016 06:23:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class DocumentosGestionReferencial  implements java.io.Serializable {


     private long iddocumento;
     private Institucion institucion;
     private String titulo;
     private byte[] fuente;
     private String nombre;
     private String extencion;
     private String mime;
     private Long tamanio;
     private Set pois = new HashSet(0);

    public DocumentosGestionReferencial() {
    }

	
    public DocumentosGestionReferencial(long iddocumento) {
        this.iddocumento = iddocumento;
    }
    public DocumentosGestionReferencial(long iddocumento, Institucion institucion, String titulo, byte[] fuente, String nombre, String extencion,String mime, Long tamanio, Set pois) {
       this.iddocumento = iddocumento;
       this.institucion = institucion;
       this.titulo = titulo;
       this.fuente = fuente;
       this.nombre = nombre;
       this.extencion = extencion;
       this.mime = mime;
       this.tamanio = tamanio;
       this.pois = pois;
    }
   
    public long getIddocumento() {
        return this.iddocumento;
    }
    
    public void setIddocumento(long iddocumento) {
        this.iddocumento = iddocumento;
    }
    public Institucion getInstitucion() {
        return this.institucion;
    }
    
    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
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
    public Set getPois() {
        return this.pois;
    }
    
    public void setPois(Set pois) {
        this.pois = pois;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }




}


