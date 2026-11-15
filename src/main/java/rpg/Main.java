package rpg;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Java RPG ===");

        Hero aragorn = new Warrior("Aragorn", 100, 12);
        Hero gandalf = new Mage("Gandalf", 100, 12);

        Goblin goblin = new Goblin("Goblin", 24, 15, 50);
        Monster goblin2 = new Goblin("Goblin", 24, 15, 50);
        Troll troll = new Troll("Troll", 32, 15, 75);
        Monster troll2 = new Troll("Troll", 32, 15, 75);

        Dungeon dungeon = new Dungeon();

        aragorn.addItem("Mikstura", 2);
        aragorn.addItem("Mikstura");

        dungeon.addMonster(goblin);
        dungeon.addMonster(troll);
        dungeon.addMonster(goblin2);
        dungeon.addMonster(troll2);

        dungeon.explore(aragorn);

        System.out.println(aragorn);
    }
}
