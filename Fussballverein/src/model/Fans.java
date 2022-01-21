package model;

public class Fans extends Person{

    String eigenschaften;



    public Fans(String vorname, String nachname, String eigenschaften){
        super(vorname, nachname);
        setEigenschaften(eigenschaften);


    }


    public void setEigenschaften(String eigenschaften) {
        this.eigenschaften = eigenschaften;
    }

    public String getEigenschaften() {
        return eigenschaften;
    }

    
}
