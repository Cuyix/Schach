import Figuren.Figur;

public class Spielfeld {
    private Figur figur;
    //TODO:  position, feld array? Liste?
    public Figur getFigur(){
        return figur;
    }
    public void setFigur(){
        this.figur = null;
    }
    public void setFigur(Figur figur){
        this.figur = figur;
    }
}
