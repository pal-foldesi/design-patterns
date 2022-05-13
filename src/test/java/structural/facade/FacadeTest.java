package structural.facade;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FacadeTest {

    @Test
    void systemCanBePrimed() {
        System system = new System();
        String actual = system.prime();
        String expected = """
                Validating configuration...
                Connecting to database...
                Running diagnostics...""";
        assertThat(actual).isEqualTo(expected);
    }
}
