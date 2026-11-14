package rpg;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Java RPG ===");

        Hero aragorn = new Hero("Aragorn", 100, 12);
        Monster goblin = new Monster("Goblin", 24, 15, 50);
        Monster ork = new Monster("Ork", 32, 15, 100);
//        Monster goblin2 = new Monster("Goblin", 24, 15, 50);
//        Monster ork3 = new Monster("Ork", 32, 15, 100);
        Dungeon dungeon = new Dungeon();

        aragorn.addItem("Mikstura", 2);

        dungeon.addMonster(goblin);
        dungeon.addMonster(ork);
//        dungeon.addMonster(goblin2);
//        dungeon.addMonster(ork3);

        dungeon.explore(aragorn);
        dungeon.explore(aragorn);
        dungeon.explore(aragorn);


        System.out.println(aragorn);
    }
}
