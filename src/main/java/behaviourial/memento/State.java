package behaviourial.memento;

import java.util.Objects;

public class State {
    private final String name;
    private final String email;

    public State(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return name.equals(state.name) && email.equals(state.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
