package behaviourial.state;

public class IdleState extends State {
    void measure() {
        // deliberately omitted
    }

    @Override
    void idle() {
        System.out.println("Idling until needed again...");
        ready();
    }

    @Override
    void ready() {
        thermometer.changeState(new ReadyState());
    }
}
