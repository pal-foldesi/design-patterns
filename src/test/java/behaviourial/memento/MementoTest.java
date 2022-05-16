package behaviourial.memento;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MementoTest {

    @Test
    void canRestoreState() {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        State state = new State("Charles Dickens", "charles@dicke.ns");
        originator.setState(state);
        State state2 = new State("Charles Dickens", "charles.dickens@gmail.com");
        originator.setState(state2);
        caretaker.addMemento(originator.save());
        State state3 = new State("Charles Dickens", "charles@dickens.org");
        originator.setState(state3);
        caretaker.addMemento(originator.save());
        State state4 = new State("Charles Dickens", "chas@dickens.org");
        originator.setState(state4);
        originator.restore(caretaker.getMemento());

        State expectedState = new State("Charles Dickens", "charles@dickens.org");
        State actualState = originator.getCurrentState();

        assertThat(actualState).isEqualTo(expectedState);
    }
}
