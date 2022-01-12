package model;

public class Sponsoren extends Verkauf{

    String firmenname;
    double laufzeit;



    public Sponsoren(String firmenname, double laufzeit, double einkommen){
    super(einkommen);
    setFirmenname(firmenname);
    setLaufzeit(laufzeit);
    }


    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public void setLaufzeit(double laufzeit) {
        this.laufzeit = laufzeit;
    }
    public String getFirmenname() {
        return firmenname;
    }
    public double getLaufzeit() {
        return laufzeit;
    }

    
}
