import Kommunikation.ConnectionReceiver;
import Kommunikation.ConnectionSender;

public interface Ending {
    public void endGame(int reason, ConnectionSender sender);
    public void proposalEnd(int reason, ConnectionSender sender);
    public boolean propsalAnswer(ConnectionReceiver receiver);
    public int awaitEnd(ConnectionReceiver receiver);
}
