public interface Receiver {
    void receiveDice(int random);
    void receiveChooseColor(boolean white);
    void receiveMove(int from, int to);
    void receiveMovePawnRule(int from, int figureType);
    void receiveRochade(int from);
    void receiveEndGame(int reason);
    void receiveProposalEnd(int reason);
    void receiveProposalAnswer(boolean accept);

}
