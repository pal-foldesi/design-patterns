package structural.adapter;

public class CelsiusSensor implements TemperatureSensor {
    public double getTemperature() {
        return 38;
    }
}
