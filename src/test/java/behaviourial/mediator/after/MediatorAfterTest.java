package behaviourial.mediator.after;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MediatorAfterTest {

    @Test
    void canAvoidCollisionAfter() {
        List<Ship> ships = new ArrayList<>();

        ShipTrafficControl stc = new DefaultShipTrafficControl(ships);

        Frigate frigate1 = new Frigate(stc, "HNoMS Helge Ingstad (F313)", 3.41, 1.23);

        Tanker tanker = new Tanker(stc, "Sola TS", 3.22, 1.24);

        FishingBoat boat = new FishingBoat(stc, "Reel Estate 1", 3.22, 1.24);
        FishingBoat boat2 = new FishingBoat(stc, "Reel Estate 2", 3.23, 1.23);
        FishingBoat boat3 = new FishingBoat(stc, "Reel Estate 3", 3.24, 1.23);
        FishingBoat boat4 = new FishingBoat(stc, "Reel Estate 4", 3.25, 1.23);
        FishingBoat boat5 = new FishingBoat(stc, "Reel Estate 5", 3.26, 1.23);
        FishingBoat boat6 = new FishingBoat(stc, "Reel Estate 6", 3.27, 1.23);
        FishingBoat boat7 = new FishingBoat(stc, "Reel Estate 7", 3.28, 1.23);
        FishingBoat boat8 = new FishingBoat(stc, "Reel Estate 8", 3.29, 1.23);
        FishingBoat boat9 = new FishingBoat(stc, "Reel Estate 9", 3.30, 1.23);
        FishingBoat boat10 = new FishingBoat(stc, "Reel Estate 10", 3.31, 1.23);

        ships.add(frigate1);

        ships.add(tanker);

        ships.add(boat);
        ships.add(boat2);
        ships.add(boat3);
        ships.add(boat4);
        ships.add(boat5);
        ships.add(boat6);
        ships.add(boat7);
        ships.add(boat8);
        ships.add(boat9);
        ships.add(boat10);

        double originalTankerLat = tanker.getLatitude();
        double originalTankerLong = tanker.getLongitude();

        stc.moveTo(tanker, boat.getLatitude(), boat.getLongitude());

        assertThat(tanker.getLatitude()).isEqualTo(originalTankerLat);
        assertThat(tanker.getLongitude()).isEqualTo(originalTankerLong);
    }

    @Test
    void canMoveWhenNoDangerOfCollision() {
        List<Ship> ships = new ArrayList<>();

        ShipTrafficControl stc = new DefaultShipTrafficControl(ships);

        Frigate frigate1 = new Frigate(stc, "HNoMS Helge Ingstad (F313)", 3.41, 1.23);

        Tanker tanker = new Tanker(stc, "Sola TS", 3.22, 1.24);

        ships.add(frigate1);
        ships.add(tanker);

        stc.moveTo(frigate1, 2.3, 4.5);

        assertThat(frigate1.getLatitude()).isEqualTo(2.3);
        assertThat(frigate1.getLongitude()).isEqualTo(4.5);
    }
}
