package org.gra.poi.vc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.gra.poi.be.*;
import org.gra.poi.bl.*;
import org.gra.poi.utl.Accion;
import org.gra.poi.utl.Tarea;
import org.gra.poi.utl.Utilitario;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class DocumentosGestionVC implements Serializable {

    private final String file_path = "/resources/t/";
    private final String documento_gestion = "TASAS.pdf";
    private ArrayList<DocumentosGestionReferencial> listaArchivos = new ArrayList<>();
    private DocumentosGestionReferencial archivo;
    private int indice;
    
    @ManagedProperty(value = "#{documentosGestionReferencial}")
    private DocumentosGestionReferencial documentosGestionReferencial;    
    @ManagedProperty(value = "#{documentosGestionReferencialBL}")
    private DocumentosGestionReferencialBL documentosGestionReferencialBL;    
    private List<AccionEstrategica> listaDocumentosGestion = new LinkedList<>();

    
    public void init() {
        getListaArchivos().clear();
        getListaArchivos().addAll(getDocumentosGestionReferencialBL().listar());
    }
    
    public void recuperarDocumentoGestion(long id_documento){
        setDocumentosGestionReferencial(getDocumentosGestionReferencialBL().buscar(id_documento));
    }
    
    public void registrar(){
        Utilitario.setTareaEvento(new Tarea(Accion.REGISTRO, getDocumentosGestionReferencialBL().registrar(getDocumentosGestionReferencial())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setDocumentosGestionReferencial(new DocumentosGestionReferencial());
                    //setId_subgrupo(0);
                    //listarActividadesOperativas();
                }
            }
        });
    }
    public void actualizar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ACTUALIZACION, getDocumentosGestionReferencialBL().actualizar(getDocumentosGestionReferencial())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setDocumentosGestionReferencial(new DocumentosGestionReferencial());
                    //setId_subgrupo(0);
                    //listarActividadesOperativas();
                }
            }
        });
    }
    public void eliminar(){
        Utilitario.setTareaEvento(new Tarea(Accion.ELIMINACION, getDocumentosGestionReferencialBL().eliminar(getDocumentosGestionReferencial())) {
            @Override
            public void procesoPost() {
                if (getRepuesta() >= 0) {
                    setDocumentosGestionReferencial(new DocumentosGestionReferencial());
                    //setId_subgrupo(0);
                    //listarActividadesOperativas();
                }
            }
        });
    }
    
    public String pathFile(){
        File f = new File(getRealPath(documento_gestion));
        if (f.exists()) {
            return "?file=.."+file_path+documento_gestion;
        } else {
            return "";
        }
    }

    public void subirArchivo(FileUploadEvent event) throws IOException {
        UploadedFile fu = event.getFile();        
        File f = writeUploadFile(documento_gestion, fu.getContents());
        archivo = new DocumentosGestionReferencial();
        archivo.setNombre(documento_gestion);
        archivo.setTamanio(f.length());
        archivo.setMime(fu.getContentType());
        archivo.setExtencion("pdf");
        getListaArchivos().add(archivo);
    }

    public File writeUploadFile(String fn, byte[] d) throws IOException {
        File f = new File(getRealPath());
        if (!f.exists()) {
            f.mkdir();
        }
        String realPath = f.getAbsolutePath();
        f = new File(realPath + File.separator + fn);
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(d);
        fos.close();

        return f;
    }

    public void deleteFile() {
        File f = new File(getRealPath(documento_gestion));
        f.delete();
        getListaArchivos().clear();
    }
    public String getRealPath(String ...fn) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String realPath = servletContext.getRealPath("/");
        File f = new File(realPath + file_path + ((fn.length > 0)?fn[0]:""));
        return f.getAbsolutePath();
    }
    
    public String formatLength(long sz) {
        return Utilitario.getLengthPreformat(sz);
    }
    
    //<editor-fold defaultstate="collapsed" desc="GET y SET">
    public ArrayList<DocumentosGestionReferencial> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<DocumentosGestionReferencial> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public DocumentosGestionReferencial getDocumentosGestionReferencial() {
        return documentosGestionReferencial;
    }

    public void setDocumentosGestionReferencial(DocumentosGestionReferencial documentosGestionReferencial) {
        this.documentosGestionReferencial = documentosGestionReferencial;
    }

    public DocumentosGestionReferencialBL getDocumentosGestionReferencialBL() {
        return documentosGestionReferencialBL;
    }

    public void setDocumentosGestionReferencialBL(DocumentosGestionReferencialBL documentosGestionReferencialBL) {
        this.documentosGestionReferencialBL = documentosGestionReferencialBL;
    }

    public List<AccionEstrategica> getListaDocumentosGestion() {
        return listaDocumentosGestion;
    }

    public void setListaDocumentosGestion(List<AccionEstrategica> listaDocumentosGestion) {
        this.listaDocumentosGestion = listaDocumentosGestion;
    }
    //</editor-fold>
}
