package rpg;

public class Troll extends Monster {
    public Troll(String name, int lifePoints, int strength, int experienceReward) {
        super(name, lifePoints, strength, experienceReward);
    }

    @Override
    public void attack(GameCharacter target) {
        super.attack(target);
        super.heal(5);
        System.out.println( this.getName() + " leczy się za 5 HP" );
    }
}
