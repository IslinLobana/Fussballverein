package model;

public class Ticket extends Verkauf{

    boolean dauerkarte;
    String stadionplatz;



    public Ticket(boolean dauerkarte, String stadionplatz, double einkommen){
        super(einkommen);
        setDauerkarte(dauerkarte);
        setStadionplatz(stadionplatz);
    }

    public void setDauerkarte(boolean dauerkarte) {
        this.dauerkarte = dauerkarte;
    }

    public void setStadionplatz(String stadionplatz) {
        this.stadionplatz = stadionplatz;
    }
    public String getStadionplatz() {
        return stadionplatz;
    }
    

    
}
