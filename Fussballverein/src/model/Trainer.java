package model;

public class Trainer extends Person{

    String verein;
    int alter;




    public Trainer(String vorname, String nachname, String verein, int alter){
        super(vorname, nachname);
        setAlter(alter);
        setVerein(verein);
    }
    




    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setVerein(String verein) {
        this.verein = verein;
    }

    public int getAlter() {
        return alter;
    }
    public String getVerein() {
        return verein;
    }
}
