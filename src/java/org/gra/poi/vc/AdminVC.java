package org.gra.poi.vc;

import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.gra.poi.bl.*;
import org.gra.poi.be.*;

@ManagedBean
@ViewScoped
public class AdminVC implements Serializable {
    //<editor-fold defaultstate="collapsed" desc="DECLARACION DE OBJETOS INYECTABLES">
    @ManagedProperty(value = "#{usuario}")
    private Usuario usuario;
    @ManagedProperty(value = "#{usuarioBL}")
    private UsuarioBL usuarioBL;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FUNCION DE EJECUCION CULMINADA LA INYECCION DE DEPENDECIA">
    @PostConstruct
    public void init() {

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONTROL ACCESO PAGINA">
    public String initAdmin() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession s = (HttpSession) context.getExternalContext().getSession(true);
        if (s.getAttribute("cuentaid") != null && s.getAttribute("personaid") != null && s.getAttribute("rol") != null) {
            return "";
        } else {
            return "/login.xhtml?faces-redirect=true";
        }
    }
    public String rol(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession s = (HttpSession) context.getExternalContext().getSession(true);
        return s.getAttribute("rol")!=null?s.getAttribute("rol").toString():null;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONTROL SESSION">   
    public String logout() {        
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession s = (HttpSession) context.getExternalContext().getSession(true);
        s.setAttribute("cuentaid", null);
        s.setAttribute("personaid", null);
        s.setAttribute("rol", null);
        setUsuario(new Usuario());
        
        return "/login.xhtml?faces-redirect=true";
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="GET'S & SET'S">
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioBL getUsuarioBL() {
        return usuarioBL;
    }

    public void setUsuarioBL(UsuarioBL usuarioBL) {
        this.usuarioBL = usuarioBL;
    }    
    //</editor-fold>
}
