public class Game {

    Player player1;
    Player player2;


    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        player1 = new Player("one");
        player2 = new Player("two");
    }


}
