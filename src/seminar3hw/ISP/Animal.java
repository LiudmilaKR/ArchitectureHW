package seminar3hw.ISP;

public class Animal implements Run, Sound {

    @Override
    public void run() {
        System.out.println("Животное бегает.");
    }

    @Override
    public void makeSound() {
        System.out.println("Животное издает звук.");
    }
}
