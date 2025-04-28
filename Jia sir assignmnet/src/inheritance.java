class Animal {
    protected String type = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Bird extends Animal {
    void sing() {
        System.out.println(type + " is singing!");
    }
}

public class inheritance
{
    public static void main(String[] args) {
        Bird b = new Bird();
        b.display();
        b.sing();
    }
}
