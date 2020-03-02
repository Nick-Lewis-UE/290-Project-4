import java.util.ArrayList;

public class Connect4Board extends AbstractBoard {

    public Connect4Board(ArrayList<ArrayList<Piece>> grid) {
        this.grid = grid;
    }

    public Connect4Board() {
        ArrayList<ArrayList<Piece>> grid = new ArrayList<ArrayList<Piece>>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grid.add(i, new ArrayList<Piece>());
                grid.get(i).add(j, new Piece());
            }
        }
        this.grid = grid;
    }
    public void addPiece() {}
    public void printBoard() {
        System.out.println("---------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++)
                System.out.println("|" + grid.get(i).get(j));
            System.out.println("|\n");
        }
    }

    @Override
    public ArrayList<ArrayList<Piece>> getGrid() {
        return grid;
    }
}
