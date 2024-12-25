package makgora;

import java.util.Random;

class Hero {
    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s,health=%d]", super.toString(), name, health);
    }

    public String profile() {
        return String.format("%s[%d]", name, health);
    }

    public int punch(Hero victim) {
        Random random = new Random();
        int damage = random.nextInt(1, 6);
        victim.health -= damage;
        return damage;
    }
}
