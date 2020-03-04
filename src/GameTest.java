import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GameTest {
    private void testGame(AbstractGame g, AbstractBoard b, Player p1, Player p2) {
        Assert.assertEquals(b, g.getBoard());
        Assert.assertEquals(p1, g.getP1());
        Assert.assertEquals(p2, g.getP2());
    }

    @Test
    public void testConstructors() {
        GomokuGame g1 = new GomokuGame();
        AbstractBoard b1 = new GomokuBoard();
        Player p1 = new Player("x");
        Player p2 = new Player("o");

        testGame(g1, b1, p1, p2);
    }
}
