public interface Spielmachine{
    // Erstellt das Spielfeld und erstellt und setzt Figuren
    public Spielfeld[][] create();
    // Schlägt (löscht) Figuren
    public void capture(int position, Spielfeld[][] board);
    // Rechnen Feldnummer in Arraypositionen um
    public int convertRow(int position);
    public int convertCol(int position);
    // Rechnet Arrayposition in Feldnummer um
    public int convert(int row, int col);
}
