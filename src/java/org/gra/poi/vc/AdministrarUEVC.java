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
public class AdministrarUEVC {
    
    @ManagedProperty(value = "#{organoUnidad}")
    private OrganoUnidad organoUnidad;    
    @ManagedProperty(value = "#{organoUnidadBL}")
    private OrganoUnidadBL organoUnidadBL;    
    private List<OrganoUnidad> listaOrganoUnidad = new LinkedList<>();
    
    @ManagedProperty(value = "#{institucion}")
    private Institucion institucion;    
    @ManagedProperty(value = "#{institucionBL}")
    private InstitucionBL institucionBL;    
    private List<Institucion> listaInstitucion = new LinkedList<>();
    private long id_institucion;

    public void init(){
        listarOrganosUnidad();
        listarInstituciones();
    }
    
    public void listarOrganosUnidad(){
        getListaOrganoUnidad().clear();
        getListaOrganoUnidad().addAll(getOrganoUnidadBL().listar());
    }
    
    public void listarInstituciones(){
        getListaInstitucion().clear();
        getListaInstitucion().addAll(getInstitucionBL().listar());
    }
    
    public void registrar(){
        getOrganoUnidad().setInstitucion(getInstitucionBL().buscar(id_institucion));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getOrganoUnidadBL().registrar(getOrganoUnidad())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOrganoUnidad(new OrganoUnidad());
                    setId_institucion(0);
                    listarOrganosUnidad();
                }
            }
        });
    }    
    public void actualizar(){
        getOrganoUnidad().setInstitucion(getInstitucionBL().buscar(id_institucion));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getOrganoUnidadBL().actualizar(getOrganoUnidad())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOrganoUnidad(new OrganoUnidad());
                    setId_institucion(0);
                    listarOrganosUnidad();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getOrganoUnidadBL().eliminar(getOrganoUnidad())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setOrganoUnidad(new OrganoUnidad());
                    listarOrganosUnidad();
                }
            }
        });
    }
        
    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public OrganoUnidad getOrganoUnidad() {
        return organoUnidad;
    }

    public void setOrganoUnidad(OrganoUnidad organoUnidad) {
        this.organoUnidad = organoUnidad;
    }

    public OrganoUnidadBL getOrganoUnidadBL() {
        return organoUnidadBL;
    }

    public void setOrganoUnidadBL(OrganoUnidadBL organoUnidadBL) {
        this.organoUnidadBL = organoUnidadBL;
    }

    public List<OrganoUnidad> getListaOrganoUnidad() {
        return listaOrganoUnidad;
    }

    public void setListaOrganoUnidad(List<OrganoUnidad> listaOrganoUnidad) {
        this.listaOrganoUnidad = listaOrganoUnidad;
    }
     
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

    public List<Institucion> getListaInstitucion() {
        return listaInstitucion;
    }

    public void setListaInstitucion(List<Institucion> listaInstitucion) {
        this.listaInstitucion = listaInstitucion;
    }
    

    public long getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(long id_institucion) {
        this.id_institucion = id_institucion;
    }
    
    //</editor-fold>
}
