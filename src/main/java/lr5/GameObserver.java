package lr5;

import java.util.ArrayList;
import java.util.List;

public class GameObserver {
    List<Hand> list = new ArrayList<>();
    GameDeck filledDeck = new Deck(Boolean.TRUE);

    public void sitAtTheTable(Hand hand) {
        list.add(hand);
    }

    public void getUpFromTheTable(Hand hand) {
        list.remove(hand);
    }

    public void startGame() {
        list.forEach(item -> item.init(item.getClass().getSimpleName(), filledDeck));
        showHand();
        handDecide();
    }

    public void showHand() {
        list.forEach(item -> {
            if (item instanceof Player) {
                item.showCurrentHand(item.getClass().getSimpleName());
            }
        });
    }

    public void handDecide() {
        list.forEach(item -> item.decide(filledDeck));
        getGameResult();
    }

    public void getGameResult() {
        System.out.println("<--------- Игра оконченв | Результаты: --------->\n");
        list.forEach(item -> {
            item.showCurrentHand(item.getClass().getSimpleName());
            System.out.printf("%s's Колличество очков: %d\n", item.getClass().getSimpleName(), item.countPoints());
        });
    }
}
