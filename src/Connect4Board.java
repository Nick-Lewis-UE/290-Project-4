import java.util.ArrayList;

public class Connect4Board extends AbstractBoard {

    public Connect4Board(ArrayList<ArrayList<Piece>> grid) {
        this.grid = grid;
    }

    public Connect4Board() {
        this.num_col = 7;
        this.num_row = 6;
        this.size = 42;
        this.needToWin = 4;
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
        int rowID = 1;
        System.out.print("|1|2|3|4|5|6|7|\n");
        for (int i = 0; i < num_row; i++) {
            System.out.println("|"+grid.get(i).get(0).getSymbol()+
                    "|"+grid.get(i).get(1).getSymbol()+
                    "|"+grid.get(i).get(2).getSymbol()+
                    "|"+grid.get(i).get(3).getSymbol()+
                    "|"+grid.get(i).get(4).getSymbol()+
                    "|"+grid.get(i).get(5).getSymbol()+
                    "|"+grid.get(i).get(6).getSymbol()+
                    "|" + rowID++);
        }
    }
}
