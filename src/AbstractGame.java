import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.Scanner;

public abstract class AbstractGame {

    public AbstractGame() {
    }

    private AbstractBoard board;
    private Player p1;
    private Player p2;

    public void play() {
        int winningPlayer = 1;
        while (true) {
            Scanner scan = new Scanner(System.in);
            int[] loc;
//            int gridIndex;
//
            System.out.println("Player 1's turn!");
//
            loc = scanForPiece();
            this.board.addPiece(p1.getPiece(), loc[1], loc[0]);
            this.board.printBoard();
            if (board.justWon(p1, loc[0], loc[1])) {
                winningPlayer = 0;
                break;
            }
//
            System.out.println("Player 2's turn!");

            loc = scanForPiece();
            this.board.addPiece(p2.getPiece(), loc[1], loc[0]);
            this.board.printBoard();
            if (board.justWon(p2, loc[0], loc[1])) {
                winningPlayer = 1;
                break;
            }
        }

        String[] winMessage = new String[2];
        winMessage[0] = "Player 1";
        winMessage[1] = "Player 2";
        System.out.println("Congratulations, " + winMessage[winningPlayer] +
                "! You won!");

    }

    public int[] scanForPiece() {
        Scanner scan = new Scanner(System.in);
        int col = Character.getNumericValue(scan.next().charAt(0));
        int row = Character.getNumericValue(scan.next().charAt(0));

        int[] coordinate = new int[2];
        coordinate[0] = col;
        coordinate[1] = row;
        return coordinate;
    }

    public AbstractBoard getBoard() {
        return board;
    }

    public void setBoard(AbstractBoard board) {
        this.board = board;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }
}
