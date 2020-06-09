package Kommunikation;

public interface Receiver {
    int receiveIndicator();
    int receiveDice();
    boolean receiveChooseColor();
    int receiveInt();
    /*int receiveMovePawnRule();
    int receiveRochade();
    int receiveEndGame();
    int receiveProposalEnd();*/
    boolean receiveProposalAnswer();

}
