package seminar2hw.fabricMethod;

public class GenerateDruid implements GenerateGameHero{

    @Override
    public GameHero createGameHero() {
        return new Druid();
    }
}
