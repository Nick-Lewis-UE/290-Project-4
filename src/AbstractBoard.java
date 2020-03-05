import java.util.ArrayList;

public abstract class AbstractBoard {
    // outer list is rows, inner list is columns
    protected ArrayList<ArrayList<Piece>> grid;
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

    public ArrayList<ArrayList<Piece>> getGrid() {
        return grid;
    }

    public void addPiece(Piece p, int row, int col) {}
//    public void addPiece(ArrayList<Piece> p, int i) {
//        grid.set(i, p);
//    }
//
    public void printBoard() {}

//    public boolean validMove(int move) {
//        if (move >= size)
//            return false;
//        if (grid.get(move).getSymbol() != " ")
//            return false;
//
//        return true;
//    }
//
    public boolean justWon(Player p, int row, int col) {return false;}
//
    public ArrayList<ArrayList<Piece>> makeEmptyBoard() {
        ArrayList<ArrayList<Piece>> a= new ArrayList();
        for (int i = 0; i < num_row; i++) {
            a.add(i, new ArrayList<>());
            for (int j = 0; j < num_col; j++) {
                a.get(i).add(j, new Piece());
            }
        }
        return a;
    }
}
