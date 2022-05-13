package structural.decorator;

public class StealthDrone extends DroneDecorator {

    public StealthDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public String fly() {
        return super.fly() + "\n" + "Flying with active sensors off, optics only";
    }
}
