package behaviourial.mediator.after;

public abstract class Ship {
    double latitude;
    ShipTrafficControl control;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    double longitude;
    private String name;

    public Ship(ShipTrafficControl control, String name, double latitude, double longitude) {
        this.control = control;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public boolean isAt(double latitude, double longitude) {
        return this.latitude == latitude && this.longitude == longitude;
    }

    abstract void moveTo(double latitude, double longitude);

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
