import Kommunikation.Indicator;

public class Spiel extends Mechanics{
    // TODO: Find solution for number of figures and current white in Mechanics
    // receiveMove needs to run twice
    public static void main(String[] args){
        static final int PLACEHOLDER = -1;
        State state = State.START;
        Spielfeld[][] spielfeld;
        boolean white;
         //spielfeld = create();white = white;
        //
        while(state == State.START){

        }
        while(state == State.ACTIVE){
            int indicator = PLACEHOLDER;
            switch(indicator) {
                case Indicator.MOVE:
                    int from = PLACEHOLDER;
                    int to = PLACEHOLDER;
                    sendMove(sender, spielfeld, from, to);
                case Indicator.PAWN:

                case Indicator.ROCHADE:

                case Indicator.ENDGAME:
                    int reason = PLACEHOLDER;
                    sender.sendEndGame(reason);
                case Indicator.PROPOSEEND:

                default:
                    System.out.println("No correct indicator");
            }
        }
        while(state == State.PASSIVE){
            int indicator = receiver.receiveIndicator();
            switch(indicator) {
                case Indicator.MOVE:
                    receiveMove(receiver, spielfeld);
                case Indicator.PAWN:

                case Indicator.ROCHADE:

                case Indicator.ENDGAME:

                case Indicator.PROPOSEEND:

                default:
                    System.out.println("No correct indicator");
            }
        }
        if(state == State.ENDED){

        }
    }
}
