package controller;
import java.util.*;
import model.Spieler;

public class SpielerController {

    MainController mc; 
    ArrayList<Spieler> spielerar;

    public SpielerController(MainController mc){
        setMc(mc);
        spielerar = new ArrayList<Spieler>();
    }


    public void createSpielerar(){
        getSpielerar().add(new Spieler(20, 100000, "Jini", "Wienaldüm", "Mittelfeld" true, "PSG" ));
    }

    public void setSpielerar(ArrayList<Spieler> spielerar) {
        this.spielerar = spielerar;
    }

    public ArrayList<Spieler> getSpielerar() {
        return spielerar;
    }


    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

    
    
}
