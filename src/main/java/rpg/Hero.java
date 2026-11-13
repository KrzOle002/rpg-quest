package rpg;

/**
 * ETAP 1 — Twoja pierwsza klasa.
 * <p>
 * Klasa to "przepis" na obiekt. Hero opisuje, co KAŻDY bohater ma (pola) i co KAŻDY bohater umie
 * (metody). Konkretny bohater, np. "Aragorn", to obiekt stworzony z tego przepisu: new
 * Hero("Aragorn", 100, 12).
 * <p>
 * Wszystko, co masz zrobić, opisuje README.md (sekcja "Etap 1").
 */
public class Hero {

  private final String name;
  private int lifePoints;
  private final int strength;
  private final int maxLifePoints;

  public Hero(String name, int lifePoints, int strength) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Nieprawidłowa nazwa bohatera");
    }
    if (lifePoints <= 0) {
      throw new IllegalArgumentException("Poziom życia nie może być ujemny:" + lifePoints);
    }
    if (strength <= 0) {
      throw new IllegalArgumentException("Siła nie może być ujemna:" + strength);
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

  public void attack(Hero target) {
    target.takeDamage(strength);
    System.out.println(
        this.getName() + " atakuje " + target.getName() + " za " + strength + " obrażeń!");
  }

  public void heal(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Dodatkowe życie nie może być ujemne");
    }
    lifePoints = Math.max(maxLifePoints, lifePoints + amount);
  }

  public String getName() {
    return this.name;
  }

  public int getLifePoints() {
    return this.lifePoints;
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
