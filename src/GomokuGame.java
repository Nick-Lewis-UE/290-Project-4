public class GomokuGame extends AbstractGame {

    public GomokuGame() {
        this.board = new GomokuBoard();
        this.p1 = new Player("x");
        this.p2 = new Player("o");
    }
}
