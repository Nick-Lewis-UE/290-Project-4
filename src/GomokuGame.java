public class GomokuGame extends AbstractGame {

    public GomokuGame() {
        this.setBoard(new GomokuBoard());
        this.setP1(new Player("x"));
        this.setP2(new Player("o"));
    }
}
