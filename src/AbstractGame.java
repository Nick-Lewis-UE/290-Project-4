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
        Boolean win;
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
            win = board.justWon(p1, loc[0], loc[1]);
            if (win) break;
//
//            System.out.println("Player 2's turn!");
//
//            coordinate = scanForPiece();
//            gridIndex = (coordinate[1]-1)*getBoard().getNum_col()+coordinate[0]-1;
//            this.board.addPiece(p1.getPiece(), gridIndex);
//            this.board.printBoard();
//            win = board.justWon(gridIndex);
//            if (win) break;
        }
    }

    public int[] scanForPiece() {
        Scanner scan = new Scanner(System.in);
        int col = Character.getNumericValue(scan.next().charAt(0));
        int row = Character.getNumericValue(scan.next().charAt(0));
//        System.out.println(num1 + " " + num2);

//        if(this.board.validMove(index)) {
//            System.out.println("Out of bounds. Try again.");
//            return scanForPiece();
//        }

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
