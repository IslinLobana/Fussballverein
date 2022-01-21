package controller;
import java.util.*;

import model.Ticket;

public class TicketController {
       
    MainController mc;
    ArrayList<Ticket> ticketar;

    public TicketController(MainController mc){
        setMc(mc);
        ticketar = new ArrayList<Ticket>();
    }

    public void createDemoTicket(){
        getTicketar().add(new Ticket(false,"B 25" , 50));
    }


    public void setTicketar(ArrayList<Ticket> ticketar) {
        this.ticketar = ticketar;
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Ticket> getTicketar() {
        return ticketar;
    }

    public void printGruppen(){
        for(Ticket ticket: getTicketar()){
            getMc().getOutput().printData(ticket.getStadionplatz() + " " + ticket.getEinkommen());

        }

        

    }

}
