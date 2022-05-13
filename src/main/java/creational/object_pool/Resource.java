package creational.object_pool;

public class Resource {
    private State state;

    public Resource() {
        state = State.AVAILABLE;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void reset() {
        state = State.AVAILABLE;
    }
}