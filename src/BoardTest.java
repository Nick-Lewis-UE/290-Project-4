import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BoardTest {
    private void testBoard(AbstractBoard b, ArrayList<Piece> grid) {
        Assert.assertEquals(grid.size(), b.getSize());
//        System.out.println("Grid Size: " + grid.size());
        for (int i = 0; i < grid.size(); i++) {
//            System.out.println(b.getGrid().get(i).getSymbol());
//            System.out.println(grid.get(i).getSymbol());
            Assert.assertEquals(b.getGrid().get(i).getSymbol(), grid.get(i).getSymbol());
        }
    }

    public ArrayList<Piece> makeEmptyBoard(int size) {
        ArrayList<Piece> a1 = new ArrayList<Piece>();
        for (int i = 0; i < size; i++) {
            a1.add(i, new Piece());
        }
        return a1;
    }

    @Test
    public void testConstructors() {
        // Gomoku

        // testing empty constructor
        GomokuBoard g1 = new GomokuBoard();
        testBoard(g1, g1.makeEmptyBoard());


        // Connect4
        Connect4Board b2 = new Connect4Board();
        testBoard(b2, b2.makeEmptyBoard());
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

        ArrayList<Piece> a1 = g1.makeEmptyBoard();
        a1.set(24, p1);
        testBoard(g1, a1);

        //Connect4
        Connect4Board c1 = new Connect4Board();
        Piece p2 = new Piece("o");
        Piece p3 = new Piece("x");
        c1.addPiece(p2, 3,4);
        c1.addPiece(p3, 5, 6);
        ArrayList<Piece> a2 = c1.makeEmptyBoard();
        a2.set(11, p2);
        a2.set(29, p3);
        testBoard(c1, a2);
    }
}
