package Figuren;

import Figuren.Figur;

public class King implements Figur {
    boolean white;
    public King(boolean white){
        this.white = white;
    }
    @Override
    public void move(int from, int to) {
        if(true){
            // Zielfeld besetzt > Ziel wird geschmissen, wenn nicht eigene Farbe
            // Woher bekommt die Figuren.Figur das Spielfeld?
        }

    }
    public void rochade(int from){

    }
    public boolean canMove(){
        return true;
    }
}
