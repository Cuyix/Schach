public class Spielstart {
    Spielstart(){
        this.ownDice = dice();
        connection.sendDice(ownDice);
        setFellowDice();
        State state = afterDice();
        if(state == State.COLOR){
            white = chooseColor();
            connection.sendChooseColor(white);
        }else if(state == State.WAITING){
            white = awaitColor();
        }
    }
    Connection connection = new Connection();
    int ownDice;
    int fellowDice;
    boolean white;
    public int dice(){
        int dice = (int)(Math.random() * 100) + 1;
        return dice;
    }
    public void setFellowDice() {
        this.fellowDice = connection.receiveDice();
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
        boolean white = connection.receiveChooseColor();
        return white;
    }
}
