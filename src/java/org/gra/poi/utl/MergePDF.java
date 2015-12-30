package org.gra.poi.utl;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.*;
import java.util.*;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

public class MergePDF {
    public String file_path = "/resources/t/";

    public static void main(String[] args) {
        MergePDF mpdf = new MergePDF();
        File f = mpdf.concatPDFs(mpdf.getCurrentPath("tmp"), "ReporteFinal.pdf",
                                "rpt1.pdf", "rpt2.pdf", "rpt3.pdf", "rpt4.pdf");
        
        System.out.println(f.exists()?"CORRECTAMENTE GENERADO EN \""+f.getAbsolutePath()+"\"":"ERROR DE GENERACION");
    }

    public String getCurrentPath(String sdn){
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        File f = new File(getCurrentPath()+File.separator+sdn);
        if (!f.exists()) {
            f.mkdir();
        }
        return f.getAbsolutePath();
        //</editor-fold>
    }
    
    public String getCurrentPath() {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        String os = System.getProperty("os.name");
        String path = System.getProperty("user.dir");
        if (os.equals("linux")) {
            path += File.separator;
        } else { /*if(os.equals("windows"))*/

            if (path.length() > 3) {
                path += File.separator;
            }
        }
        return path;
        //</editor-fold>
    }
    
     public String getRealPath(String... fn) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext
                = (ServletContext) facesContext.getExternalContext().getContext();
        String realPath = servletContext.getRealPath("/");
        
        File f = new File(realPath + File.separator);
        if (!f.exists()) {
            f.mkdir();
        }

        f = new File(realPath + file_path + ((fn.length > 0) ? fn[0] : ""));
        return f.getAbsolutePath();
        //</editor-fold>
    }
    
    public File concatPDFs(String dir, String pdff, String... pdfs) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        try {
            File fi = new File(dir),
                    fo = new File(dir + File.separator + pdff);
            ArrayList<InputStream> lst = new ArrayList<>();
            FileInputStream fis;
            FileOutputStream fos;
            for (String pdf : pdfs) {
                fis = new FileInputStream(new File(fi.getAbsolutePath() + File.separator + pdf));
                lst.add(fis);

            }
            fos = new FileOutputStream(fo);
            concatPDFs(lst, fos, true);
            return fo.exists() ? fo : null;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
        //</editor-fold>
    }

    public void concatPDFs(ArrayList<InputStream> streamOfPDFFiles, OutputStream outputStream, boolean paginate) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        Document document = new Document();
        try {
            ArrayList<InputStream> pdfs = streamOfPDFFiles;
            ArrayList<PdfReader> readers = new ArrayList<>();
            //int totalPages = 0;
            Iterator<InputStream> iteratorPDFs = pdfs.iterator();

            while (iteratorPDFs.hasNext()) {
                InputStream pdf = iteratorPDFs.next();
                PdfReader pdfReader = new PdfReader(pdf);
                readers.add(pdfReader);
                //totalPages += pdfReader.getNumberOfPages();
            }

            PdfWriter writer = PdfWriter.getInstance(document, outputStream);

            document.open();
            PdfContentByte cb = writer.getDirectContent();

            PdfImportedPage page;
            //int currentPageNumber = 0;
            int pageOfCurrentReaderPDF = 0;
            Iterator<PdfReader> iteratorPDFReader = readers.iterator();

            while (iteratorPDFReader.hasNext()) {
                PdfReader pdfReader = iteratorPDFReader.next();

                while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages()) {

                    Rectangle rectangle = pdfReader.getPageSizeWithRotation(1);
                    document.setPageSize(rectangle);
                    document.newPage();

                    pageOfCurrentReaderPDF++;
                    //currentPageNumber++;
                    page = writer.getImportedPage(pdfReader,
                            pageOfCurrentReaderPDF);
                    switch (rectangle.getRotation()) {
                        case 0:
                            cb.addTemplate(page, 1f, 0, 0, 1f, 0, 0);
                            break;
                        case 90:
                            cb.addTemplate(page, 0, -1f, 1f, 0, 0, pdfReader
                                    .getPageSizeWithRotation(1).getHeight());
                            break;
                        case 180:
                            cb.addTemplate(page, -1f, 0, 0, -1f, 0, 0);
                            break;
                        case 270:
                            cb.addTemplate(page, 0, 1.0F, -1.0F, 0, pdfReader
                                    .getPageSizeWithRotation(1).getWidth(), 0);
                            break;
                        default:
                            break;
                    }
                    if (paginate) {
                        cb.beginText();
                        cb.getPdfDocument().getPageSize();
                        cb.endText();
                    }
                }
                pageOfCurrentReaderPDF = 0;
            }
            outputStream.flush();
            document.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        //</editor-fold>
    }
}
