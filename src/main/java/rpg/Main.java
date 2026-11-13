package rpg;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Java RPG ===");

        Hero aragorn = new Hero("Aragorn", 100, 12);
        Monster goblin = new Monster("Goblin", 24, 3, 50);
        Monster ork = new Monster("Ork", 32, 8, 100);

        aragorn.fight(goblin);

        aragorn.heal(Integer.MAX_VALUE);

        aragorn.fight(ork);

        System.out.println(aragorn);
    }
}
