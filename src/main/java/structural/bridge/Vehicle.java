package structural.bridge;

public abstract class Vehicle {
    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void move();
}
