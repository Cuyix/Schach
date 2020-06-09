package Kommunikation;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConnectionReceiver extends Thread implements Receiver {
    private final DataInputStream dis;
    public ConnectionReceiver(InputStream is){
        this.dis = new DataInputStream(is);
    }
    @Override
    public int receiveIndicator(){
        int indi = -1;
        try{
            indi = dis.readInt();
        }catch(IOException ex){
            System.err.println("Failed to receive indicator.");
        }
        return indi;
    }
    @Override
    public int receiveDice() {
        int dice = -1;
        try{
            dice = dis.readInt();
        }catch(IOException ex){
            System.err.println("Failed to receive dice.");
        }
        return dice;
    }

    @Override
    public boolean receiveChooseColor() {
        boolean color = false;
        try{
            color = dis.readBoolean();
        }catch(IOException ex){
            System.err.println("Failed to receive color.");
        }
        return color;
    }
    @Override
    public int receiveInt() {
        int received = -1;
        try{
            received = dis.readInt();
        }catch(IOException ex){
            System.err.println("Failed to receive int.");
        }
        return received;
    }
/*
    @Override
    public int receiveMovePawnRule() {
        //TODO: Is this needed?
    }

    @Override
    public int receiveRochade() {
        //TODO: Is this needed?
    }

    @Override
    public int receiveEndGame() {
        //TODO: Is this needed?
    }

    @Override
    public int receiveProposalEnd() {
        //TODO: Is this needed?
    }
    */

    @Override
    public boolean receiveProposalAnswer() {
        boolean answer = false;
        try{
            answer = dis.readBoolean();
        }catch(IOException ex){
            System.err.println("Failed to receive answer to proposal.");
        }
        return answer;
    }
    @Override
    public void run(){

    }
}

