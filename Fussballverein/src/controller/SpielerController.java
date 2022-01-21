package controller;
import java.util.*;
import model.Spieler;

public class SpielerController {

    MainController mc; 
    ArrayList<Spieler> spielerar;
    ArrayList<Spieler> spielerimclub;

    public SpielerController(MainController mc){
        setMc(mc);
        spielerar = new ArrayList<Spieler>();
        spielerimclub = new ArrayList<Spieler>();
    }


    public void createSpielerar(){
        getSpielerar().add(new Spieler(20, 100000, "Jini", "Wienaldüm", "Mittelfeld", true, "PSG", 50000000));
    }

    public void createspielerimclub(){
        getSpielerimclub().add(new Spieler(19, 200000, "Karim", "Benzenmar", "Stürmer", true, "Real Betis", 25000000));
    }
 

    public void setSpielerimclub(ArrayList<Spieler> spielerimclub){
        this.spielerimclub = spielerimclub;
    }

    public ArrayList<Spieler> getSpielerimclub() {
        return spielerimclub;
    }

    public void setSpielerar(ArrayList<Spieler> spielerar) {
        this.spielerar = spielerar;
    }

    public ArrayList<Spieler> getSpielerar() {
        return spielerar;
    }

    
    public void getGehaelter(){
        int gesamtGehaelter = 0;
        for(Spieler sp : getSpielerar()){
            gesamtGehaelter += sp.getGehalt();
        }
        System.out.println(gesamtGehaelter);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

    public void printGruppen() {
        for(Spieler spieler: getSpielerar()){
            getMc().getOutput().printData(spieler.getVorname() + " " + spieler.getNachname() + " " + spieler.getAlter() + " " + spieler.getVerein() + " " + spieler.getPosition() + " " + spieler.getGehalt());
        } 
    }

    
    
}
