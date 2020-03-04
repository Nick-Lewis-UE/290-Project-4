import java.util.ArrayList;

public class Connect4Board extends AbstractBoard {

    public Connect4Board(ArrayList<Piece> grid) {
        this.grid = grid;
    }

    public Connect4Board() {
        this.num_col = 7;
        this.num_row = 6;
        this.size = 42;
        ArrayList<Piece> grid = new ArrayList<Piece>();
        for (int i = 0; i < this.size; i++) {
            grid.add(i, new Piece());
        }
        this.grid = grid;
    }
    public void addPiece(Piece p, int row, int col) {
        int index = row*col-1;
        grid.set(index, p);
    }

    public void printBoard() {
        for (int i = 0; i < 42; i=i+7) {
            System.out.println("|"+grid.get(i).getSymbol()+
                    "|"+grid.get(i+1).getSymbol()+
                    "|"+grid.get(i+2).getSymbol()+
                    "|"+grid.get(i+3).getSymbol()+
                    "|"+grid.get(i+4).getSymbol()+
                    "|"+grid.get(i+5).getSymbol()+
                    "|"+grid.get(i+6).getSymbol()+
                    "|");
        }
    }
}
