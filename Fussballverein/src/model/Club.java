package model;

public class Club {
 
    Stadion stadion;
    Trainer trainer;
    Spieler spieler;
    int budget; 


    public Club(Stadion stadion, Trainer trainer, Spieler spieler){
        setSpieler(spieler);
        setStadion(stadion);
        setTrainer(trainer);
        setBudget(budget);
    }



    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
   
    public Stadion getStadion() {
        return stadion;
    }
    public Spieler getSpieler() {
        return spieler;
    }
    public Trainer getTrainer() {
        return trainer;
    }
    public int getBudget() {
        return budget;
    }
    

    
}