import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BoardTest {
    private void testBoard(AbstractBoard b, ArrayList<ArrayList<Piece>> grid) {
        Assert.assertTrue(grid.equals(b.getGrid()));

    }

    @Test
    public void testConstructors() {
        // Gomoku

        // testing empty constructor
        GomokuBoard b1 = new GomokuBoard();
        testBoard(b1, new ArrayList<ArrayList<Piece>>() );

        // Connect4
        Connect4Board b2 = new Connect4Board();
        testBoard(b2, new ArrayList<ArrayList<Piece>>());
    }
}
