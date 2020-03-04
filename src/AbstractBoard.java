import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBoard {
    // outer list is rows, inner list is columns
    protected ArrayList<Piece> grid;

    public AbstractBoard() {}

    public void addPiece() {}
    public void printBoard() {}

    public abstract ArrayList<Piece> getGrid();
}
