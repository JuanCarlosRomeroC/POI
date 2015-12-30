package org.gra.poi.utl;

import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.JRViewer;

public class ReportGeneric {

    private String reportParent;
    private Connection connection;

    public JPanel mkReport(String nomRef) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(getReportParent() + nomRef + ".jasper"));
            connection = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, (Map) new HashMap(), connection);
            connection.close();
            if (jasperPrint.getPages().size() > 0) {
                JRViewer v = new JRViewer(jasperPrint);
                JRSaveContributor[] sc = v.getSaveContributors();
                for (JRSaveContributor c : sc) {
                    if (!(c.getClass().getSimpleName().toLowerCase().contains("pdf")
                            || c.getClass().getSimpleName().toLowerCase().contains("docx"))) {
                        v.removeSaveContributor(c);
                    }
                }
                return v;
            } else {
                return null;
            }
        } catch (Exception ex) {
            try {
                connection.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex1);
                return null;
            }
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JPanel mkReport(String nomRef, Map prmt) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(getReportParent() + nomRef + ".jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, prmt, connection);
            connection.close();
            JRViewer v = new JRViewer(jasperPrint);
            JRSaveContributor[] sc = v.getSaveContributors();
            for (JRSaveContributor c : sc) {
                if (!(c.getClass().getSimpleName().toLowerCase().contains("pdf")
                        || c.getClass().getSimpleName().toLowerCase().contains("docx"))) {
                    v.removeSaveContributor(c);
                }
            }
            return v;
        } catch (Exception ex) {
            try {
                connection.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex1);
                return null;
            }
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JInternalFrame mkReportToInternalFrame(String report_name, String frame_title) {
        JInternalFrame reportFrame = null;
        try {
            JPanel report_panel = mkReport(report_name);
            if (report_panel != null) {
                reportFrame = new JInternalFrame();
                reportFrame.setClosable(true);
                reportFrame.setResizable(true);
                reportFrame.setIconifiable(true);
                reportFrame.setMaximizable(true);
                reportFrame.getContentPane().add(report_panel);
                reportFrame.setTitle(frame_title);
                reportFrame.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentShown(ComponentEvent e) {
                        try {
                            JInternalFrame tmp = (JInternalFrame) e.getComponent();
                            tmp.setMaximum(true);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        } catch (Exception ex) {
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportFrame;
    }

    public JInternalFrame mkReportToInternalFrame(String report_name, String[] keys, Object[] values, String frame_title) {
        JInternalFrame reportFrame = null;
        try {
            JPanel report_panel = mkReport(report_name, keys, values);
            if (report_panel != null) {
                reportFrame = new JInternalFrame();
                reportFrame.setClosable(true);
                reportFrame.setIconifiable(true);
                reportFrame.setResizable(true);
                reportFrame.setMaximizable(true);
                reportFrame.getContentPane().add(report_panel);
                reportFrame.setTitle(frame_title);
                reportFrame.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentShown(ComponentEvent e) {
                        try {
                            JInternalFrame tmp = (JInternalFrame) e.getComponent();
                            tmp.setMaximum(true);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }else{
                JOptionPane.showMessageDialog(null,"NINGUNA PAGINA QUE MOSTRAR", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            }
            return reportFrame;
        } catch (Exception ex) {
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JDialog mkReportToDialog(String report_name, String frame_title, Frame parent) {
        JDialog reportFrame = null;
        JPanel report_panel = mkReport(report_name);
        if (report_panel != null) {
            reportFrame = new JDialog(parent, true);
            reportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.setSize(800, 600);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    JDialog tmp = (JDialog) e.getComponent();
                    //Utilitarios.maximizar(tmp);
                    tmp.setLocationRelativeTo(null);
                }
            });
            reportFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JDialog tmp = (JDialog) e.getComponent();
                    tmp.dispose();
                }
            });
        }
        return reportFrame;
    }

    public JDialog mkReportToDialog(String report_name, String[] keys, Object[] values, String frame_title, Frame parent) {
        JDialog reportFrame = null;
        JPanel report_panel = mkReport(report_name, keys, values);
        if (report_panel != null) {
            reportFrame = new JDialog(parent, true);
            reportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.setSize(800, 600);
            reportFrame.setModal(true);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    JDialog tmp = (JDialog) e.getComponent();
                    //Utilitarios.maximizar(tmp);
                    tmp.setLocationRelativeTo(null);
                }
            });
            reportFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JDialog tmp = (JDialog) e.getComponent();
                    tmp.dispose();
                }
            });
        }
        return reportFrame;
    }

    public JFrame mkReportToFrame(String report_name, String frame_title) {
        JFrame reportFrame = null;
        JPanel report_panel = mkReport(report_name);
        if (report_panel != null) {
            reportFrame = new JFrame();
            reportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.setSize(800, 600);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    //Utilitarios.maximizar(tmp);
                    tmp.setLocationRelativeTo(null);
                }
            });
            reportFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    tmp.dispose();
                }
            });
        }
        return reportFrame;
    }

    public JFrame mkReportToFrame(String report_name, String[] keys, Object[] values, String frame_title) {
        JFrame reportFrame = null;
        JPanel report_panel = mkReport(report_name, keys, values);
        if (report_panel != null) {
            reportFrame = new JFrame();
            reportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.setSize(800, 600);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    //Utilitarios.maximizar(tmp);
                    tmp.setLocationRelativeTo(null);
                }
            });
            reportFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    tmp.dispose();
                }
            });
        }
        return reportFrame;
    }

    public JPanel mkReport(String nomRef, String[] keys, Object[] values) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(getReportParent() + nomRef + ".jasper"));
            Map paramet = new HashMap();
            if (keys != null && values != null && keys.length == values.length) {
                for (int i = 0; i < values.length; i++) {
                    paramet.put(keys[i], values[i]);
                }
            } else {
                throw new Exception("Parametros Invalidos(Llaves y Valores cantidades diferentes) o Nulos");
            }
            connection = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramet, connection);
            connection.close();
            if (jasperPrint.getPages().size() > 0) {
                JRViewer v = new JRViewer(jasperPrint);
                
                JRSaveContributor[] sc = v.getSaveContributors();
                for (JRSaveContributor c : sc) {
                    if (!(c.getClass().getSimpleName().toLowerCase().contains("pdf")
                       || c.getClass().getSimpleName().toLowerCase().contains("docx"))) {
                        v.removeSaveContributor(c);
                    }
                }
                return v;
            } else {
                return null;
            }
        } catch (Exception ex) {
            try {
                connection.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex1);
                return null;
            }
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JasperPrint mkReportJasperPrint(String nomRef, String[] keys, Object[] values) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(getReportParent() + nomRef + ".jasper"));
            Map paramet = new HashMap();
            if (keys != null && values != null && keys.length == values.length) {
                for (int i = 0; i < values.length; i++) {
                    paramet.put(keys[i], values[i]);
                }
            } else {
                throw new Exception("Parametros Invalidos(Llaves y Valores cantidades diferentes) o Nulos");
            }
            connection = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramet, connection);
            connection.close();
            return jasperPrint;
        } catch (Exception ex) {
            try {
                connection.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex1);
                return null;
            }
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public JasperPrint mkReportJasperPrint(String report_name, String[] keys, Object[] values, String frame_title) {
        JasperPrint report_JasperPrint = null;
        try {
            report_JasperPrint = mkReportJasperPrint(report_name, keys, values);
        } catch (Exception ex) {
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
        }
        return report_JasperPrint;
    }

    public JasperPrint concatReport(JasperPrint pre, JasperPrint nw) {
        if (pre != null && nw != null) {
            List<JRPrintPage> pgs = nw.getPages();
            for (JRPrintPage jRPrintPage : pgs) {
                pre.addPage(jRPrintPage);
            }
        }
        return pre;
    }

    public JFrame mkReportToFrame(JasperPrint jp, String frame_title) {
        JFrame reportFrame = null;
        try {
            JRViewer report_panel = new JRViewer(jp);
            JRSaveContributor[] sc = report_panel.getSaveContributors();
            for (JRSaveContributor c : sc) {
                if (!(c.getClass().getSimpleName().toLowerCase().contains("pdf")
                        || c.getClass().getSimpleName().toLowerCase().contains("docx"))) {
                    report_panel.removeSaveContributor(c);
                }
            }
            reportFrame = new JFrame();
            //Utilitarios.setIconoVentana(reportFrame,"/org/rx/cr/resource/report.png");
            reportFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.setSize(800, 600);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    //Utilitarios.maximizar(tmp);
                    tmp.setLocationRelativeTo(null);
                }
            });
            reportFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    JFrame tmp = (JFrame) e.getComponent();
                    tmp.dispose();
                }
            });

        } catch (Exception ex) {
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportFrame;
    }

    public JInternalFrame mkReportToInternalFrame(JasperPrint jp, String frame_title) {
        JInternalFrame reportFrame = null;
        try {
            JRViewer report_panel = new JRViewer(jp);
            JRSaveContributor[] sc = report_panel.getSaveContributors();
            for (JRSaveContributor c : sc) {
                if (!(c.getClass().getSimpleName().toLowerCase().contains("pdf")
                        || c.getClass().getSimpleName().toLowerCase().contains("docx"))) {
                    report_panel.removeSaveContributor(c);
                }
            }
            reportFrame = new JInternalFrame();
            //Utilitarios.setIconoVentana(reportFrame,"/org/rx/cr/resource/report.png");
            reportFrame.setClosable(true);
            reportFrame.setIconifiable(true);
            reportFrame.setResizable(true);
            reportFrame.setMaximizable(true);
            reportFrame.getContentPane().add(report_panel);
            reportFrame.setTitle(frame_title);
            reportFrame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    try {
                        JInternalFrame tmp = (JInternalFrame) e.getComponent();
                        tmp.setMaximum(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

        } catch (Exception ex) {
            Logger.getLogger(ReportGeneric.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportFrame;
    }

    public String getReportParent() {
        return reportParent;
    }

    public void setReportParent(String reportParent) {
        this.reportParent = reportParent;
    }
}
