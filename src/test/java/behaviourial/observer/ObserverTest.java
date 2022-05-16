package behaviourial.observer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ObserverTest {

    @Test
    void canObserve() {
        assertDoesNotThrow(() -> {
            Subject subject = new Subject();
            List<Observer> observers = List.of(new LighthouseGuard(subject), new PortAuthority(subject),
                    new Passenger(subject));
            observers.forEach(subject::add);
            subject.setLatest(new Ship("HMS Erebus"));
        });
    }
}
