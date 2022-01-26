package controller;
import java.util.*;
import model.Fans;


public class FansController {

    MainController mc;
    ArrayList<Fans> fansar;

    public FansController(MainController mc){
        setMc(mc);
        fansar = new ArrayList<Fans>();
    }

    public void createFansar(){
        getFansar().add(new Fans("Horst", "Hrubesch", "Hardcorefan"));

    }

    public void setFansar(ArrayList<Fans> fansar) {
        this.fansar = fansar;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Fans> getFansar() {
        return fansar;
    }
    public MainController getMc() {
        return mc;
    }

    public void printFans() {
        for(Fans fan: getFansar()){
            getMc().getOutput().printData(fan.getVorname() + " " + fan.getNachname() + " " + fan.getEigenschaften());
        } 
    }
}
