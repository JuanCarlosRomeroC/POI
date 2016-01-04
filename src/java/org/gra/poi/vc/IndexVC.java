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
public class IndexVC implements Serializable {
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

    //<editor-fold defaultstate="collapsed" desc="CONTROL SESSION">
    public String login() {
        Usuario t = getUsuarioBL().autenticar(getUsuario().getNombre(), getUsuario().getClave());
        FacesContext context = FacesContext.getCurrentInstance();
        if (t != null) {
            HttpSession s = (HttpSession) context.getExternalContext().getSession(true);
            s.setAttribute("cuentaid", t.getIdusuario());
            s.setAttribute("personaid", t.getEmpleado().getIdempleado());
            s.setAttribute("rol", t.getTipoUsuario());
            //setUsuario(t);
            return "/page/admin.xhtml?jsessionid=" + s.getId() + "&faces-redirect=true";
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "ATENCION", "CREDENCIALES INCORECTAS"));
            HttpSession s = (HttpSession) context.getExternalContext().getSession(true);
            s.setAttribute("cuentaid", null);
            s.setAttribute("personaid", null);
            s.setAttribute("rol", null);
            setUsuario(new Usuario());
            return "";
        }
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
