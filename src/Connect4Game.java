public class Connect4Game extends AbstractGame{

    public Connect4Game() {
        this.setBoard(new Connect4Board());
        this.setP1(new Player("x"));
        this.setP2(new Player("o"));
    }
}
