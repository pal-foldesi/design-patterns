package behaviourial.mediator.after;

import java.util.List;

public class DefaultShipTrafficControl implements ShipTrafficControl {
    private final List<Ship> ships;

    public DefaultShipTrafficControl(List<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public boolean isOccupied(double latitude, double longitude) {
        return ships.stream().anyMatch(ship -> ship.getLatitude() == latitude && ship.getLongitude() == longitude);
    }

    @Override
    public void moveTo(Ship ship, double latitude, double longitude) {
        if (!isOccupied(latitude, longitude)) {
            ship.setLatitude(latitude);
            ship.setLongitude(longitude);
        }
    }
}
