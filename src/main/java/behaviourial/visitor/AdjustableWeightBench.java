package behaviourial.visitor;

public class AdjustableWeightBench implements SportsEquipment {
    private int adjustedDegrees;

    public int getAdjustedDegrees() {
        return adjustedDegrees;
    }

    public void adjust(int degrees) {
        if (degrees >= 0 && degrees <= 90) {
            this.adjustedDegrees = degrees;
            System.out.println("Bench adjusted to " + adjustedDegrees +" degrees");
        } else {
            throw new IllegalArgumentException("Invalid degrees: " + degrees);
        }
    }

    public void accept(SportsEquipmentVisitor visitor) {
        visitor.visit(this);
    }
}
