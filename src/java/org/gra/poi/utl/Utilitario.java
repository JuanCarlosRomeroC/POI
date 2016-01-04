package org.gra.poi.utl;

import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utilitario {
    public static String[] Meses_Anio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
    
    public static Tarea setTareaEvento(Tarea a) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        FacesContext context = FacesContext.getCurrentInstance(); 
        if(a.getRepuesta()>=0){            
            a.procesoPost();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"ATENCION",a.getAccion()+" CORRECTO"));  
        }else{
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"ATENCION","ERROR DE "+a.getAccion()));           
        }
        return a;
        //</editor-fold>
    }
    
    public  static String customDate1(Date d) {// 00/00/0000
        return numberFormat(d.getDate(), "00") + "/" + numberFormat((d.getMonth() + 1), "00") + "/" + (d.getYear() + 1900);
    }

    public  static String customDate2(Date d) {// 00 de Mes del 0000
        return numberFormat(d.getDate(), "00") + " de " + Meses_Anio[d.getMonth()] + " del " + (d.getYear() + 1900);
    }
    
    public static String numberFormat(double src, String fmt) {
        DecimalFormat df = new DecimalFormat(fmt);
        return df.format(src);
    }

    public static String numberFormat(long src, String fmt) {
        DecimalFormat df = new DecimalFormat(fmt);
        return df.format(src);
    }
    
    public static String getLengthPreformat(long sz) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">     
        if (sz >= 1024L && sz < Math.pow(1024, 2)) {
            return numberFormat(getLengthKB(sz), "#.##") + " Kb";
        } else if (sz >= Math.pow(1024, 2) && sz < Math.pow(1024, 3)) {
            return numberFormat(getLengthMB(sz), "#.##") + " Mb";
        } else if (sz >= Math.pow(1024, 3) && sz < Math.pow(1024, 4)) {
            return numberFormat(getLengthGB(sz), "#.##") + " Gb";
        } else if (sz >= Math.pow(1024, 4) && sz < Math.pow(1024, 5)) {
            return numberFormat(getLengthTB(sz), "#.##") + " Tb";
        } else if (sz > 0 && sz < 1024L) {
            return numberFormat(sz, "#.##") + " b";
        } else {
            return "0,00 b";
        }
        //</editor-fold>
    }
    
    private static double getLengthKB(long sz) {
        return (sz / 1024.0);
    }

    private static double getLengthMB(long sz) {
        return (getLengthKB(sz) / 1024.0);
    }

    private static double getLengthGB(long sz) {
        return (getLengthMB(sz) / 1024.0);
    }

    private static double getLengthTB(long sz) {
        return (getLengthGB(sz) / 1024.0);
    }
    
    public static String md5(String str) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        String output = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] codigo = md.digest();
            for (int i = 0; i < codigo.length; i++) {
                output += Integer.toHexString((codigo[i] >> 4) & 0xf);
                output += Integer.toHexString(codigo[i] & 0xf);
            }
        } catch (Exception ex) {}
        return output.toLowerCase();
        //</editor-fold>
    }
}
