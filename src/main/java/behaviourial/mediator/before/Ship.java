package behaviourial.mediator.before;

public abstract class Ship {
    double latitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    double longitude;
    private final String name;

    public Ship(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    boolean isAt(double latitude, double longitude) {
        return this.latitude == latitude && this.longitude == longitude;
    }

    abstract void moveTo(double latitude, double longitude);
}
