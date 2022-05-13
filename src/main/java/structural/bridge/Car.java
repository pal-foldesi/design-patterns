package structural.bridge;

public class Car extends Vehicle {

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void move() {
        engine.generatePower();
        System.out.println("Turn wheels");
    }
}
