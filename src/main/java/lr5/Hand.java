package lr5;

import java.util.Random;

abstract public class Hand {
    protected GameDeck gameDeck = new Deck(Boolean.FALSE);
    private final Random generator = new Random();

    abstract void decide(GameDeck filledDeck);

    protected void showCurrentHand(String className) {
        System.out.printf("%s's На руке: %s\n", className, gameDeck.playingCards);
    }

    protected void takeCard(GameDeck filledDeck) {
        int cardIndex = generator.nextInt(filledDeck.playingCards.size());

        gameDeck.playingCards.add(filledDeck.playingCards.get(cardIndex));
        dropCard(filledDeck, cardIndex);
    }

    protected void dropCard(GameDeck filledDeck, int cardIndex) {
        filledDeck.playingCards.remove(cardIndex);
    }

    protected void init(String className, GameDeck filledDeck) {
        System.out.printf("\n%s за столом, игра начинается\n\n", className);
        takeCard(filledDeck);
        takeCard(filledDeck);
    }

    protected int countPoints() {
        int sum = 0;
        for (int i = 0; i < gameDeck.playingCards.size(); i++) {
            sum += gameDeck.playingCards.get(i).cards.points;
        }
        return sum;
    }

    protected boolean checkOverflow(int border) {
        int points = countPoints();
        return points > border;
    }
}