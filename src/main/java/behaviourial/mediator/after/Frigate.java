package behaviourial.mediator.after;

public class Frigate extends Ship {
    public Frigate(ShipTrafficControl control, String name, double latitude, double longitude) {
        super(control, name, latitude, longitude);
    }

    public void moveTo(double latitude, double longitude) {
        control.moveTo(this, latitude, longitude);
    }
}
