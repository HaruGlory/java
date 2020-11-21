package lr5;

import java.util.Scanner;

public class Player extends Hand {

    @Override
    void decide(GameDeck filledDeck) {
        while (askForNextCard()) {
            takeCard(filledDeck);
            showCurrentHand(this.getClass().getSimpleName());
            if(checkOverflow(21)) break;
        }
    }

    private boolean askForNextCard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Хотите взять ещё одну карту? [Y/N]");
        return input.hasNextLine() && (input.nextLine().toLowerCase().equals("y"));
    }
}