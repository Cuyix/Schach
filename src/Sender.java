public interface Sender {
    void sendDice(int random);
    void sendChooseColor(boolean white);
    void sendMove(int from, int to);
    void sendMovePawnRule(int from, int figureType);
    void sendRochade(int from);
    void sendEndGame(int reason);
    void sendProposalEnd(int reason);
    void sendProposalAnswer(boolean accept);

}
