class Bike {
    String brand;
    int speed;

    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class objectClasses extends Bike {
    public static void main(String[] args) {
        Bike myBike = new Bike(); // object creation
        myBike.brand = "Yamaha";
        myBike.speed = 80;
        myBike.ride();
    }
}
