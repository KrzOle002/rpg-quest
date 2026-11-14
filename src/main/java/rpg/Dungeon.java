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
        for (Monster monster : monsterList){
            hero.fight(monster);
            if(!hero.isAlive()){
                System.out.println("\n Przegrana!");
                break;
            }
            if(hero.getLifePoints() <= hero.getMaxLifePoints()/2) {
                hero.useItem("Mikstura");
            }
        };
    }

}
