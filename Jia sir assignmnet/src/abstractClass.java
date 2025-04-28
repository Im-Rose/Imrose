abstract class Creature {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Creature {
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}