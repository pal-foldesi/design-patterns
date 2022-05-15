package behaviourial.mediator.before;

public class Tanker extends Ship {
    private Frigate frigate;
    private FishingBoat boat;

    public Tanker(String name, double latitude, double longitude) {
        super(name, latitude, longitude);
    }

    public void setFrigate(Frigate frigate) {
        this.frigate = frigate;
    }

    public void setBoat(FishingBoat boat) {
        this.boat = boat;
    }

    public void moveTo(double latitude, double longitude) {
        if (!frigate.isAt(latitude, longitude) && !boat.isAt(latitude, longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
}
