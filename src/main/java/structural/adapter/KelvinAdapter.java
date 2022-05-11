package structural.adapter;

public class KelvinAdapter implements TemperatureSensorAdapter {
    private final TemperatureSensor sensor;

    public KelvinAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public double getTemperature() {
        return this.sensor.getTemperature() + 273.15;
    }
}
