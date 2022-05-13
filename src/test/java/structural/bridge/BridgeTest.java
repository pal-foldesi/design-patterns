package structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class BridgeTest {

    @Test
    void canMoveAHelicopterWithATurbineEngine() {
        assertDoesNotThrow(() -> {
            Vehicle helicopter = new Helicopter(new TurbineEngine());
            helicopter.move();
        });
    }

    @Test
    void canMoveACarWithAnInlineEngine() {
        assertDoesNotThrow(() -> {
            Vehicle car = new Car(new ReciprocatingEngine());
            car.move();
        });
    }
}
