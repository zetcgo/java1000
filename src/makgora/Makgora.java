package makgora;

import java.util.Random;

public class Makgora {
    public static void main(String[] args) {
        System.out.println("=== Here comes the new challengers ===");
        Hero warrior = new Hero("Garrosh", 30);
        Hero shaman = new Hero("Thrall", 30);
        System.out.println(warrior);
        System.out.println(shaman);

        System.out.println("=== Ready? FIGHT! ===");
        Random random = new Random();
        while (warrior.health > 0 && shaman.health > 0) {
            Hero attacker = random.nextBoolean() ? warrior : shaman;
            Hero victim = attacker == warrior ? shaman : warrior;
            System.out.printf("%s punches %s!\n", attacker.profile(), victim.profile());

            int damage = attacker.punch(victim);
            System.out.printf("Thud! %d damage to %s\n", damage, victim.profile());
        }

        System.out.println("=== GAME! ===");
        Hero winner = warrior.health > 0 ? warrior : shaman;
        Hero defeated = warrior.health > 0 ? shaman : warrior;
        System.out.printf("%s defeated %s\n", winner.profile(), defeated.profile());
        System.out.printf("The winner is %s!!", winner);
    }
}
