package behaviourial.strategy;

import java.math.BigDecimal;
import java.util.List;

public class PercentageOff implements PricingStrategy {
    private final BigDecimal percentage;

    public PercentageOff(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public List<LineItem> apply(List<LineItem> lineItems) {
        lineItems.forEach(lineItem -> lineItem.setDiscountedPrice(lineItem.getListPrice().multiply(BigDecimal.ONE.subtract(percentage))));
        return lineItems;
    }
}
