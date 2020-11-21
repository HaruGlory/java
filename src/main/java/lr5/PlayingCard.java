package lr5;

public class PlayingCard {
    public Suits suits;
    public Cards cards;

    public PlayingCard(Suits suits, Cards cards) {
        this.suits = suits;
        this.cards = cards;
    }

    @Override
    public String toString() {
        return cards.name + "" + suits;
    }
}
