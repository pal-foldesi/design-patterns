package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EagerInitSingletonTest {

    @Test
    void repeatedCallsReturnSameInstance() {
        EagerInitSingleton anInstance = EagerInitSingleton.getInstance();
        EagerInitSingleton anotherInstance = EagerInitSingleton.getInstance();

        assertThat(anotherInstance).isEqualTo(anInstance);
    }
}
