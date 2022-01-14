package controller;

import model.Ticket;

public class TicketController {
       
    MainController mc;

    public TicketController(MainController mc){
        setMc(mc);
    }

    public void createDemoTicket(){
        Ticket t = new Ticket(false,"B 25" , 50);
    }



    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

}
