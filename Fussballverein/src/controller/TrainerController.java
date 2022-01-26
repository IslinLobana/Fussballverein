package controller;
import java.util.*;
import model.Trainer;


public class TrainerController {

    MainController mc; 
    ArrayList<Trainer> trainerar;

    public TrainerController(MainController mc){
        setMc(mc);
        trainerar = new ArrayList<Trainer>();
    }


    public void createTrainerar(){
        getTrainerar().add(new Trainer("Jürgen", "Klopp", "Liverpool", 70));
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setTrainerar(ArrayList<Trainer> trainerar) {
        this.trainerar = trainerar;
    }

    public MainController getMc() {
        return mc;
    }
    public ArrayList<Trainer> getTrainerar() {
        return trainerar;
    }

    public void printGruppen(){
        for(Trainer trainer: getTrainerar()){
            getMc().getOutput().printData(trainer.getVorname() + " " + trainer.getNachname() + " " + trainer.getAlter() + " " + trainer.getVerein());

        }

    }



    
}
