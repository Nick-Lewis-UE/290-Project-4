import java.util.ArrayList;
import java.util.List;

public class GomokuBoard extends AbstractBoard {

    public GomokuBoard(ArrayList<ArrayList<Piece>> grid) {
        this.grid = grid;
    }

    public GomokuBoard() {this(new ArrayList<ArrayList<Piece>>());}
    public void addPiece() {}
    public void printBoard() {
        System.out.println("| | | | | | | | | | | | | | | | | | | |");
    }

    @Override
    public ArrayList<ArrayList<Piece>> getGrid() {
        return grid;
    }
}
