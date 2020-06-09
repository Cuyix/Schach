import Kommunikation.ConnectionReceiver;
import Kommunikation.ConnectionSender;

public class End implements Ending {
    @Override
    public void endGame(int reason, ConnectionSender sender) {
        sender.sendEndGame(reason);
    }

    @Override
    public void proposalEnd(int reason, ConnectionSender sender) {
        sender.sendProposalEnd(reason);
    }

    @Override
    public boolean propsalAnswer(ConnectionReceiver receiver) {
        boolean answer = receiver.receiveProposalAnswer();
        return answer;
    }

    @Override
    public int awaitEnd(ConnectionReceiver receiver) {
        int reason = receiver.receiveEndGame();
        return reason;
    }
}
