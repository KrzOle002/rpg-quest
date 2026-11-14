package rpg;

public class Monster extends GameCharacter {

    private final int experienceReward;

    public Monster(String name, int lifePoints, int strength, int experienceReward) {
        super(name, lifePoints, strength);
        this.experienceReward = experienceReward;
    }

    public int getExperienceReward() {
        return experienceReward;
    }

    @Override
    public String toString() {
        return super.toString() + "Nagroda: " + this.experienceReward + " XP";
    }
}
