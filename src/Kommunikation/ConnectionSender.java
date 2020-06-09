package Kommunikation;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ConnectionSender extends Thread implements Sender{
    private final DataOutputStream dos;
    public ConnectionSender(OutputStream os){
        this.dos = new DataOutputStream(os);
    }
    @Override
    public void sendDice(int random){
        try {
            dos.writeInt(Indicator.DICE);
            dos.writeInt(random);
        }catch(IOException ex){
            System.err.println("Failed to write int while sending dice.");
        }
    }

    @Override
    public void sendChooseColor(boolean white) {
        try{
            dos.writeBoolean(white);
        }catch(IOException ex){
            System.err.println("Failed to write boolean while sending color");
        }
    }

    @Override
    public void sendMove(int from, int to) {
        try{
            dos.writeInt(Indicator.MOVE);
            dos.writeInt(from);
            dos.writeInt(to);
        }catch(IOException ex){
            System.err.println("Failed to send move.");
        }
    }

    @Override
    public void sendMovePawnRule(int from, int figureType) {
        try{
            dos.writeInt(Indicator.PAWN);
            dos.writeInt(from);
            dos.writeInt(figureType);
        }catch(IOException ex){
            System.err.println("Failed to send pawn move.");
        }
    }

    @Override
    public void sendRochade(int from) {
        try{
            dos.writeInt(Indicator.ROCHADE);
            dos.writeInt(from);
        }catch(IOException ex){
            System.err.println("Failed to send rochade move.");
        }
    }

    @Override
    public void sendEndGame(int reason) {
        try{
            dos.writeInt(Indicator.ENDGAME);
            dos.writeInt(reason);
        }catch(IOException ex){
            System.err.println("Failed to send end.");
        }
    }

    @Override
    public void sendProposalEnd(int reason) {
        try{
            dos.writeInt(Indicator.PROPOSEEND);
            dos.writeInt(reason);
        }catch(IOException ex){
            System.err.println("Failed to propose end.");
        }
    }

    @Override
    public void sendProposalAnswer(boolean accept) {
        try{
            dos.writeBoolean(accept);
        }catch(IOException ex){
            System.err.println("Failed to send proposal answer.");
        }

    }
    @Override
    public void run(){

    }
}

