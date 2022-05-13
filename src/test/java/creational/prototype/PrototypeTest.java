package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrototypeTest {

    @Test
    void canPrototypeADuck() {
        PrototypeRegistry registry = new PrototypeRegistry();
        assertDoesNotThrow(() -> registry.getNew(Duck.class));
    }

    @Test
    void cannotPrototypeAString() {
        PrototypeRegistry registry = new PrototypeRegistry();
        assertThrows(IllegalArgumentException.class, () -> registry.getNew(String.class));
    }
}
