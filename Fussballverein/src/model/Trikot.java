package model;

public class Trikot extends Person{

    int rueckennummer;
    String groesse;
    int preis;


    public Trikot(int rueckennummer, String groesse, int preis, String vorname, String nachname){
        super(vorname, nachname);
        setRueckennummer(rueckennummer);
        setGroesse(groesse);
        setPreis(preis);
    }

    public int getPreis() {
        return preis;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public void setRueckennummer(int rueckennummer) {
        this.rueckennummer = rueckennummer;
    }

    public String getGroesse() {
        return groesse;
    }

    public int getRueckennummer() {
        return rueckennummer;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    
}
