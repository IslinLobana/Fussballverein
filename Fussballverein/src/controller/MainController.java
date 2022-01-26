package controller;
import view.Output;


public class MainController {
    
    FansController fc;
    LigaController lc;
    SpielerController sc;
    SponsorenController spc; 
    StadionController stc;
    TicketController tc;
    TrainerController trc;
    TrikotController tric;
    Output output;
    


    public MainController(){
        setFc(new FansController(this));
        setLc(new LigaController(this));
        setSc(new SpielerController(this));
        setSpc(new SponsorenController(this));
        setStc(new StadionController(this));
        setTc(new TicketController(this));
        setTrc(new TrainerController(this));
        setTric(new TrikotController(this));
        setOutput(new Output());

        createDemoData();
        printDemoData();

    }

    public void createDemoData(){
        getFc().createFansar();
        getLc().createDemoLiga();
        getSc().createSpielerar();
        getSpc().createSponsorenar();
        getStc().createDemoStadion();
        getTc().createDemoTicket();
        getTrc().createTrainerar();
        getTric().createTrikotar();
    }

    public void printDemoData(){
        getFc().printFans();
        getSc().printSpieler();
        getSpc().printSponsoren();
        getStc().printStadion();
        getLc().printLiga();
        getTc().printTicket();
        getTrc().printTrainer();
        getTric().printTrikot();
    }


    for()

    public void setFc(FansController fc) {
        this.fc = fc;
    }
    public void setLc(LigaController lc) {
        this.lc = lc;
    }
    public void setSc(SpielerController sc) {
        this.sc = sc;
    }
    public void setSpc(SponsorenController spc) {
        this.spc = spc;
    }
    public void setStc(StadionController stc) {
        this.stc = stc;
    }
    public void setTc(TicketController tc) {
        this.tc = tc;
    }
    public void setTrc(TrainerController trc) {
        this.trc = trc;
    }
    public void setTric(TrikotController tric) {
        this.tric = tric;
    }
    public void setOutput(Output output) {
        this.output = output;
    }
    
    public FansController getFc() {
        return fc;
    }
    public LigaController getLc() {
        return lc;
    }
    public SpielerController getSc() {
        return sc;
    }
    public SponsorenController getSpc() {
        return spc;
    }
    public StadionController getStc() {
        return stc;
    }
    public TicketController getTc() {
        return tc;
    }
    public TrainerController getTrc() {
        return trc;
    }
    public TrikotController getTric() {
        return tric;
    }
    public Output getOutput() {
        return output;
    }
    
    
}
