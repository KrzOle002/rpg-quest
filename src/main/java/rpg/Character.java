package rpg;

class Character {
    private final String name;
    private int lifePoints;
    private final int strength;
    private final int maxLifePoints;

    public Character(String name, int lifePoints, int strength) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nieprawidłowa nazwa postaci");
        }
        if (lifePoints <= 0) {
            throw new IllegalArgumentException("Poziom życia nie może być ujemny: " + lifePoints);
        }
        if (strength <= 0) {
            throw new IllegalArgumentException("Siła musi być większa od zera: " + strength);
        }

        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
        this.maxLifePoints = lifePoints;
    }

    public boolean isAlive() {
        return this.lifePoints > 0;
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Obrażenia nie mogą być ujemne");
        }
        lifePoints = Math.max(0, lifePoints - amount);
    }

    public void attack(Character target) {
        target.takeDamage(strength);
        System.out.println(
                this.getName() + " atakuje " + target.getName() + " za " + strength + " obrażeń!");
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Dodatkowe życie nie może być ujemne");
        }
        if (amount >= maxLifePoints) {
            lifePoints = maxLifePoints;
        } else {
            lifePoints = Math.min(lifePoints + amount, maxLifePoints);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getMaxLifePoints() {
        return this.maxLifePoints;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public String toString() {

        return this.getName() + " [HP " + this.getLifePoints() + "/" + this.maxLifePoints + ", STR "
                + this.getStrength() + "]";
    }
}
