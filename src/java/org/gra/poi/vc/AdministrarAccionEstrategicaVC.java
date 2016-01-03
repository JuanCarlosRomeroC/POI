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
    
    @ManagedProperty(value = "#{oePei}")
    private OePei oePei;    
    @ManagedProperty(value = "#{oePeiBL}")
    private OePeiBL oePeiBL;    
    private List<OePei> listaOePei = new LinkedList<>();
    private long id_oePei;
    
    @ManagedProperty(value = "#{categoriaPresupuestal}")
    private CategoriaPresupuestal categoriaPresupuestal;    
    @ManagedProperty(value = "#{categoriaPresupuestalBL}")
    private CategoriaPresupuestalBL categoriaPresupuestalBL;
    private List<CategoriaPresupuestal> listaCategoriaPresupuestal = new LinkedList<>();
    private long id_categoriaPresupuestal;
    
    @ManagedProperty(value = "#{centroCosto}")
    private CentroCosto centroCosto;    
    @ManagedProperty(value = "#{centroCostoBL}")
    private CentroCostoBL centroCostoBL;
    private List<CentroCosto> listaCentroCosto = new LinkedList<>();
    private long id_centroCosto;
    
    public void init(){
        listarAccionesEstrategicas();
        listarOePei();
        listarCategoriasPresupuestales();
        listarCentroCostos();
    }
    
    public void listarAccionesEstrategicas(){
        getListaAccionEstrategica().clear();
        getListaAccionEstrategica().addAll(getAccionEstrategicaBL().listar());
    }
    
    public void listarOePei(){
        getListaOePei().clear();
        getListaOePei().addAll(getOePeiBL().listar());
    }
    
    public void listarCategoriasPresupuestales(){
        getListaCategoriaPresupuestal().clear();
        getListaCategoriaPresupuestal().addAll(getCategoriaPresupuestalBL().listar());
    }
    
    public void listarCentroCostos(){
        getListaCentroCosto().clear();
        getListaCentroCosto().addAll(getCentroCostoBL().listar());
    }
    
    public void recuperarAccionEstrategica(long id){
        setAccionEstrategica(getAccionEstrategicaBL().buscar(id));
        setId_oePei(getAccionEstrategica().getOePei().getIdoePei());
        setId_categoriaPresupuestal(getAccionEstrategica().getCategoriaPresupuestal().getIdcategoriaPresupuestal());
        setId_centroCosto(getAccionEstrategica().getCentroCosto().getIdcentroCosto());
    }
    
    public void registrar(){
        getAccionEstrategica().setOePei(getOePeiBL().buscar(id_oePei));
        getAccionEstrategica().setCategoriaPresupuestal(getCategoriaPresupuestalBL().buscar(id_categoriaPresupuestal));
        getAccionEstrategica().setCentroCosto(getCentroCostoBL().buscar(id_centroCosto));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getAccionEstrategicaBL().registrar(getAccionEstrategica())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAccionEstrategica(new AccionEstrategica());
                    setId_oePei(0);
                    setId_categoriaPresupuestal(0);
                    setId_centroCosto(0);
                    listarAccionesEstrategicas();
                }
            }
        });
    } 
    
    public void actualizar(){
        getAccionEstrategica().setOePei(getOePeiBL().buscar(id_oePei));
        getAccionEstrategica().setCategoriaPresupuestal(getCategoriaPresupuestalBL().buscar(id_categoriaPresupuestal));
        getAccionEstrategica().setCentroCosto(getCentroCostoBL().buscar(id_centroCosto));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getAccionEstrategicaBL().actualizar(getAccionEstrategica())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setAccionEstrategica(new AccionEstrategica());
                    setId_oePei(0);
                    setId_categoriaPresupuestal(0);
                    setId_centroCosto(0);
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

    public CategoriaPresupuestal getCategoriaPresupuestal() {
        return categoriaPresupuestal;
    }

    public void setCategoriaPresupuestal(CategoriaPresupuestal categoriaPresupuestal) {
        this.categoriaPresupuestal = categoriaPresupuestal;
    }

    public CategoriaPresupuestalBL getCategoriaPresupuestalBL() {
        return categoriaPresupuestalBL;
    }

    public void setCategoriaPresupuestalBL(CategoriaPresupuestalBL categoriaPresupuestalBL) {
        this.categoriaPresupuestalBL = categoriaPresupuestalBL;
    }

    public List<CategoriaPresupuestal> getListaCategoriaPresupuestal() {
        return listaCategoriaPresupuestal;
    }

    public void setListaCategoriaPresupuestal(List<CategoriaPresupuestal> listaCategoriaPresupuestal) {
        this.listaCategoriaPresupuestal = listaCategoriaPresupuestal;
    }

    public long getId_categoriaPresupuestal() {
        return id_categoriaPresupuestal;
    }

    public void setId_categoriaPresupuestal(long id_categoriaPresupuestal) {
        this.id_categoriaPresupuestal = id_categoriaPresupuestal;
    }

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

    public List<CentroCosto> getListaCentroCosto() {
        return listaCentroCosto;
    }

    public void setListaCentroCosto(List<CentroCosto> listaCentroCosto) {
        this.listaCentroCosto = listaCentroCosto;
    }

    public long getId_centroCosto() {
        return id_centroCosto;
    }

    public void setId_centroCosto(long id_centroCosto) {
        this.id_centroCosto = id_centroCosto;
    }
    //</editor-fold>
}
