import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public abstract class AbstractGame {
    public AbstractGame() {
    }

    private AbstractBoard board;
    private Player p1;
    private Player p2;

    public void play() {
        Boolean win = false;
        while (!win) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Player 1's turn!");

            this.board.addPiece(p1.getPiece(), scanForPiece());
            this.board.printBoard();
            break;
        }
    }

    public int scanForPiece() {
        Scanner scan = new Scanner(System.in);
        int num1 = Character.getNumericValue(scan.next().charAt(0));
        int num2 = Character.getNumericValue(scan.next().charAt(0));

//        System.out.println(num1 + " " + num2);

        if(num1 > board.getNum_col() || num2 > board.getNum_row()) {
            System.out.println("Out of bounds. Try again.");
            return scanForPiece();
        }

        return num2*this.board.getNum_col()+num2-1;
    };

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
