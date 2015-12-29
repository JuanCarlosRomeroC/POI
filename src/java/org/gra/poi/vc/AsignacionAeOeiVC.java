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
public class AsignacionAeOeiVC {
    
    @ManagedProperty(value = "#{asignacionAeOei}")
    private AsignacionAeOei asignacionAeOei;    
    @ManagedProperty(value = "#{asignacionAeOeiBL}")
    private AsignacionAeOeiBL asignacionAeOeiBL;    
    private List<AsignacionAeOei> listaAsignacionAeOei = new LinkedList<>();
    
    @ManagedProperty(value = "#{accionEstrategica}")
    private AccionEstrategica accionEstrategica;    
    @ManagedProperty(value = "#{accionEstrategicaBL}")
    private AccionEstrategicaBL accionEstrategicaBL;     
    private List<AccionEstrategica> listaAccionEstrategica = new LinkedList<>();
    private long id_accionEstrategica;
    
    @ManagedProperty(value = "#{oePei}")
    private OePei oePei;    
    @ManagedProperty(value = "#{oePeiBL}")
    private OePeiBL oePeiBL;    
    private List<OePei> listaOePei = new LinkedList<>();
    private long id_oePei;
    
    public void init(){
        listarAsignacionAeOei();
        listarAccionEstrategica();
        listarOePei();
    }
    
    public void listarAsignacionAeOei(){
        getListaAsignacionAeOei().clear();
        getListaAsignacionAeOei().addAll(getAsignacionAeOeiBL().listar());
    }
    
    public void listarAccionEstrategica(){
        getListaAccionEstrategica().clear();
        getListaAccionEstrategica().addAll(getAccionEstrategicaBL().listar());
    }
    
    public void listarOePei(){
        getListaOePei().clear();
        getListaOePei().addAll(getOePeiBL().listar());
    }
    
    public void recuperarAsignacionAeOei(long id){
        setAsignacionAeOei(getAsignacionAeOeiBL().buscar(id));
        setId_oePei(getAsignacionAeOei().getOePei().getIdoePei());
        setId_accionEstrategica(getAsignacionAeOei().getAccionEstrategica().getIdaccionEstrategica());
    }
    
    public void registrar(){
        getAsignacionAeOei().setOePei(getOePeiBL().buscar(id_oePei));
        getAsignacionAeOei().setAccionEstrategica(getAccionEstrategicaBL().buscar(id_accionEstrategica));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getAsignacionAeOeiBL().registrar(getAsignacionAeOei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAsignacionAeOei(new AsignacionAeOei());
                    setId_oePei(0);
                    setId_accionEstrategica(0);
                    listarAsignacionAeOei();
                }
            }
        });
    }    
    
    public void actualizar(){
        getAsignacionAeOei().setOePei(getOePeiBL().buscar(id_oePei));
        getAsignacionAeOei().setAccionEstrategica(getAccionEstrategicaBL().buscar(id_accionEstrategica));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getAsignacionAeOeiBL().actualizar(getAsignacionAeOei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setId_oePei(0);
                    setId_accionEstrategica(0);
                    listarAsignacionAeOei();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getAsignacionAeOeiBL().eliminar(getAsignacionAeOei())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAsignacionAeOei(new AsignacionAeOei());
                    listarAsignacionAeOei();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public AsignacionAeOei getAsignacionAeOei() {
        return asignacionAeOei;
    }

    public void setAsignacionAeOei(AsignacionAeOei asignacionAeOei) {
        this.asignacionAeOei = asignacionAeOei;
    }

    public AsignacionAeOeiBL getAsignacionAeOeiBL() {
        return asignacionAeOeiBL;
    }

    public void setAsignacionAeOeiBL(AsignacionAeOeiBL asignacionAeOeiBL) {
        this.asignacionAeOeiBL = asignacionAeOeiBL;
    }

    public List<AsignacionAeOei> getListaAsignacionAeOei() {
        return listaAsignacionAeOei;
    }

    public void setListaAsignacionAeOei(List<AsignacionAeOei> listaAsignacionAeOei) {
        this.listaAsignacionAeOei = listaAsignacionAeOei;
    }

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

    public long getId_accionEstrategica() {
        return id_accionEstrategica;
    }

    public void setId_accionEstrategica(long id_accionEstrategica) {
        this.id_accionEstrategica = id_accionEstrategica;
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

    public List<OePei> getListaOePei() {
        return listaOePei;
    }

    public void setListaOePei(List<OePei> listaOePei) {
        this.listaOePei = listaOePei;
    }

    public long getId_oePei() {
        return id_oePei;
    }

    public void setId_oePei(long id_oePei) {
        this.id_oePei = id_oePei;
    }
    //</editor-fold>
}
