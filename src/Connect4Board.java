import java.util.ArrayList;

public class Connect4Board extends AbstractBoard {

    public Connect4Board(ArrayList<ArrayList<Piece>> grid) {
        this.grid = grid;
    }

    public Connect4Board() {this(new ArrayList<ArrayList<Piece>>());}
    public void addPiece() {}
    public void printBoard() {}

    @Override
    public ArrayList<ArrayList<Piece>> getGrid() {
        return grid;
    }
}
