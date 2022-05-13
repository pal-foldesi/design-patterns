package structural.decorator;

public abstract class DroneDecorator implements Aircraft {
    private final Aircraft aircraft;

    public DroneDecorator(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String fly() {
        return this.aircraft.fly();
    }
}
