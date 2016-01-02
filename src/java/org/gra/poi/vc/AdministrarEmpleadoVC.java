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
public class AdministrarEmpleadoVC {
    @ManagedProperty(value = "#{empleado}")
    private Empleado empleado;    
    @ManagedProperty(value = "#{empleadoBL}")
    private EmpleadoBL empleadoBL;    
    private List<Empleado> listaEmpleado = new LinkedList<>();
    
    @ManagedProperty(value = "#{organoUnidad}")
    private OrganoUnidad organoUnidad;    
    @ManagedProperty(value = "#{organoUnidadBL}")
    private OrganoUnidadBL organoUnidadBL;    
    private List<OrganoUnidad> listaOrganoUnidad = new LinkedList<>();
    private long id_organoUnidad;

    public void init(){
        listarEmpleados();
        listarOrganosUnidad();        
    }
    
    public void listarEmpleados(){
        getListaEmpleado().clear();
        getListaEmpleado().addAll(getEmpleadoBL().listar());
    }
    
    public void listarOrganosUnidad(){
        getListaOrganoUnidad().clear();
        getListaOrganoUnidad().addAll(getOrganoUnidadBL().listar());
    }       
    
    public void recuperarEmpleado(long id){
        setEmpleado(getEmpleadoBL().buscar(id));
        setId_organoUnidad(getEmpleado().getOrganoUnidad().getIdorgano());
    }
    
    public void registrar(){
        getEmpleado().setOrganoUnidad(getOrganoUnidadBL().buscar(id_organoUnidad));
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getEmpleadoBL().registrar(getEmpleado())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setEmpleado(new Empleado());
                    setId_organoUnidad(0);
                    listarEmpleados();
                }
            }
        });
    }    
    public void actualizar(){
        getEmpleado().setOrganoUnidad(getOrganoUnidadBL().buscar(id_organoUnidad));
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getEmpleadoBL().actualizar(getEmpleado())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setEmpleado(new Empleado());
                    setId_organoUnidad(0);
                    listarEmpleados();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getEmpleadoBL().eliminar(getEmpleado())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setEmpleado(new Empleado());
                    listarEmpleados();
                }
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public EmpleadoBL getEmpleadoBL() {
        return empleadoBL;
    }

    public void setEmpleadoBL(EmpleadoBL empleadoBL) {
        this.empleadoBL = empleadoBL;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

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

    public long getId_organoUnidad() {
        return id_organoUnidad;
    }

    public void setId_organoUnidad(long id_organoUnidad) {
        this.id_organoUnidad = id_organoUnidad;
    }
    //</editor-fold>
}
