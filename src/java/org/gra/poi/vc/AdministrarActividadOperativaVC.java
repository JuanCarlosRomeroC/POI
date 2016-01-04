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
public class AdministrarActividadOperativaVC {

    @ManagedProperty(value = "#{actividadOperativa}")
    private ActividadOperativa actividadOperativa;
    @ManagedProperty(value = "#{actividadOperativaBL}")
    private ActividadOperativaBL actividadOperativaBL;
    private List<ActividadOperativa> listaActividadOperativa = new LinkedList<>();

    @ManagedProperty(value = "#{subgrupo}")
    private Subgrupo subgrupo;
    @ManagedProperty(value = "#{subgrupoBL}")
    private SubgrupoBL subgrupoBL;
    private List<Subgrupo> listaSubgrupo = new LinkedList<>();
    private long id_subgrupo;

    @ManagedProperty(value = "#{accionEstrategica}")
    private AccionEstrategica accionEstrategica;
    @ManagedProperty(value = "#{accionEstrategicaBL}")
    private AccionEstrategicaBL accionEstrategicaBL;
    private List<AccionEstrategica> listaAccionEstrategica = new LinkedList<>();
    private long id_accionEstrategica;

    @ManagedProperty(value = "#{categoriaPresupuestal}")
    private CategoriaPresupuestal categoriaPresupuestal;
    @ManagedProperty(value = "#{categoriaPresupuestalBL}")
    private CategoriaPresupuestalBL categoriaPresupuestalBL;
    private List<CategoriaPresupuestal> listaCategoriaPresupuestal = new LinkedList<>();
    private long id_categoriaPresupuestal;

    @ManagedProperty(value = "#{oePei}")
    private OePei oePei;
    @ManagedProperty(value = "#{oePeiBL}")
    private OePeiBL oePeiBL;
    private List<OePei> listaOePei = new LinkedList<>();
    private long id_oePei;

    public void init() {
        listarActividadesOperativas();
        listarSubgrupos();
        listarAccionesEstrategicas();
        listarCategoriasPresupuestales();
        listarOePei();
    }

    public void listarActividadesOperativas() {
        getListaActividadOperativa().clear();
        getListaActividadOperativa().addAll(getActividadOperativaBL().listar());
    }

    public void listarSubgrupos() {
        getListaSubgrupo().clear();
        getListaSubgrupo().addAll(getSubgrupoBL().listar(getId_accionEstrategica()));
    }

    public void listarAccionesEstrategicas() {
        if (id_oePei != 0 && id_categoriaPresupuestal != 0) {
            getListaAccionEstrategica().clear();
            getListaAccionEstrategica().addAll(getAccionEstrategicaBL().listarCP_OE(getId_categoriaPresupuestal(), getId_oePei()));
        }
    }

    public void listarCategoriasPresupuestales() {
        getListaCategoriaPresupuestal().clear();
        getListaCategoriaPresupuestal().addAll(getCategoriaPresupuestalBL().listar());
    }

    public void listarOePei() {
        getListaOePei().clear();
        getListaOePei().addAll(getOePeiBL().listar());
    }

    public void recuperarActividadOperativa(long id) {
        setActividadOperativa(getActividadOperativaBL().buscar(id));
        setId_subgrupo(getActividadOperativa().getSubgrupo().getIdsubgrupo());
        setId_accionEstrategica(getActividadOperativa().getSubgrupo().getAccionEstrategica().getIdaccionEstrategica());
        setId_categoriaPresupuestal(getActividadOperativa().getSubgrupo().getAccionEstrategica().getCategoriaPresupuestal().getIdcategoriaPresupuestal());
        setId_oePei(getActividadOperativa().getSubgrupo().getAccionEstrategica().getOePei().getIdoePei());
    }

    public void registrar() {
        getActividadOperativa().setSubgrupo(getSubgrupoBL().buscar(id_subgrupo));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getActividadOperativaBL().registrar(getActividadOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setActividadOperativa(new ActividadOperativa());
                    setId_subgrupo(0);
                    listarActividadesOperativas();
                }
            }
        });
    }

    public void actualizar() {
        getActividadOperativa().setSubgrupo(getSubgrupoBL().buscar(id_subgrupo));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getActividadOperativaBL().actualizar(getActividadOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setActividadOperativa(new ActividadOperativa());
                    setId_subgrupo(0);
                    listarActividadesOperativas();
                }
            }
        });
    }

    public void eliminar() {
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getActividadOperativaBL().eliminar(getActividadOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setActividadOperativa(new ActividadOperativa());
                    listarActividadesOperativas();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public ActividadOperativa getActividadOperativa() {
        return actividadOperativa;
    }

    public void setActividadOperativa(ActividadOperativa actividadOperativa) {
        this.actividadOperativa = actividadOperativa;
    }

    public ActividadOperativaBL getActividadOperativaBL() {
        return actividadOperativaBL;
    }

    public void setActividadOperativaBL(ActividadOperativaBL actividadOperativaBL) {
        this.actividadOperativaBL = actividadOperativaBL;
    }

    public List<ActividadOperativa> getListaActividadOperativa() {
        return listaActividadOperativa;
    }

    public void setListaActividadOperativa(List<ActividadOperativa> listaActividadOperativa) {
        this.listaActividadOperativa = listaActividadOperativa;
    }

    public Subgrupo getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(Subgrupo subgrupo) {
        this.subgrupo = subgrupo;
    }

    public SubgrupoBL getSubgrupoBL() {
        return subgrupoBL;
    }

    public void setSubgrupoBL(SubgrupoBL subgrupoBL) {
        this.subgrupoBL = subgrupoBL;
    }

    public List<Subgrupo> getListaSubgrupo() {
        return listaSubgrupo;
    }

    public void setListaSubgrupo(List<Subgrupo> listaSubgrupo) {
        this.listaSubgrupo = listaSubgrupo;
    }

    public long getId_subgrupo() {
        return id_subgrupo;
    }

    public void setId_subgrupo(long id_subgrupo) {
        this.id_subgrupo = id_subgrupo;
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
