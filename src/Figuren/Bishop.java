package Figuren;

public class Bishop implements Figur {
    boolean white;
    public Bishop(boolean white){
        this.white = white;
    }
    @Override
    public void move(int from, int to) {

    }

    @Override
    public boolean isWhite() {
        return white;
    }
}
