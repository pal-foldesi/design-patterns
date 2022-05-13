package structural.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecoratorTest {

    @Test
    void fliesAsExpected1() {
        Aircraft aircraft = new BasicDrone();
        aircraft = new StealthDrone(aircraft);
        aircraft = new CargoDrone(aircraft);
        String expected = """
                Just simple flying...
                Flying with active sensors off, optics only
                Flying faster for quick delivery...""";
        String actual = aircraft.fly();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fliesAsExpected2() {
        Aircraft aircraft = new BasicDrone();
        aircraft = new StealthDrone(aircraft);
        aircraft = new CombatDrone(aircraft);
        String expected = """
                Just simple flying...
                Flying with active sensors off, optics only
                Flying aggressively, deterring enemies""";
        String actual = aircraft.fly();
        assertThat(actual).isEqualTo(expected);
    }
}
