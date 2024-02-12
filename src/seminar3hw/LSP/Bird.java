package seminar3hw.LSP;

public class Bird extends Animal {

    private int speedFly;

    public Bird(int speedFly) {
        this.speedFly = Bird.this.speedFly;
    }

    @Override
    int speed() {
        return speedFly;
    }
}
