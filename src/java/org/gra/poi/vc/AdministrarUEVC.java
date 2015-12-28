package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;

@ManagedBean
@ViewScoped
public class AdministrarUEVC {
    
    @ManagedProperty(value = "#{organoUnidad}")
    private OrganoUnidad organoUnidad;
    
    @ManagedProperty(value = "#{organoUnidadBL}")
    private OrganoUnidadBL organoUnidadBL;
    
    private List<OrganoUnidad> listaOrganoUnidad = new LinkedList<>();

    public void init(){
        getListaOrganoUnidad().addAll(getOrganoUnidadBL().listar());
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
    //</editor-fold>   
}
