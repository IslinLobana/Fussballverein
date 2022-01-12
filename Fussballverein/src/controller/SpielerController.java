package controller;
import java.util.*;
import model.Spieler;

public class SpielerController {

    MainController mc; 
    ArrayList<Spieler> spielerar;

    public SpielerController(MainController mc){
        setMc(mc);
        Spielerar = new ArrayList<Spieler>();
    }


    public void createSpielerar(){
        getSpielerar().add(new Spieler(20, 100000, "Jini","Wienaldüm" ));
    }

    public void setSpielerar(ArrayList<Spieler> Spielerar) {
        this.Spielerar = Spielerar;
    }

    public ArrayList<Spieler> getSpielerar() {
        return Spielerar;
    }


    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

    
    
}
