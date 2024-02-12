package seminar3hw.LSP;

public class PetAnimal extends Animal {

    private int speedRun;

    public PetAnimal(int speedRun) {
        this.speedRun = speedRun;
    }

    @Override
    int speed() {
        return speedRun;
    }
}
