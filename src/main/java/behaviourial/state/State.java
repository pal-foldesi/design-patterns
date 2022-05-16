package behaviourial.state;

public abstract class State {
    protected Thermometer thermometer;

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    abstract void measure();
    abstract void idle();
    abstract void ready();

}
