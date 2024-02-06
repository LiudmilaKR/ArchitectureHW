package seminar2hw.fabricMethod;

public class GenerateWarrior implements GenerateGameHero {

    @Override
    public GameHero createGameHero() {
        return new Warrior();
    }
}
