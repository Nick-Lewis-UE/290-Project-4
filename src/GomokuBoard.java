import java.util.ArrayList;
import java.util.List;

public class GomokuBoard extends AbstractBoard {

    public GomokuBoard(ArrayList<Piece> grid) {
        this.grid = grid;
    }

    public GomokuBoard() {
        this.num_col = 19;
        this.num_row = 19;
        this.size = 361;
        ArrayList<Piece> grid = new ArrayList<Piece>();
        for (int i = 0; i < 361; i++) {
            grid.add(i, new Piece());
        }
        this.grid = grid;
    }

    public void addPiece(Piece p, int row, int col) {
            int index = row*col-1;
            grid.set(index, p);
    }

    public void printBoard() {
        for (int i = 0; i < 361; i = i + 19) {
            System.out.println("|" + grid.get(i).getSymbol() +
                    "|" + grid.get(i + 1).getSymbol() +
                    "|" + grid.get(i + 2).getSymbol() +
                    "|" + grid.get(i + 3).getSymbol() +
                    "|" + grid.get(i + 4).getSymbol() +
                    "|" + grid.get(i + 5).getSymbol() +
                    "|" + grid.get(i + 6).getSymbol() +
                    "|" + grid.get(i + 7).getSymbol() +
                    "|" + grid.get(i + 8).getSymbol() +
                    "|" + grid.get(i + 9).getSymbol() +
                    "|" + grid.get(i + 10).getSymbol() +
                    "|" + grid.get(i + 11).getSymbol() +
                    "|" + grid.get(i + 12).getSymbol() +
                    "|" + grid.get(i + 13).getSymbol() +
                    "|" + grid.get(i + 14).getSymbol() +
                    "|" + grid.get(i + 15).getSymbol() +
                    "|" + grid.get(i + 16).getSymbol() +
                    "|" + grid.get(i + 17).getSymbol() +
                    "|" + grid.get(i + 18).getSymbol() +
                    "|");
        }
    }
}
