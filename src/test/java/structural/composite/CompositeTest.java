package structural.composite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CompositeTest {

    @Test
    void canGetNames() {
        Backpack pack = new Backpack("Robert's backpack", List.of(new Wallet("Robert's wallet")));

        String expectedName = "Robert's backpack\nRobert's wallet";
        String actualName = pack.getName();

        assertThat(actualName).isEqualTo(expectedName);
    }
}
