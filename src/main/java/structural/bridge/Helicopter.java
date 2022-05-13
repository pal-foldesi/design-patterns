package structural.bridge;

public class Helicopter extends Vehicle {

    public Helicopter(Engine engine) {
        super(engine);
    }

    @Override
    public void move() {
        engine.generatePower();
        System.out.println("Flap rotors");
    }
}
