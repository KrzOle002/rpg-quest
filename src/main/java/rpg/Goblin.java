package rpg;

import java.util.Random;

public class Goblin extends Monster {

    private final Random random = new Random();

    public Goblin(String name, int lifePoints, int strength, int experienceReward) {
        super(name, lifePoints, strength, experienceReward);
    }

    @Override
    public void takeDamage(int amount) {
        int damage = amount;
        if (random.nextDouble() < 0.3) {
            damage = 0;
            System.out.println("\n" + this.getName() + " uniknął ataku!");
        }
        super.takeDamage(damage);
    }
}
