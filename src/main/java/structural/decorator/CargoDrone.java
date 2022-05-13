package structural.decorator;

public class CargoDrone extends DroneDecorator {
    public CargoDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public String fly() {
        return super.fly() + "\n" + "Flying faster for quick delivery...";
    }
}
