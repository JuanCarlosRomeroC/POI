package org.gra.poi.vc;

import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import org.gra.poi.utl.ReportViewerBean;

@ManagedBean
@ViewScoped
public class DocumentoGestionViewerVC extends ReportViewerBean implements Serializable {
        
    @PostConstruct
    public void init() {}
    
    public void initPDF() {
        file_path = "/resources/t/";
        rsc_report_path = "/org/gra/poi/rpt/";        
        //extractResource("rpt", "sub_report");
        generarReporte("rpt", "sub_report");
        
    }

    //<editor-fold defaultstate="collapsed" desc="GET'S & SET'S">
   
    //</editor-fold>
}
