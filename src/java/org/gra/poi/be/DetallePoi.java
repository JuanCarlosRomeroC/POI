package org.gra.poi.be;

public class DetallePoi  implements java.io.Serializable {


     private long iddetallePoi;
     private OePei oePei;
     private Poi poi;

    public DetallePoi() {
    }

	
    public DetallePoi(long iddetallePoi) {
        this.iddetallePoi = iddetallePoi;
    }
    public DetallePoi(long iddetallePoi, OePei oePei, Poi poi) {
       this.iddetallePoi = iddetallePoi;
       this.oePei = oePei;
       this.poi = poi;
    }
   
    public long getIddetallePoi() {
        return this.iddetallePoi;
    }
    
    public void setIddetallePoi(long iddetallePoi) {
        this.iddetallePoi = iddetallePoi;
    }
    public OePei getOePei() {
        return this.oePei;
    }
    
    public void setOePei(OePei oePei) {
        this.oePei = oePei;
    }
    public Poi getPoi() {
        return this.poi;
    }
    
    public void setPoi(Poi poi) {
        this.poi = poi;
    }




}


