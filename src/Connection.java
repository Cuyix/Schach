public class Connection implements Sender, Receiver{
    @Override
    public int receiveDice() {
        return -1;
    }

    @Override
    public boolean receiveChooseColor() {
        //TODO: Parameter?
        return false;
    }

    @Override
    public void receiveMove(int from, int to) {

    }

    @Override
    public void receiveMovePawnRule(int from, int figureType) {

    }

    @Override
    public void receiveRochade(int from) {

    }

    @Override
    public void receiveEndGame(int reason) {

    }

    @Override
    public void receiveProposalEnd(int reason) {

    }

    @Override
    public void receiveProposalAnswer(boolean accept) {

    }

    @Override
    public void sendDice(int random) {

    }

    @Override
    public void sendChooseColor(boolean white) {

    }

    @Override
    public void sendMove(int from, int to) {

    }

    @Override
    public void sendMovePawnRule(int from, int figureType) {

    }

    @Override
    public void sendRochade(int from) {

    }

    @Override
    public void sendEndGame(int reason) {

    }

    @Override
    public void sendProposalEnd(int reason) {

    }

    @Override
    public void sendProposalAnswer(boolean accept) {

    }
}

