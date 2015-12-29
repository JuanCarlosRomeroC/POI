package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.*;

@ManagedBean
@ViewScoped
public class AdministrarOEVC {
    @ManagedProperty(value = "#{oePei}")
    private OePei oePei;    
    @ManagedProperty(value = "#{oePeiBL}")
    private OePeiBL oePeiBL;    
    private List<OePei> listaOePei = new LinkedList<>();
    
    public void init(){
        listarOePei();
    }
    public void listarOePei(){
        getListaOePei().clear();
        getListaOePei().addAll(getOePeiBL().listar());
    }
    
    public void recuperarOePei(long id){
        setOePei(getOePeiBL().buscar(id));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getOePeiBL().registrar(getOePei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOePei(new OePei());
                    listarOePei();
                }
            }
        });
    }    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getOePeiBL().actualizar(getOePei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOePei(new OePei());
                    listarOePei();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getOePeiBL().eliminar(getOePei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOePei(new OePei());
                    listarOePei();
                }
            }
        });
    }
     
    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public List<OePei> getListaOePei() {
        return listaOePei;
    }

    public void setListaOePei(List<OePei> listaOePei) {
        this.listaOePei = listaOePei;
    }

    public OePei getOePei() {
        return oePei;
    }

    public void setOePei(OePei oePei) {
        this.oePei = oePei;
    }

    public OePeiBL getOePeiBL() {
        return oePeiBL;
    }

    public void setOePeiBL(OePeiBL oePeiBL) {
        this.oePeiBL = oePeiBL;
    }
    //</editor-fold>
}
