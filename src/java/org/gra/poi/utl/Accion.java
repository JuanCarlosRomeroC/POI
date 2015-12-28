package org.gra.poi.utl;

public interface Accion {
    public static String REGISTRO="REGISTRO",
                         ACTUALIZACION="ACTUALIZACION",
                         ELIMINACION="ELIMINACION",
                         LISTADO="LISTADO";    
    
    public void procesoPost();
    public String getAccion();    
    public long getRepuesta();   
}
