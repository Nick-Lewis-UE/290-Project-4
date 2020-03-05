import java.util.ArrayList;

import static java.lang.Math.min;

public abstract class AbstractBoard {
    // outer list is rows, inner list is columns
    protected ArrayList<ArrayList<Piece>> grid;
    protected int size;
    protected int num_col;
    protected int num_row;
    protected int needToWin;

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

    public boolean justWon(Player p, int col, int row) {
        int run = 0;
        // horizontal win?
        for (int i = 0; i < num_col; i++) {
            if (grid.get(row-1).get(i).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >=needToWin)
                return true;
        }

        run = 0;
        // vertical win?
        for (int i = 0; i < num_row; i++) {
            if(grid.get(i).get(col-1).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= needToWin)
                return true;
        }

        // descending diagonal win
        int diff = row-col;
        run = 0;
        int smaller = min(row, col);
        int r = row-smaller;
        int c = col-smaller;

//        System.out.println("Descending debug:");
        while (r < num_row && c< num_col) {
//            System.out.println("r = " + (r) + ", c = " + (c));
            if(grid.get(r).get(c).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= needToWin)
                return true;

            r++;
            c++;
        }

        // ascending diagonal win
        run = 0;

        r = row-1;
        c = col-1;
        while (r < num_row-1 && c > 0) {
            r++;
            c--;
        }
//        smaller = min(num_row-row+1, col);
//        r = row-smaller;
//        c = max(0, num_row);
//        c = col-smaller;

//        System.out.println("Ascending debug:");
        while (r >= 0 && c < num_col) {
//            System.out.println("r = " + (r) + ", c = " + (c));
            if(grid.get(r).get(c).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= needToWin)
                return true;

            r--;
            c++;
        }

        return false;
    }
}
