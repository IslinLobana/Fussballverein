package model;

public class Spieler extends Person{
    
    boolean startelf;
    String verein;
    String position;
    int alter;
    int gehalt;


    public Spieler(String vorname, String nachname, int alter, String verein, boolean startelf, int gehalt){
      super(vorname, nachname);
      setAlter(alter);
      setGehalt(gehalt);
      setPosition(position);
      setStartelf(startelf);
      setVerein(verein);
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
    
}
