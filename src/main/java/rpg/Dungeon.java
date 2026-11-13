package rpg;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {

    final List<Monster> monsterList = new ArrayList<>();

    public Dungeon(){

    }

    public void addMonster(Monster m) {
        monsterList.add(m);
    }
    public void explore(Hero hero) {
        monsterList.forEach((monster) -> {
            hero.fight(monster);
            if(hero.getLifePoints() <= hero.getMaxLifePoints()/2) {
                hero.useItem("Mikstura");
            }
        });
    }

}
