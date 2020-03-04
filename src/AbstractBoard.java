import java.util.ArrayList;

public abstract class AbstractBoard {
    // outer list is rows, inner list is columns
    protected ArrayList<Piece> grid;
    protected int size;
    protected int num_col;
    protected int num_row;

    public AbstractBoard() {}

    public int getSize() {
        return size;
    }

    public int getNum_row() {
        return num_row;
    }

    public int getNum_col() {
        return num_col;
    }

    public ArrayList<Piece> getGrid() {
        return grid;
    }

    public void addPiece(Piece p2, int i, int i1) {}
    public void addPiece(Piece p, int i) {
        grid.set(i, p);
    };
    public void printBoard() {}

    public ArrayList<Piece> makeEmptyBoard() {
        ArrayList<Piece> a1 = new ArrayList<Piece>();
        for (int i = 0; i < this.size; i++) {
            a1.add(i, new Piece());
        }
        return a1;
    }
}
