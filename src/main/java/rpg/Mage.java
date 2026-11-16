package rpg;

public class Mage extends Hero {

    private static final int SPELL_COST = 10;
    private int mana = 30;

    public Mage(String name, int lifePoints, int strength) {
        super(name, lifePoints, strength);
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = getStrength();
        if (mana >= SPELL_COST) {
            damage = damage * 2;
            System.out.println("\nAtak magiczny!");
            mana = mana - SPELL_COST;
        } else {
            damage = damage / 2;
            System.out.println("\nBrak many atak kosturem!");
        }
        target.takeDamage(damage);
        System.out.println(
                this.getName() + " atakuje " + target.getName() + " za " + damage + " obrażeń!");
    }
}
