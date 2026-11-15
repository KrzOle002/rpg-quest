package rpg;

import java.util.Random;

public class Warrior extends Hero {

    private final Random random = new Random();

    public Warrior(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    @Override
    public void attack(GameCharacter target) {
        int chance = random.nextInt(4);
        target.takeDamage(chance == 0 ? this.getStrength() * 2 : this.getStrength());
        System.out.println("\nKRYTYK!");
    }

}
