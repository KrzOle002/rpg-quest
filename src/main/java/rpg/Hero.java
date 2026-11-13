package rpg;

import java.util.HashMap;
import java.util.Map;

public class Hero extends Character {

    private int experience = 0;
    private final Map<String, Integer> inventory = new HashMap<>();


    public Hero(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    public void gainExperience(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Otrzymane doświadczenie nie może być ujemne");
        }
        experience = experience + amount;

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
        } else {
            System.out.println("\n" + monster.getName() + " pokonuje " + this.getName());
            System.out.println("\n Przegrana!");
        }
    }

    void addItem(String name, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Przedmioty nie mogą być ujemne");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nieprawidłowa nazwa przedmiotu");
        }
        if (inventory.containsKey(name)) {
            inventory.merge(name, count, Integer::sum);
        } else {
            inventory.put(name, count);
        }
    }

    void useItem(String name) {
        if (inventory.containsKey(name)) {
            switch (name) {
                case "Mikstura":
                    this.heal(30);
                    System.out.println("\nUleczono " + this.getName() + " do poziomu " + this.getLifePoints());
                    break;
                default:
                    break;
            }
            inventory.merge(name, -1, Integer::sum);
        } else {
            throw new IllegalArgumentException("Nie ma takiego przedmiotu w ekwipunku");
        }
    }


    @Override
    public String toString() {
        return super.toString() + " XP: " + this.experience;
    }
}
