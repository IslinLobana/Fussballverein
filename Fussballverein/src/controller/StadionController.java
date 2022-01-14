package controller;

import model.Stadion;

public class StadionController {
    
    MainController mc;


    public StadionController(MainController mc){
        setMc(mc);
    }


    public void createDemoStadion(){
        Stadion st = new Stadion(true, 0, 50000, "Bernabeu");
    }




    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
}
