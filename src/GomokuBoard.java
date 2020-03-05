import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GomokuBoard extends AbstractBoard {

    public GomokuBoard(ArrayList<ArrayList<Piece>> grid) {
        this.grid = grid;
    }

    public GomokuBoard() {

        this.num_col = 19;
        this.num_row = 19;
        this.size = 361;
        ArrayList<ArrayList<Piece>> grid = new ArrayList<>();
        for (int i = 0; i < num_row; i++) {
            grid.add(i, new ArrayList<>());
            for (int j = 0; j < num_col; j++) {
                grid.get(i).add(j, new Piece());
            }
        }
        this.grid = grid;
    }

    public void addPiece(Piece p, int row, int col) {
            grid.get(row-1).set(col-1, p);
    }

    public void printBoard() {
        char label = 'A';
        int rowID = 1;
        System.out.print("|A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|\n");
        for (int i = 0; i < num_row; i++) {
            System.out.println("|" + grid.get(i).get(0).getSymbol() +
                    "|" + grid.get(i).get(1).getSymbol() +
                    "|" + grid.get(i).get(2).getSymbol() +
                    "|" + grid.get(i).get(3).getSymbol() +
                    "|" + grid.get(i).get(4).getSymbol() +
                    "|" + grid.get(i).get(5).getSymbol() +
                    "|" + grid.get(i).get(6).getSymbol() +
                    "|" + grid.get(i).get(7).getSymbol() +
                    "|" + grid.get(i).get(8).getSymbol() +
                    "|" + grid.get(i).get(9).getSymbol() +
                    "|" + grid.get(i).get(10).getSymbol() +
                    "|" + grid.get(i).get(11).getSymbol() +
                    "|" + grid.get(i).get(12).getSymbol() +
                    "|" + grid.get(i).get(13).getSymbol() +
                    "|" + grid.get(i).get(14).getSymbol() +
                    "|" + grid.get(i).get(15).getSymbol() +
                    "|" + grid.get(i).get(16).getSymbol() +
                    "|" + grid.get(i).get(17).getSymbol() +
                    "|" + grid.get(i).get(18).getSymbol() +
                    "|" + rowID++);
        }
    }

    public boolean justWon(Player p, int col, int row) {
        int run = 0;
        // horizontal win?
        for (int i = 0; i < num_col; i++) {
            if (grid.get(row-1).get(i).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >=5)
                return true;
        }

        run = 0;
        // vertical win?
        for (int i = 0; i < num_row; i++) {
            if(grid.get(i).get(col-1).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= 5)
                return true;
        }

        // descending diagonal win
        int diff = row-col;
        run = 0;
        int smaller = min(row, col);
        int r = row-smaller;
        int c = col-smaller;

        System.out.println("Descending debug:");
        while (r < num_row && c< num_col) {
            System.out.println("r = " + (r) + ", c = " + (c));
            if(grid.get(r).get(c).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= 5)
                return true;

            r++;
            c++;
        }

        // ascending diagonal win
        run = 0;

        r = row-1;
        c = col-1;
        while (r < num_row && c > 0) {
            r++;
            c--;
        }
//        smaller = min(num_row-row+1, col);
//        r = row-smaller;
//        c = max(0, num_row);
//        c = col-smaller;

        System.out.println("Ascending debug:");
        while (r >= 0 && c < num_col) {
            System.out.println("r = " + (r) + ", c = " + (c));
            if(grid.get(r).get(c).getSymbol().equals(p.getPiece().getSymbol()))
                run++;
            else
                run = 0;
            if (run >= 5)
                return true;

            r--;
            c++;
        }

        return false;
    }
}
