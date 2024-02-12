package seminar3hw.ISP;

public class Bird implements Fly, Sound {

    @Override
    public void fly() {
        System.out.println("Птица летает.");
    }

    @Override
    public void makeSound() {
        System.out.println("Птица издает звук.");
    }
}
