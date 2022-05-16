package behaviourial.memento;

public class Originator {
    private State state;

    public void setState(State state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public State getCurrentState() {
        return this.state;
    }

    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    public void restore(Memento m) {
        state = m.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}