package behaviourial.visitor;

public class EllipticalMachine implements SportsEquipment {
    private Resistance resistance;

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
        System.out.println("Elliptical machine resistance set to " + resistance);
    }

    public Resistance getResistance() {
        return resistance;
    }

    public enum Resistance {
        LOW, MEDIUM, HIGH
    }

    public void accept(SportsEquipmentVisitor visitor) {
        visitor.visit(this);
    }
}