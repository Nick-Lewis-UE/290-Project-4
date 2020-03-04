import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;

public class GameTest {
    private void testGame(AbstractGame g, AbstractBoard b, Player p1, Player p2) {
        ArrayList<Piece> grid = b.makeEmptyBoard();
        Assert.assertEquals(grid.size(), b.getSize());
        for (int i = 0; i < grid.size(); i++) {
//            System.out.println(b.getGrid().get(i).getSymbol());
//            System.out.println(grid.get(i).getSymbol());
            Assert.assertEquals(b.getGrid().get(i).getSymbol(), grid.get(i).getSymbol());
        }
        Assert.assertEquals(p1.getPiece().getSymbol(), g.getP1().getPiece().getSymbol());
        Assert.assertEquals(p2.getPiece().getSymbol(), g.getP2().getPiece().getSymbol());
    }

    @Test
    public void testConstructors() {

        // Gomoku
        GomokuGame g1 = new GomokuGame();
        AbstractBoard b1 = new GomokuBoard();
        Player p1 = new Player("x");
        Player p2 = new Player("o");

        testGame(g1, b1, p1, p2);

        // Connect4
        Connect4Game g2 = new Connect4Game();
        Connect4Board b2 = new Connect4Board();

        testGame(g2, b2, p1, p2);
    }

    @Test
    public void testScanForPiece() {
    }
}
