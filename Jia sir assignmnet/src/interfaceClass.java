interface animal {
    void sound();
}

class dog implements animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        Dog d = new Dog();  // Create a Dog object
        d.sound();
    }
}
