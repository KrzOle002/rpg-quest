package rpg;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {

    private final List<Monster> monsterList = new ArrayList<>();
    private int defeatedMonsters;

    public void addMonster(Monster m) {
        monsterList.add(m);
    }

    public void explore(Hero hero) {
        for (Monster monster : monsterList) {
            if (!monster.isAlive()) {
                continue;
            }
            hero.fight(monster);
            if (!hero.isAlive()) {
                System.out.println("\n Przegrana!");
                break;
            }
            if (hero.getLifePoints() <= hero.getMaxLifePoints() / 2) {
                hero.useItem("Mikstura");
            }
            defeatedMonsters++;
        }
        System.out.println("\nPokonałeś " + defeatedMonsters + " potworów");
    }

    public void explore(List<Hero> party) {
        for (Hero hero : party) {
            System.out.println("\n>>> Do walki rusza " + hero.getName());
            explore(hero);
            if (hero.isAlive()) {
                break;
            }
        }
    }

}
