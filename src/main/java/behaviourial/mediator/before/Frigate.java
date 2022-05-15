package behaviourial.mediator.before;

public class Frigate extends Ship {

    private Tanker tanker;

    private FishingBoat boat;


    public Frigate(String name, double latitude, double longitude) {
        super(name, latitude, longitude);
    }

    public void setTanker(Tanker tanker) {
        this.tanker = tanker;
    }

    public void setBoat(FishingBoat boat) {
        this.boat = boat;
    }

    public void moveTo(double latitude, double longitude) {
        if (!tanker.isAt(latitude, longitude) && !boat.isAt(latitude, longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
}
