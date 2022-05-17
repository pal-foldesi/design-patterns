package behaviourial.strategy;

import java.math.BigDecimal;
import java.util.List;

public class Pricer {
    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    BigDecimal executeStrategy(List<LineItem> lineItems) {
        return strategy.apply(lineItems).stream()
                .map(LineItem::getDiscountedPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}