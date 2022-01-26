package controller;

import model.Stadion;

public class StadionController {
    
    MainController mc;
    Stadion st;


    public StadionController(MainController mc){
        setMc(mc);
    }


    public void createDemoStadion(){
        setSt(new Stadion(true, 0, 50000, "Bernabeu"));
    }


    public void setSt(Stadion st) {
        this.st = st;
    } 

    public void setMc(MainController mc) {
        this.mc = mc;
    }

    public Stadion getSt() {
        return st;
    }
    public MainController getMc() {
        return mc;
    }

    public void printStadion(){
        getMc().getOutput().printData(getSt().getName() + " " + getSt().getAnzahlSitzeFrei() + " " + getSt().getAnzahlSitzeGesamt());
    }

    
    
}
