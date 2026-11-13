package rpg;

/**
 * ETAP 1 — Twoja pierwsza klasa.
 *
 * Klasa to "przepis" na obiekt. Hero opisuje, co KAŻDY bohater ma (pola)
 * i co KAŻDY bohater umie (metody). Konkretny bohater, np. "Aragorn",
 * to obiekt stworzony z tego przepisu: new Hero("Aragorn", 100, 12).
 *
 * Wszystko, co masz zrobić, opisuje README.md (sekcja "Etap 1").
 */
public class Hero {

  String name;
  int lifePoints;
  int strength;

  public Hero(String name,int lifePoints, int strenght) {
    this.name = name;
    this.lifePoints = lifePoints;
    this.strength = strenght;
  }

  boolean isAlive() {
    return this.lifePoints > 0;
  }

  void takeDamage(int amount) {
    this.lifePoints = this.lifePoints - amount;
  }

  void attack(Hero target) {
    target.takeDamage(strength);
    System.out.println(this.getName() + " atakuje " + target.getName() + " za " + strength + " obrażeń!");
  }

  String getName() {
    return this.name;
  }
}
