package org.gra.poi.vc;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.*;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;

@ManagedBean
@ViewScoped
public class AdministrarOEVC {
    
    @ManagedProperty(value = "#{oePei}")
    private OePei oePei;
    
    @ManagedProperty(value = "#{oePeiBL}")
    private OePeiBL oePeiBL;
    
    private List<OePei> listaOePei = new LinkedList<>();

    public void init(){
        getListaOePei().addAll(getOePeiBL().listar());
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public List<OePei> getListaOePei() {
        return listaOePei;
    }

    public void setListaOePei(List<OePei> listaOePei) {
        this.listaOePei = listaOePei;
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
    //</editor-fold>
}
