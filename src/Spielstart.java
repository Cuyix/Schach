import Kommunikation.ConnectionReceiver;
import Kommunikation.ConnectionSender;

public class Spielstart {
    Spielstart(){
        this.ownDice = dice();
        sender.sendDice(ownDice);
        /* setFellowDice();
        State state = afterDice();
        if(state == State.COLOR){
            white = chooseColor();
            sender.sendChooseColor(white);
        }else if(state == State.WAITING){
            white = awaitColor();
        }
        Mechanics.white = white;
         */
    }
    //TODO: Missing Inputstream
    ConnectionReceiver receiver = new ConnectionReceiver();
    //TODO: Missing OutputStream
    ConnectionSender sender = new ConnectionSender();

    int ownDice;
    int fellowDice;
    boolean white;
    public int dice(){
        int dice = (int)(Math.random() * 100) + 1;
        return dice;
    }
    public void setFellowDice() {
        this.fellowDice = receiver.receiveDice();
    }
    public State afterDice(){
        if(ownDice > fellowDice){
            return State.COLOR;
        }else{return State.WAITING;}
    }
    public boolean chooseColor(){
        //TODO
        return false;
    }
    public boolean awaitColor(){
        boolean white = receiver.receiveChooseColor();
        return white;
    }
}
