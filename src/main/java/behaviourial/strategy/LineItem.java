package behaviourial.strategy;

import java.math.BigDecimal;

public class LineItem {
    public BigDecimal getListPrice() {
        return listPrice;
    }

    private final BigDecimal listPrice;
    private BigDecimal discountedPrice;

    public LineItem(BigDecimal listPrice) {
        this.listPrice = listPrice;
        this.discountedPrice = listPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }
}
