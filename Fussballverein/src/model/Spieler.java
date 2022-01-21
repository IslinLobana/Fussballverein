package model;

public class Spieler extends Person{
    
    boolean startelf;
    String verein;
    String position;
    int alter;
    int gehalt;
    int preis;
   


    public Spieler(int alter, int gehalt, String vorname, String nachname, String position, boolean startelf, String verein, int preis){
      super(vorname, nachname);
      setAlter(alter);
      setGehalt(gehalt);
      setPosition(position);
      setStartelf(startelf);
      setVerein(verein);
      setPreis(preis);
    }




    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setStartelf(boolean startelf) {
        this.startelf = startelf;
    }
    public void setVerein(String verein) {
        this.verein = verein;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }
    
    public int getAlter() {
        return alter;
    }
    public int getGehalt() {
        return gehalt;
    }
    public String getPosition() {
        return position;
    }
    public String getVerein() {
        return verein;
    }
    public boolean getStartelf() {
        return startelf;
    }
    public int getPreis() {
        return preis;
    }
    
}
