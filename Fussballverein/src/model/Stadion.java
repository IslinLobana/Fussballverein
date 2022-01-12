package model;


public class Stadion {
    
    boolean voll;
    int anzahlSitzeGesamt;
    int anzahlSitzeFrei;
    String name;

    public Stadion(boolean voll, int anzahlSitzeFrei, int anzahlSitzeGesamt, String name){
        setAnzahlSitzeFrei(anzahlSitzeFrei);
        setAnzahlSitzeGesamt(anzahlSitzeGesamt);
        setName(name);
        setVoll(voll);
    }    


    public void setAnzahlSitzeFrei(int anzahlSitzeFrei) {
        this.anzahlSitzeFrei = anzahlSitzeFrei;
    }
    public void setAnzahlSitzeGesamt(int anzahlSitzeGesamt) {
        this.anzahlSitzeGesamt = anzahlSitzeGesamt;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVoll(boolean voll) {
        this.voll = voll;
    }

    
    public int getAnzahlSitzeFrei() {
        return anzahlSitzeFrei;
    }
    public int getAnzahlSitzeGesamt() {
        return anzahlSitzeGesamt;
    }
    public String getName() {
        return name;
    }
    
}
