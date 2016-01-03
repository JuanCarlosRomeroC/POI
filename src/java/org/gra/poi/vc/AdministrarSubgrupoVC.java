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

    public void init() {
        listarSubgrupos();
        listarAccionesEstrategicas();
        listarCategoriasPresupuestales();
    }

    public void listarSubgrupos() {
        getListaSubgrupo().clear();
        getListaSubgrupo().addAll(getSubgrupoBL().listar());
    }

    public void listarAccionesEstrategicas() {
        getListaAccionEstrategica().clear();
        getListaAccionEstrategica().addAll(getAccionEstrategicaBL().listar());
    }

    public void listarCategoriasPresupuestales() {
        getListaCategoriaPresupuestal().clear();
        getListaCategoriaPresupuestal().addAll(getCategoriaPresupuestalBL().listar());
    }

    public void recuperarSubgrupo(long id) {
        setSubgrupo(getSubgrupoBL().buscar(id));
        setId_categoriaPresupuestal(getSubgrupo().getCategoriaPresupuestal().getIdcategoriaPresupuestal());
        setId_accionEstrategica(getAccionEstrategica().getIdaccionEstrategica());        
    }

    public void registrar() {
        getSubgrupo().setCategoriaPresupuestal(getCategoriaPresupuestalBL().buscar(id_categoriaPresupuestal));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getSubgrupoBL().registrar(getSubgrupo())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setSubgrupo(new Subgrupo());
                    setId_categoriaPresupuestal(0);
                    listarSubgrupos();
                }
            }
        });
    }

    public void actualizar() {
        getSubgrupo().setCategoriaPresupuestal(getCategoriaPresupuestalBL().buscar(id_categoriaPresupuestal));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getSubgrupoBL().actualizar(getSubgrupo())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setSubgrupo(new Subgrupo());
                    setId_categoriaPresupuestal(0);
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
    //</editor-fold>
}
