package rpg;

public class Hero extends Character {

    private int experience = 0;

    public Hero(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    public void gainExperience(int amount) {
        if (amount > 0) {
            experience = experience + amount;
        }
    }

    public void fight(Monster monster) {
        int round = 1;
        while (this.isAlive() && monster.isAlive()) {
            System.out.println("\n--- Runda " + round + " ---");
            this.attack(monster);
            if (monster.isAlive()) {
                monster.attack(this);
            }
            System.out.println(this);
            System.out.println(monster);

            round++;
        }
        if (this.isAlive()) {
            this.gainExperience(monster.getExperienceReward());
            System.out.println("\n" + this.getName() + " pokonuje " + monster.getName());
        }
    }


    @Override
    public String toString() {
        return super.toString() + " XP: " + this.experience;
    }
}
