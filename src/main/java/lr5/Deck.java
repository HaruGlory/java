package lr5;

public class Deck extends GameDeck {
    public Deck(Boolean isFilled) {
        if (isFilled) {
            for (Suits suit: Suits.values()) {
                for (Cards card: Cards.values()) {
                    playingCards.add(new PlayingCard(suit, card));
                }
            }
        }
    }

}
