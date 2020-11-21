package lr5;

import java.util.ArrayList;
import java.util.List;

abstract class GameDeck {
   List<PlayingCard> playingCards;

   public GameDeck() {
       this.playingCards = new ArrayList<>();
   }
}