package behaviourial.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private final Deque<Memento> mementos = new ArrayDeque<>();

    public void addMemento(Memento m) {
        mementos.push(m);
    }

    public Memento getMemento() {
        return mementos.pop();
    }
}