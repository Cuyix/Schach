package Figuren;


public class Pawn implements Figur {
    boolean white;
    boolean unmoved = true;
    public Pawn(boolean white){
        this.white = white;
    }
    @Override
    public void move(int from, int to) {
    if(unmoved){

    } else{

    }
    }
    public void movePawnRule(int from, int figureType){

    }
    @Override
    public boolean isWhite() {
        return white;
    }
}
