package design;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int numberOfDice;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    int rollDice() {
        return ThreadLocalRandom.current().nextInt(1 * numberOfDice, 6 * numberOfDice + 1);
    }
}
