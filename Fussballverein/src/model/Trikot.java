package model;

public class Trikot extends Person{

    int rueckennummer;
    String groesse;


    public Trikot(int rueckennummer, String groesse, String vorname, String nachname){
        super(vorname, nachname);
        setRueckennummer(rueckennummer);
        setGroesse(groesse);
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

    
}
