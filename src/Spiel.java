public class Spiel extends Mechanics{
    private State state;
    private int ownFigures = 16;
    private int fellowFigures = 16;
    private Spielfeld[][] spielfeld;
    boolean white;
    Spiel(boolean white){
        this.spielfeld = create();
        this.white = white;
    }
}
