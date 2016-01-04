package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.Accion;
import org.gra.poi.utl.Tarea;
import org.gra.poi.utl.Utilitario;

@ManagedBean
@ViewScoped
public class AdministrarPOIVC {
    
    @ManagedProperty(value = "#{poi}")
    private Poi poi;    
    @ManagedProperty(value = "#{poiBL}")
    private PoiBL poiBL;    
    private List<Poi> listaPoi = new LinkedList<>();
        
    public void init(){
        listarPois();        
    }
    
    public void listarPois(){
        getListaPoi().clear();
        getListaPoi().addAll(getPoiBL().listar());
    }
    
    public void recuperarPoi(long id){
        
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getPoiBL().registrar(getPoi())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setPoi(new Poi());
                    
                    listarPois();
                }
            }
        });
    } 
    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getPoiBL().actualizar(getPoi())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setPoi(new Poi());
                    
                    listarPois();
                }
            }
        });
    } 
    
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getPoiBL().eliminar(getPoi())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setPoi(new Poi());
                    
                    listarPois();
                }
            }
        });
    }

    public Poi getPoi() {
        return poi;
    }

    public void setPoi(Poi poi) {
        this.poi = poi;
    }

    public PoiBL getPoiBL() {
        return poiBL;
    }

    public void setPoiBL(PoiBL poiBL) {
        this.poiBL = poiBL;
    }

    public List<Poi> getListaPoi() {
        return listaPoi;
    }

    public void setListaPoi(List<Poi> listaPoi) {
        this.listaPoi = listaPoi;
    }

}
