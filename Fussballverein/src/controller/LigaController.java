package controller;

import model.Liga;

public class LigaController {
    
    MainController mc;
    Liga Lc;

    public LigaController(MainController mc){
        setMc(mc);
    }



    public void createDemoLiga(){
        setLc(new Liga(18, "LaLiga Santander", "Spaninen"));
    }

    

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setLc(Liga lc) {
        this.Lc = lc;
    }

    public MainController getMc() {
        return mc;
    }
    public Liga getLc() {
        return Lc;
    }

    public void printData(){
        getMc().getOutput().printData(Lc.getLand() + " " + Lc.getAnzahlVerein() + " " + Lc.getName());
    }
}
