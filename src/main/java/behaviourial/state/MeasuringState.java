package behaviourial.state;

public class MeasuringState extends State {
    void measure() {
        System.out.println("Measuring temp...");
        idle();
    }

    @Override
    void idle() {
        thermometer.changeState(new IdleState());
    }

    @Override
    void ready() {
        // deliberately omitted
    }
}
