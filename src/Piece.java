public class Piece {
    public Piece(String symbol) {
        this.symbol = symbol;
    }

    protected String symbol;

    public void place(){}
    public boolean winningPiece(){return false;}

    public String getSymbol() {
        return symbol;
    }
}
