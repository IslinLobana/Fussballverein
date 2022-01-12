package model;

public class Fans extends Person{

    String eigenschaften;



    public Fans(String eigenschaften, String vorname, String nachname){
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
