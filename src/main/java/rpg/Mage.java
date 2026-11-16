package rpg;

public class Mage extends Hero {

    private int mana = 30;
    private final int manaCapacity = 30;

    public Mage(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = getStrength();
        if (mana > 0) {
            damage = damage * 2;
            System.out.println("\nAtak magiczny!");
            mana = mana - 10;
        } else {
            damage = damage / 2;
            System.out.println("\nBrak many atak kosturem!");
        }
        target.takeDamage(damage);
        System.out.println(
                this.getName() + " atakuje " + target.getName() + " za " + damage + " obrażeń!");
    }
}
