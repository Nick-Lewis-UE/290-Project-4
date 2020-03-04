import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BoardTest {
    private void testBoard(AbstractBoard b, ArrayList<Piece> grid) {
        Assert.assertEquals(grid.size(), b.getGrid().size());
        for (int i = 0; i < grid.size(); i++)
            Assert.assertEquals(b.getGrid().get(i).getSymbol(), grid.get(i).getSymbol());
    }

    @Test
    public void testConstructors() {
        // Gomoku

        // testing empty constructor
        GomokuBoard g1 = new GomokuBoard();
        ArrayList<Piece> a1 = new ArrayList<Piece>();
        for (int i = 0; i < 361; i++) {
            a1.add(i, new Piece());
        }
        testBoard(g1, a1);


        // Connect4
        Connect4Board b2 = new Connect4Board();
        ArrayList<Piece> a2 = new ArrayList<Piece>();
        for (int i = 0; i < 42; i++) {
            a2.add(i, new Piece());
        }
        testBoard(b2, a2);
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

        ArrayList<Piece> a1 = new ArrayList<>();
        for (int i = 0; i < 361; i++) {
            a1.add(i, new Piece());
        }
        a1.set(24, p1);
        testBoard(g1, a1);
    }
}
