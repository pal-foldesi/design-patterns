package behaviourial.mediator.before;

public class FishingBoat extends Ship {
    private Frigate frigate;
    private Tanker tanker;

    public FishingBoat(String name, double latitude, double longitude) {
        super(name, latitude, longitude);
    }

    public void setFrigate(Frigate frigate) {
        this.frigate = frigate;
    }

    public void setTanker(Tanker tanker) {
        this.tanker = tanker;
    }

    public void moveTo(double latitude, double longitude) {
        if (!frigate.isAt(latitude, longitude) && !tanker.isAt(latitude, longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
}
