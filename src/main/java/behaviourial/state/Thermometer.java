package behaviourial.state;

public class Thermometer {
    private State state = new ReadyState();

    public State getState() {
        return state;
    }

    void changeState(State state) {
        this.state = state;
    }

    void measure() {
        state.measure();
    }

    void idle() {
        state.idle();
    }

    void ready() {
        state.ready();
    }
}
