import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BoardTest {
    private void testBoard(AbstractBoard b, ArrayList<ArrayList<Piece>> grid) {
//        System.out.println("Grid Size: " + grid.size());
        for (int i = 0; i < b.getNum_row(); i++) {
//            System.out.println(b.getGrid().get(i).getSymbol());
//            System.out.println(grid.get(i).getSymbol());
            for (int j = 0; j < b.getNum_col(); j++)
                Assert.assertEquals(grid.get(i).get(j).getSymbol(),
                        b.getGrid().get(i).get(j).getSymbol());
        }
    }

    public ArrayList<ArrayList<Piece>> makeEmptyBoard(int rows, int cols) {
        ArrayList<ArrayList<Piece>> a= new ArrayList();
        for (int i = 0; i < rows; i++) {
            a.add(i, new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                a.get(i).add(j, new Piece());
            }
        }
        return a;
    }

    @Test
    public void testConstructors() {
        // Gomoku

        // testing empty constructor
        GomokuBoard g1 = new GomokuBoard();
        testBoard(g1, makeEmptyBoard(19, 19));


        // Connect4
        Connect4Board b2 = new Connect4Board();
        testBoard(b2, makeEmptyBoard(6, 7));
    }
    @Test
    public void testPrintBoard() {
        System.out.println("Empty Connect4 Board.");
        Connect4Board b1 = new Connect4Board();
        b1.printBoard();

        System.out.println("Empty Gomoku Board.");
        GomokuBoard g1 = new GomokuBoard();
        g1.printBoard();
    }

    @Test
    public void testaddPiece() {
        // Gomoku
        GomokuBoard g1 = new GomokuBoard();
        Piece p1 = new Piece("x");
        g1.addPiece(p1, 5,5);

        ArrayList<ArrayList<Piece>> a1 = makeEmptyBoard(19,19);
        a1.get(4).set(4, p1);
        testBoard(g1, a1);

        //Connect4
        Connect4Board c1 = new Connect4Board();
        Piece p2 = new Piece("o");
        Piece p3 = new Piece("x");
        c1.addPiece(p2, 3,4);
        c1.addPiece(p3, 5, 6);
        ArrayList<ArrayList<Piece>> a2 = makeEmptyBoard(6,7);
        c1.printBoard();
        a2.get(2).set(3, p2);
        a2.get(4).set(5, p3);
        testBoard(c1, a2);
    }
}
