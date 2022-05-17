package behaviourial.strategy;

import java.math.BigDecimal;
import java.util.List;

public class EveryNthFree implements PricingStrategy {
    private final int freeN;

    public EveryNthFree(int freeN) {
        this.freeN = freeN;
    }

    @Override
    public List<LineItem> apply(List<LineItem> lineItems) {
        for (int i = 1; i < lineItems.size() + 1; i++) {
            if (i == freeN) {
                lineItems.get(i - 1).setDiscountedPrice(BigDecimal.ZERO);
            }
        }
        return lineItems;
    }
}
