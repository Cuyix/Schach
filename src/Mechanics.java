public class Mechanics implements Spielmachine{
    @Override
    public Spielfeld[][] create() {
        Spielfeld[][] board = new Spielfeld[8][8];
        Figur pawnW1 = new Pawn(true);
        Figur pawnB1 = new Pawn(false);
        Figur pawnW2 = new Pawn(true);
        Figur pawnB2 = new Pawn(false);
        Figur pawnW3 = new Pawn(true);
        Figur pawnB3 = new Pawn(false);
        Figur pawnW4 = new Pawn(true);
        Figur pawnB4 = new Pawn(false);
        Figur pawnW5 = new Pawn(true);
        Figur pawnB5 = new Pawn(false);
        Figur pawnW6 = new Pawn(true);
        Figur pawnB6 = new Pawn(false);
        Figur pawnW7 = new Pawn(true);
        Figur pawnB7 = new Pawn(false);
        Figur pawnW8 = new Pawn(true);
        Figur pawnB8 = new Pawn(false);
        Figur kingW = new King(true);
        Figur kingB = new King(false);
        Figur queenW = new Queen(true);
        Figur queenB = new Queen(false);
        Figur rookW1 = new Rook(true);
        Figur rookB1 = new Rook(false);
        Figur rookW2 = new Rook(true);
        Figur rookB2 = new Rook(false);
        Figur bisW1 = new Bishop(true);
        Figur bisB1 = new Bishop(false);
        Figur bisW2 = new Bishop(true);
        Figur bisB2 = new Bishop(false);
        Figur knightW1 = new Knight(true);
        Figur knightB1 = new Knight(false);
        Figur knightW2 = new Knight(true);
        Figur knightB2 = new Knight(false);
        //TODO: Zuteilen zum Feld
        return board;
    }

    @Override
    public void capture(int position, Spielfeld[][] board) {
        int row = convertRow(position);
        int col = convertCol(position);
        board[row][col].setFigur();
    }

    // Rechnen Feldnummer in Arraypositionen um
    @Override
    public int convertRow(int position) {
        int col = position % 8;
        int row = (position - col) / 8;
        return row;
    }
    @Override
    public int convertCol(int position) {
        int col = position % 8;
        return col;
    }

    // Rechnet Arrayposition in Feldnummer um
    @Override
    public int convert(int row, int col) {
        int position = (row * 8) + col;
        return position;
    }
}
