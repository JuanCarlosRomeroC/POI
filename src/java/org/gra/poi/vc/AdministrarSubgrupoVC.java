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
public class AdministrarSubgrupoVC {

    @ManagedProperty(value = "#{subgrupo}")
    private Subgrupo subgrupo;
    @ManagedProperty(value = "#{subgrupoBL}")
    private SubgrupoBL subgrupoBL;
    private List<Subgrupo> listaSubgrupo = new LinkedList<>();

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
        listarSubgrupos();
        listarAccionesEstrategicas();
        listarCategoriasPresupuestales();
        listarOePei();
    }

    public void listarSubgrupos() {
        getListaSubgrupo().clear();
        getListaSubgrupo().addAll(getSubgrupoBL().listar());
    }

    public void listarAccionesEstrategicas() {
        if(id_oePei !=0 && id_categoriaPresupuestal !=0){
            
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

    public void recuperarSubgrupo(long id) {
        setSubgrupo(getSubgrupoBL().buscar(id));
        setId_accionEstrategica(getSubgrupo().getAccionEstrategica().getIdaccionEstrategica());
        setId_categoriaPresupuestal(getSubgrupo().getAccionEstrategica().getCategoriaPresupuestal().getIdcategoriaPresupuestal());
        setId_oePei(getSubgrupo().getAccionEstrategica().getOePei().getIdoePei());
    }

    public void registrar() {
        getSubgrupo().setAccionEstrategica(getAccionEstrategicaBL().buscar(id_accionEstrategica));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getSubgrupoBL().registrar(getSubgrupo())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setSubgrupo(new Subgrupo());
                    setId_accionEstrategica(0);
                    listarSubgrupos();
                }
            }
        });
    }

    public void actualizar() {
        getSubgrupo().setAccionEstrategica(getAccionEstrategicaBL().buscar(id_accionEstrategica));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getSubgrupoBL().actualizar(getSubgrupo())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setSubgrupo(new Subgrupo());
                    setId_accionEstrategica(0);
                    listarSubgrupos();
                }
            }
        });
    }

    public void eliminar() {
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getSubgrupoBL().eliminar(getSubgrupo())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setSubgrupo(new Subgrupo());
                    listarSubgrupos();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
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
