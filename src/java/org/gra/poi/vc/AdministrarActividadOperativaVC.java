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

    public void init() {
        listarActividadesOperativas();
        listarSubgrupos();
    }

    public void listarActividadesOperativas() {
        getListaActividadOperativa().clear();
        getListaActividadOperativa().addAll(getActividadOperativaBL().listar());
    }

    public void listarSubgrupos() {
        getListaSubgrupo().clear();
        getListaSubgrupo().addAll(getSubgrupoBL().listar());
    }

    public void recuperarActividadOperativa(long id) {
        setActividadOperativa(getActividadOperativaBL().buscar(id));
        setId_subgrupo(getActividadOperativa().getSubgrupo().getIdsubgrupo());
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
    //</editor-fold>
}
