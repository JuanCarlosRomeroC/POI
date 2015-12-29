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
public class AdministrarAccionEstrategicaVC {
    
    @ManagedProperty(value = "#{accionEstrategica}")
    private AccionEstrategica accionEstrategica;    
    @ManagedProperty(value = "#{accionEstrategicaBL}")
    private AccionEstrategicaBL accionEstrategicaBL;    
    private List<AccionEstrategica> listaAccionEstrategica = new LinkedList<>();
    
    public void init(){
        listarAccionesEstrategicas();
    }
    
    public void listarAccionesEstrategicas(){
        getListaAccionEstrategica().clear();
        getListaAccionEstrategica().addAll(getAccionEstrategicaBL().listar());
    }
    
    public void recuperarAccionEstrategica(long id){
        setAccionEstrategica(getAccionEstrategicaBL().buscar(id));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getAccionEstrategicaBL().registrar(getAccionEstrategica())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAccionEstrategica(new AccionEstrategica());
                    listarAccionesEstrategicas();
                }
            }
        });
    }    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getAccionEstrategicaBL().actualizar(getAccionEstrategica())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAccionEstrategica(new AccionEstrategica());
                    listarAccionesEstrategicas();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getAccionEstrategicaBL().eliminar(getAccionEstrategica())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAccionEstrategica(new AccionEstrategica());
                    listarAccionesEstrategicas();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public AccionEstrategica getAccionEstrategica() {
        return accionEstrategica;
    }

    public void setAccionEstrategica(AccionEstrategica accionEstrategica) {
        this.accionEstrategica = accionEstrategica;
    }

    public AccionEstrategicaBL getAccionEstrategicaBL() {
        return accionEstrategicaBL;
    }

    public void setAccionEstrategicaBL(AccionEstrategicaBL accionEstrategicaBL) {
        this.accionEstrategicaBL = accionEstrategicaBL;
    }

    public List<AccionEstrategica> getListaAccionEstrategica() {
        return listaAccionEstrategica;
    }

    public void setListaAccionEstrategica(List<AccionEstrategica> listaAccionEstrategica) {
        this.listaAccionEstrategica = listaAccionEstrategica;
    }
    //</editor-fold>
}
