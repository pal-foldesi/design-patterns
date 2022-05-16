package behaviourial.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StateTest {

    @Test
    void canGoFromReadyToMeasuring() {
        Thermometer thermometer = new Thermometer();

        State stateBefore = new ReadyState();

        stateBefore.setThermometer(thermometer);

        thermometer.changeState(stateBefore);

        thermometer.measure();

        State actualState = thermometer.getState();

        assertThat(actualState).isInstanceOf(MeasuringState.class);
    }

    @Test
    void canGoFromMeasuringToIdle() {
        Thermometer thermometer = new Thermometer();

        State stateBefore = new MeasuringState();

        stateBefore.setThermometer(thermometer);

        thermometer.changeState(stateBefore);

        thermometer.idle();

        State actualState = thermometer.getState();

        assertThat(actualState).isInstanceOf(IdleState.class);
    }

    @Test
    void canGoFromIdleToReady() {
        Thermometer thermometer = new Thermometer();

        State stateBefore = new IdleState();

        stateBefore.setThermometer(thermometer);

        thermometer.changeState(stateBefore);

        thermometer.ready();

        State actualState = thermometer.getState();

        assertThat(actualState).isInstanceOf(ReadyState.class);
    }
}
