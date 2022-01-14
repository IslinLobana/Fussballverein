package controller;

import model.Liga;

public class LigaController {
    
    MainController mc;

    public LigaController(MainController mc){
        setMc(mc);
    }



    public void createDemoLiga(){
        Liga l = new Liga(18, "LaLiga Santander", "Spaninen");
    
    }



    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
}
