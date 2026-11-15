package rpg;

import java.util.Random;

public class Warrior extends Hero {

    private final Random random = new Random();

    public Warrior(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = getStrength();
        if (random.nextInt(4) == 0) {
            damage = damage * 2;
            System.out.println("\nKRYTYK!");
        }
        target.takeDamage(damage);
        System.out.println(
                this.getName() + " atakuje " + target.getName() + " za " + damage + " obrażeń!");
    }

}
