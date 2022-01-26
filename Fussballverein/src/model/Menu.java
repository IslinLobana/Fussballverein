package model;



import java.util.Scanner;

import controller.MainController;
import controller.*;

import view.*;

import model.*;

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
    public void startMenu()
    {
        System.out.println("Bitte wähle aus");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde ");
        System.out.println("(3) Neuer Verkäufer");
        System.out.println("(4) Neues Auto");

        String choice = getScanner().nextLine();
        System.out.println("Deine Asuwahl ist: " + choice); 
        

        if(choice.equals("1")){
            createFansMenu();
        }
        
        else if(choice.equals("2")){
            createLigaMenu();
        }
        else if(choice.equals("3")){
            createSpielerMenu();
        }
        else if(choice.equals("4")){
            createSponsorenMenu();
        }
        else if(choice.equals("5")){
            createStadionMenu();
        }
        else if(choice.equals("6")){
            createTicketMenu();
        }
        else if(choice.equals("7")){
            createTrainerMenu();
        }
        else if(choice.equals("8")){
            createTrikotMenu();
        }
        else if(choice.equals("9")){
            showFansMenu();
        }
        else if(choice.equals("10")){
            showLigaMenu();
        }
        else if(choice.equals("11")){
            showSpielerMenu();
        }
        else if(choice.equals("12")){
            showSponsorenMenu();
        }
        else if(choice.equals("13")){
            showStadionMenu();
        }
        else if(choice.equals("14")){
            showTicketMenu();
        }
        else if(choice.equals("15")){
            showTrainerMenu();
        }
        else if(choice.equals("16")){
            showTrikotMenu();
        }
        else {
            System.out.println("Bist du blöd?");
        }
    }

    public void createFansMenu()
    {
        System.out.println("Erstelle ein Fans");
        System.out.println("Vorname");
        String vorname = getScanner().nextLine();
        System.out.println("Nachname");
        String nachname = getScanner().nextLine();
        System.out.println("Eigenschaften");
        String eigenschaften = getScanner().nextLine();
        System.out.println("Vielen Dank, dein Fan wird erstellt");
        /*
        FansController.createFansar().add(new Fans(vorname, nachname, eigenschaften));
        startMenu();

        Kein Plan wie das hier, wenn du das hier siehst kannst du ja auch sonst nochmal anrufen wenn das wichtig wäre. Sonst frage ich ihn morgen
        */
     }

     public void createLigaMenu()
     {
         System.out.println("Erstelle die Liga für deinen Verein");
         System.out.println("Anzahl der Vereine");
         String anzahlVerein = getScanner().nextLine();
         int anzahlVereine = Integer.valueOf(anzahlVerein);
         System.out.println("Name");
         String name = getScanner().nextLine();
         System.out.println("Land");
         String land = getScanner().nextLine();
         System.out.println("Vielen Dank, deine Liga wird erstellt");


     }

     public void createSpielerMenu()
     {
         System.out.println("Erstelle einen Spieler");
         System.out.println("Alter");
         String alterSpieler = getScanner().nextLine();
         int alter = Integer.valueOf(alterSpieler);
         System.out.println("Gehalt");
         String gehaltSpieler = getScanner().nextLine();
         int gehalt = Integer.valueOf(gehaltSpieler);
         System.out.println("Vorname");
         String vorname = getScanner().nextLine();
         System.out.println("Nachname");
         String nachname = getScanner().nextLine();
         System.out.println("Position");
         String position = getScanner().nextLine();
         System.out.println("Vorname");
         String startelfja = getScanner().nextLine();
         boolean startelf = Boolean.valueOf(startelfja);
         System.out.println("Verein");
         String verein = getScanner().nextLine();
         System.out.println("Vorname");
         String preisp = getScanner().nextLine();
         int preis = Integer.valueOf(preisp);
         System.out.println("Vielen Dank, dein Spieler wird erstellt");

         
     }


     public void createSponsorenMenu()
     {
         System.out.println("Erstelle einen Sponsoren für deinen Verein");
         System.out.println("Firmenname");
         String firmenname = getScanner().nextLine();
         System.out.println("Laufzeit");
         String laufzeitj = getScanner().nextLine();
         double laufzeit = Double.valueOf(laufzeitj);
         System.out.println("Einkommen");
         String einkommenj = getScanner().nextLine();
         int einkommen = Integer.valueOf(einkommenj);
         System.out.println("Vielen Dank dein Sponsor wird erstellt");


     }

     public void createStadionMenu()
     {
         System.out.println("Erstelle ein Stadion für deinen Verein");
         System.out.println("Ist es voll");
         String vollo = getScanner().nextLine();
         boolean voll = Boolean.valueOf(vollo);
         System.out.println("Anzahl der Sitze Gesamt");
         String anzahl = getScanner().nextLine();
         int anzahlSitzeGesamt = Integer.valueOf(anzahl);
         System.out.println("Anzahl der Sitze Frei");
         String anzahle = getScanner().nextLine();
         int anzahlSitzeFrei = Integer.valueOf(anzahle);
         System.out.println("Stadionname");
         String name = getScanner().nextLine();
         System.out.println("Vielen Dank, deine Liga wird erstellt");


     }

     public void createTicketMenu()
     {
         System.out.println("Erstelle ein Ticket");
         System.out.println("Ist es eine Dauerkarte");
         String dauerkartee = getScanner().nextLine();
         boolean dauerkarte = Boolean.valueOf(dauerkartee);
         System.out.println("Stadionplatz");
         String stadionplatz = getScanner().nextLine();
         System.out.println("Einkommen durch die Karte");
         String einkommene = getScanner().nextLine();
         int einkommen = Integer.valueOf(einkommene);
         System.out.println("Vielen Dank, dein Ticket wird erstellt");


     }

     public void createTrainerMenu()
     {
         System.out.println("Erstelle einen Trainer");
         System.out.println("Vorname");
         String vorname = getScanner().nextLine();
         System.out.println("Nachname");
         String nachname = getScanner().nextLine();
         System.out.println("Verein");
         String verein = getScanner().nextLine();
         System.out.println("Alter");
         String altere = getScanner().nextLine();
         int alter = Integer.valueOf(altere);
         System.out.println("Vielen Dank, dein Trainer wird erstellt");


     }

     public void createTrikotMenu()
     {
         System.out.println("Erstelle ein Trikot");
         System.out.println("Rückennumer");
         String rueckennumere = getScanner().nextLine();
         int rueckennummer = Integer.valueOf(rueckennumere);
         System.out.println("Größe");
         String groesse = getScanner().nextLine();
         System.out.println("Preis");
         String preise = getScanner().nextLine();
         int preis = Integer.valueOf(preise);
         System.out.println("Vorname");
         String vorname = getScanner().nextLine();
         System.out.println("Nachname");
         String nachname = getScanner().nextLine();
         System.out.println("Vielen Dank, dein Trainer wird erstellt");


     }

     



    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
}
