package controller;
import java.util.*;
import model.*;

public class SponsorenController {

    MainController mc; 
    ArrayList<Sponsoren> sponsorenar;

    public SponsorenController(MainController mc){
        setMc(mc);
        sponsorenar = new ArrayList<Sponsoren>();
    }


    public void createSponsorenar(){
        getSponsorenar().add(new Sponsoren("Müller", 3.5, 100000000));
        getSponsorenar().add(new Sponsoren("Alfatauri Fashion", 4, 70000000));
    }



    public void getEinkommen(){
        int gesamtBudget = 0;
        for(Sponsoren spo : getMc().getSpc().getSponsorenar()){
            gesamtBudget += spo.getEinkommen();
        }
        for(Ticket ti : getMc().getTc().getTicketar()){
            gesamtBudget += ti.getEinkommen();
        }
        getMc().getOutput().printData("Budget ");
        getMc().getOutput().printDataInt(gesamtBudget);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setSponsorenar(ArrayList<Sponsoren> sponsorenar) {
        this.sponsorenar = sponsorenar;
    }

    public MainController getMc() {
        return mc;
    }
    public ArrayList<Sponsoren> getSponsorenar() {
        return sponsorenar;
    }

    public void printSponsoren(){
        for(Sponsoren sponsor: getSponsorenar()){
            getMc().getOutput().printData(sponsor.getFirmenname());
        } 
    }


    public void printData(int einkommen) {
    }

    
}

