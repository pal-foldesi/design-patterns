package behaviourial.mediator.after;

public class Tanker extends Ship {
    public Tanker(ShipTrafficControl control, String name, double latitude, double longitude) {
        super(control, name, latitude, longitude);
    }

    public void moveTo(double latitude, double longitude) {
        control.moveTo(this, latitude, longitude);
    }
}
