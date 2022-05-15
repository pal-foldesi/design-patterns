package behaviourial.mediator.after;

public interface ShipTrafficControl {
    boolean isOccupied(double latitude, double longitude);

    void moveTo(Ship ship, double latitude, double longitude);
}
