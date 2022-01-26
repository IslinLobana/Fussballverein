package model;

import java.util.Scanner;

public class Menu {
    
    Scanner scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }




    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
}
