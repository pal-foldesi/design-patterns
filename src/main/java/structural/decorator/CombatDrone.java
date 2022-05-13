package structural.decorator;

public class CombatDrone extends DroneDecorator {
    public CombatDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public String fly() {
        return super.fly() + "\n" + "Flying aggressively, deterring enemies";
    }
}
