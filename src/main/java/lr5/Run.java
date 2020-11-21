package lr5;

public class Run {
    public static void main(String[] args) {
        GameObserver gameObserver = new GameObserver();
        Hand player = new Player();
        Hand dealer = new Dealer();

        gameObserver.sitAtTheTable(player);
        gameObserver.sitAtTheTable(dealer);
        gameObserver.startGame();
    }
}
