package behaviourial.mediator.before;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MediatorBeforeTest {

    @Test
    void canAvoidCollisionBefore() {
        double frigateOriginalLatitude = 3.41;
        double frigateOriginalLongitude = 1.23;


        Frigate frigate = new Frigate("HNoMS Helge Ingstad (F313)", frigateOriginalLatitude, frigateOriginalLongitude);
        Tanker tanker = new Tanker("Sola TS", 3.22, 1.24);
        FishingBoat boat = new FishingBoat("Reel Estate", 3.21, 1.23);

        frigate.setBoat(boat);
        frigate.setTanker(tanker);

        tanker.setFrigate(frigate);
        tanker.setBoat(boat);

        boat.setFrigate(frigate);
        boat.setTanker(tanker);

        frigate.moveTo(tanker.getLatitude(), tanker.getLongitude());

        assertThat(frigate.getLatitude()).isEqualTo(frigateOriginalLatitude);
        assertThat(frigate.getLongitude()).isEqualTo(frigateOriginalLongitude);
    }

    @Test
    void canMoveWhenNoDangerOfCollision() {
        Frigate frigate = new Frigate("HNoMS Helge Ingstad (F313)", 3.41, 1.23);
        Tanker tanker = new Tanker("Sola TS", 3.22, 1.24);
        FishingBoat boat = new FishingBoat("Reel Estate", 3.21, 1.23);

        frigate.setBoat(boat);
        frigate.setTanker(tanker);

        tanker.setFrigate(frigate);
        tanker.setBoat(boat);

        boat.setFrigate(frigate);
        boat.setTanker(tanker);

        frigate.moveTo(4.1, 3.5);

        assertThat(frigate.getLatitude()).isEqualTo(4.1);
        assertThat(frigate.getLongitude()).isEqualTo(3.5);
    }
}
