package behaviourial.visitor;

public class Treadmill implements SportsEquipment {
    private boolean poweredOn;

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public void powerOn() {
        this.poweredOn = true;
        System.out.println("Treadmill powered on");
    }

    public void powerOff() {
        this.poweredOn = false;
        System.out.println("Treadmill powered off");
    }

    public void accept(SportsEquipmentVisitor visitor) {
        visitor.visit(this);
    }
}