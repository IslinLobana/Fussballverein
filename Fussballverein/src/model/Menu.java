package model;

import java.util.Scanner;

public class Menu {
    
    Scanner scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Alle Spieler");
        System.out.println("(2) Alle Spieler im Club");
        System.out.println("(3) Alle Spieler außerhalb des Clubs");
        System.out.println("(4) Finanzen");
        String choice = getScanner().nextLine();

        if(choice.equals("1")){
            
        }
    }


    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
}
