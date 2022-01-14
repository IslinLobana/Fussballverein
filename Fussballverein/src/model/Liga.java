package model;

public class Liga {
    
    int anzahlVerein;
    int platzierung;
    String name;
    String land;


    public Liga(int anzahlVerein, String name, String land){
        setAnzahlVerein(anzahlVerein);
        setLand(land);
        setName(name);
    }



    public void setAnzahlVerein(int anzahlVerein) {
        this.anzahlVerein = anzahlVerein;
    }
    public void setLand(String land) {
        this.land = land;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAnzahlVerein() {
        return anzahlVerein;
    }
    public String getLand() {
        return land;
    }
    public String getName() {
        return name;
    }
   

}
