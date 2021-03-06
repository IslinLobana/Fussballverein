package controller;
import java.util.*;
import model.Trikot;

public class TrikotController {

    MainController mc; 
    ArrayList<Trikot> trikotar;

    public TrikotController(MainController mc){
        setMc(mc);
        trikotar = new ArrayList<Trikot>();
    }


    public void createTrikotar(){
        getTrikotar().add(new Trikot(9, "XXL", 70, "Sonny", "Kittel" ));
    }





    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setTrikotar(ArrayList<Trikot> trikotar) {
        this.trikotar = trikotar;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Trikot> getTrikotar() {
        return trikotar;
    }

    public void printTrikot(){
        for(Trikot trikot: getTrikotar()){
            getMc().getOutput().printData(trikot.getNachname() + " " + trikot.getVorname() + " " + trikot.getGroesse() + " " + trikot.getRueckennummer());


        }

    }
}    
