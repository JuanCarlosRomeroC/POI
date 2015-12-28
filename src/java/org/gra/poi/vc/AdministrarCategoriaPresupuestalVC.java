package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.*;

@ManagedBean
@ViewScoped
public class AdministrarCategoriaPresupuestalVC {
    @ManagedProperty(value = "#{categoriaPresupuestal}")
    private CategoriaPresupuestal categoriaPresupuestal;
    
    @ManagedProperty(value = "#{categoriaPresupuestalBL}")
    private CategoriaPresupuestalBL categoriaPresupuestalBL;
    
    private List<CategoriaPresupuestal> listacategoriaPresupuestal = new LinkedList<>();

    public void init(){
        listarCategoriasPresupuestales();
    }
    
    public void listarCategoriasPresupuestales(){
        getListacategoriaPresupuestal().clear();
        getListacategoriaPresupuestal().addAll(getCategoriaPresupuestalBL().listar());
    }
    
    public void recuperarCategoriaPresupuestal(long id){
        setCategoriaPresupuestal(getCategoriaPresupuestalBL().buscar(id));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getCategoriaPresupuestalBL().registrar(getCategoriaPresupuestal())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCategoriaPresupuestal(new CategoriaPresupuestal());
                    listarCategoriasPresupuestales();
                }
            }
        });
    }    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getCategoriaPresupuestalBL().actualizar(getCategoriaPresupuestal())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCategoriaPresupuestal(new CategoriaPresupuestal());
                    listarCategoriasPresupuestales();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getCategoriaPresupuestalBL().eliminar(getCategoriaPresupuestal())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setCategoriaPresupuestal(new CategoriaPresupuestal());
                    listarCategoriasPresupuestales();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
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

    public List<CategoriaPresupuestal> getListacategoriaPresupuestal() {
        return listacategoriaPresupuestal;
    }

    public void setListacategoriaPresupuestal(List<CategoriaPresupuestal> listacategoriaPresupuestal) {
        this.listacategoriaPresupuestal = listacategoriaPresupuestal;
    }
    //</editor-fold>
}
