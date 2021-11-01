package flyweight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CupFactoryTest {

    @Test
    void repeatedCallsReturnSameCup() {
        // given
        CupFactory theFactory = new CupFactory();
        Cup firstCup = theFactory.getFactoryCup("Oxford");
        firstCup.fill("a sad cactus");

        // when
        Cup secondCup = theFactory.getFactoryCup("Oxford");
        secondCup.fill("cocoa");

        //then
        assertThat(secondCup).isEqualTo(firstCup);
    }
}
