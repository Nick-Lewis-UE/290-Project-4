public class Piece {
    public Piece(String symbol) {
        this.symbol = symbol;
    }

    public Piece() {
        this.symbol = " ";
    }

    protected String symbol;

    public boolean winningPiece(){return false;}

    public String getSymbol() {
        return symbol;
    }
}
