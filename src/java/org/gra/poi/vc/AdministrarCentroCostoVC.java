package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.*;

@ManagedBean
@ViewScoped
public class AdministrarCentroCostoVC {
    
    @ManagedProperty(value = "#{centroCosto}")
    private CentroCosto centroCosto;
    
    @ManagedProperty(value = "#{centroCostoBL}")
    private CentroCostoBL centroCostoBL;
    
    private List<CentroCosto> listacentroCosto = new LinkedList<>();

    public void init(){
        listarCentroCostos();
    }
    
    public void listarCentroCostos(){
        getListacentroCosto().clear();
        getListacentroCosto().addAll(getCentroCostoBL().listar());
    }
    
    public void recuperarCentroCosto(long id){
        setCentroCosto(getCentroCostoBL().buscar(id));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getCentroCostoBL().registrar(getCentroCosto())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCentroCosto(new CentroCosto());
                    listarCentroCostos();
                }
            }
        });
    }    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getCentroCostoBL().actualizar(getCentroCosto())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCentroCosto(new CentroCosto());
                    listarCentroCostos();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getCentroCostoBL().eliminar(getCentroCosto())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCentroCosto(new CentroCosto());
                    listarCentroCostos();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public CentroCosto getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(CentroCosto centroCosto) {
        this.centroCosto = centroCosto;
    }

    public CentroCostoBL getCentroCostoBL() {
        return centroCostoBL;
    }

    public void setCentroCostoBL(CentroCostoBL centroCostoBL) {
        this.centroCostoBL = centroCostoBL;
    }

    public List<CentroCosto> getListacentroCosto() {
        return listacentroCosto;
    }

    public void setListacentroCosto(List<CentroCosto> listacentroCosto) {
        this.listacentroCosto = listacentroCosto;
    }
    //</editor-fold>
}
