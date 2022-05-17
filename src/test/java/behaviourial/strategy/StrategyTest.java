package behaviourial.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StrategyTest {

    @Test
    void canApplyEveryNthItemFreeStrategy() {
        Pricer pricer = new Pricer();
        pricer.setStrategy(new EveryNthFree(2));
        List<LineItem> items = List.of(new LineItem(BigDecimal.valueOf(62)), new LineItem(BigDecimal.valueOf(28)),
                new LineItem(BigDecimal.valueOf(132)));
        BigDecimal expectedPrice = BigDecimal.valueOf(194);
        BigDecimal actualPrice = pricer.executeStrategy(items);
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void canApplyPercentageOffStrategy() {
        Pricer pricer = new Pricer();
        pricer.setStrategy(new PercentageOff(BigDecimal.valueOf(0.72)));
        List<LineItem> items = List.of(new LineItem(BigDecimal.valueOf(62)), new LineItem(BigDecimal.valueOf(28)),
                new LineItem(BigDecimal.valueOf(132)));
        BigDecimal expectedPrice = BigDecimal.valueOf(62.16);
        BigDecimal actualPrice = pricer.executeStrategy(items);
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }
}
