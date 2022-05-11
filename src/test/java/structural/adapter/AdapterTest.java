package structural.adapter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdapterTest {

    @Test
    void sensorWorksAsIntended() {
        // given
        TemperatureSensor celsius = new CelsiusSensor();

        double expectedTemperature = 38;

        // when
        double actualTemperature = celsius.getTemperature();

        // then
        assertThat(actualTemperature).isEqualTo(expectedTemperature);
    }

    @Test
    void adapterWorksAsIntended() {
        // given
        TemperatureSensor celsius = new CelsiusSensor();
        TemperatureSensorAdapter adapter = new KelvinAdapter(celsius);

        double expectedTemperature = celsius.getTemperature() + 273.15;

        // when
        double actualTemperature = adapter.getTemperature();

        // then
        assertThat(actualTemperature).isEqualTo(expectedTemperature);
    }
}
