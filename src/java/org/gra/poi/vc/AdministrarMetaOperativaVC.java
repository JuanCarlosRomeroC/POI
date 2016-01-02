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
public class AdministrarMetaOperativaVC {
    @ManagedProperty(value = "#{metaOperativa}")
    private MetaOperativa metaOperativa;    
    @ManagedProperty(value = "#{metaOperativaBL}")
    private MetaOperativaBL metaOperativaBL;    
    private List<MetaOperativa> listaMetaOperativa = new LinkedList<>();
    
    @ManagedProperty(value = "#{actividadOperativa}")
    private ActividadOperativa actividadOperativa;    
    @ManagedProperty(value = "#{actividadOperativaBL}")
    private ActividadOperativaBL actividadOperativaBL;    
    private List<ActividadOperativa> listaActividadOperativa = new LinkedList<>();
    private long id_actividadOperativa;
    
    @ManagedProperty(value = "#{subgrupo}")
    private Subgrupo subgrupo;    
    @ManagedProperty(value = "#{subgrupoBL}")
    private SubgrupoBL subgrupoBL;    
    private List<Subgrupo> listaSubgrupo = new LinkedList<>();
    private long id_subgrupo;

    public void init(){
        listarMetasOperativas();       
        listarActividadesOperativas();       
        listarSubgrupos();       
    }
    
    public void listarMetasOperativas(){
        getListaMetaOperativa().clear();
        getListaMetaOperativa().addAll(getMetaOperativaBL().listar());
    }   
    
    public void listarActividadesOperativas(){
        getListaActividadOperativa().clear();
        getListaActividadOperativa().addAll(getActividadOperativaBL().listar(getId_subgrupo()));
    }
    
    public void listarSubgrupos(){
        getListaSubgrupo().clear();
        getListaSubgrupo().addAll(getSubgrupoBL().listar());
    }
    
    public void recuperarMetaOperativa(long id){
        setMetaOperativa(getMetaOperativaBL().buscar(id));
        setId_actividadOperativa(getMetaOperativa().getActividadOperativa().getIdactividadOperativa());
        setId_subgrupo(getMetaOperativa().getActividadOperativa().getSubgrupo().getIdsubgrupo());
    }
    
    public void registrar(){
        getMetaOperativa().setActividadOperativa(getActividadOperativaBL().buscar(id_actividadOperativa));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getMetaOperativaBL().registrar(getMetaOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setMetaOperativa(new MetaOperativa());
                    setId_actividadOperativa(0);
                    listarMetasOperativas();
                }
            }
        });
    }    
    public void actualizar(){
        getMetaOperativa().setActividadOperativa(getActividadOperativaBL().buscar(id_actividadOperativa));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getMetaOperativaBL().actualizar(getMetaOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setMetaOperativa (new MetaOperativa());
                    setId_actividadOperativa(0);
                    listarMetasOperativas();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getMetaOperativaBL().eliminar(getMetaOperativa())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setMetaOperativa(new MetaOperativa());
                    listarMetasOperativas();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public MetaOperativa getMetaOperativa() {
        return metaOperativa;
    }

    public void setMetaOperativa(MetaOperativa metaOperativa) {
        this.metaOperativa = metaOperativa;
    }

    public MetaOperativaBL getMetaOperativaBL() {
        return metaOperativaBL;
    }

    public void setMetaOperativaBL(MetaOperativaBL metaOperativaBL) {
        this.metaOperativaBL = metaOperativaBL;
    }

    public List<MetaOperativa> getListaMetaOperativa() {
        return listaMetaOperativa;
    }

    public void setListaMetaOperativa(List<MetaOperativa> listaMetaOperativa) {
        this.listaMetaOperativa = listaMetaOperativa;
    }

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

    public long getId_actividadOperativa() {
        return id_actividadOperativa;
    }

    public void setId_actividadOperativa(long id_actividadOperativa) {
        this.id_actividadOperativa = id_actividadOperativa;
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
