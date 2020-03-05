import java.util.Scanner;

public class GomokuGame extends AbstractGame {

    public GomokuGame() {
        this.setBoard(new GomokuBoard());
        this.setP1(new Player("x"));
        this.setP2(new Player("o"));
    }

    @Override
    public int[] scanForPiece(){
        int[] loc = new int[2];
        Scanner scan = new Scanner(System.in);
        String letter = scan.next().toUpperCase();
        loc[0] = (int)letter.charAt(0)-64;
        loc[1] = scan.nextInt();

//        if(num1 > getBoard().getNum_col() || num2 > getBoard().getNum_row()) {
//            System.out.println("Out of bounds. Try again.");
//            return scanForPiece();
//        }

//        System.out.println(num_equivalent);
        return loc;

    }
}
