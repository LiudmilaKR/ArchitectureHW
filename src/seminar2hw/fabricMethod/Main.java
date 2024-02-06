package seminar2hw.fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<GenerateGameHero> gameHeroList = new ArrayList<>();
        gameHeroList.add(new GenerateDruid());
        gameHeroList.add(new GenerateWarrior());

        for (int i = 0; i < 11; i++) {
            int index = (int) (Math.random() * gameHeroList.size());
            gameHeroList.get(index).createGameHero().action();
        }
    }
}
