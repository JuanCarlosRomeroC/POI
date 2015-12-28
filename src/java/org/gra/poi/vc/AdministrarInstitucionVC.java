package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.*;

@ManagedBean
@ViewScoped
public class AdministrarInstitucionVC {
    @ManagedProperty(value = "#{institucion}")
    private Institucion institucion;
    
    @ManagedProperty(value = "#{institucionBL}")
    private InstitucionBL institucionBL;
    
    private List<Institucion> listainstitucion = new LinkedList<>();

    public void init(){
        listarInstituciones();
    }
    
    public void listarInstituciones(){
        getListainstitucion().clear();
        getListainstitucion().addAll(getInstitucionBL().listar());
    }
    
    public void recuperarInstitucion(long id){
        setInstitucion(getInstitucionBL().buscar(id));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getInstitucionBL().registrar(getInstitucion())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setInstitucion(new Institucion());
                    listarInstituciones();
                }
            }
        });
    }    
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getInstitucionBL().actualizar(getInstitucion())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setInstitucion(new Institucion());
                    listarInstituciones();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getInstitucionBL().eliminar(getInstitucion())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setInstitucion(new Institucion());
                    listarInstituciones();
                }
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public InstitucionBL getInstitucionBL() {
        return institucionBL;
    }

    public void setInstitucionBL(InstitucionBL institucionBL) {
        this.institucionBL = institucionBL;
    }

    public List<Institucion> getListainstitucion() {
        return listainstitucion;
    }

    public void setListainstitucion(List<Institucion> listainstitucion) {
        this.listainstitucion = listainstitucion;
    }
    //</editor-fold>
}
