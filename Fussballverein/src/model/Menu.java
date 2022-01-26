package model;



import java.util.Scanner;

import controller.MainController;

public class Menu {
    MainController mc;

    Scanner scanner;

    public Menu(MainController mc){
        setMc(mc);
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte auswählen:");
        System.out.println("(1) Alle Spieler");
        System.out.println("(2) Alle Spieler im Club");
        System.out.println("(3) Alle Spieler nicht im Club");
        System.out.println("(4) Gesamtgehälter");
        String choice = getScanner().nextLine();
        System.out.println("Auswahl:" + choice);

        if(choice.equals("1")){
            mc.getSc().printSpieler();
        }
        if(choice.equals("2")){
            mc.getSc().printSpielerimclub();
        }
        if(choice.equals("3")){
            mc.getSc().printSpielerar();
        }
        if(choice.equals("4")){
            mc.getSc().getGehaelter();
        }
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }

    public MainController getMc() {
        return mc;
    }


    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
}
