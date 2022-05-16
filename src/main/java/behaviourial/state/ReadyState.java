package behaviourial.state;

public class ReadyState extends State {
    void measure() {
        thermometer.changeState(new MeasuringState());
    }

    @Override
    void idle() {
        // deliberately omitted
    }

    @Override
    void ready() {
        System.out.println("Ready to measure...");
        measure();
    }
}
