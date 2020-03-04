import java.util.Scanner;

public class GomokuGame extends AbstractGame {

    public GomokuGame() {
        this.setBoard(new GomokuBoard());
        this.setP1(new Player("x"));
        this.setP2(new Player("o"));
    }

    @Override
    public int scanForPiece(){
        Scanner scan = new Scanner(System.in);
        String letter = scan.next().toUpperCase();
        int num1 = (int)letter.charAt(0)-64;
        int num2 = scan.nextInt()-1;

        if(num1 > getBoard().getNum_col() || num2 > getBoard().getNum_row()) {
            System.out.println("Out of bounds. Try again.");
            return scanForPiece();
        }

//        System.out.println(num_equivalent);
        return num2*getBoard().getNum_col()+num1-1;
    }
}
