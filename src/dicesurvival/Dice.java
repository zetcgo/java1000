package dicesurvival;

import java.util.Random;

class Dice {
    String name;
    int boundNumber;
    int topNumber;
    boolean isRolled;

    Dice(String name, int boundNumber) {
        this.name = name;
        this.boundNumber = boundNumber;
        this.isRolled = false;
    }

    @Override
    public String toString() {
        String rollStatus = isRolled ? String.format("topNumber=%d", topNumber) : "?";
        return String.format("%s[name=%s,boundNumber=%d,%s]", super.toString(), name, boundNumber, rollStatus);
    }

    public void roll() {
        Random random = new Random();
        isRolled = true;
        topNumber = random.nextInt(boundNumber) + 1;
    }
}
