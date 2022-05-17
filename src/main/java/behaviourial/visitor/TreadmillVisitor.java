package behaviourial.visitor;

public class TreadmillVisitor implements SportsEquipmentVisitor {

    @Override
    public void visit(AdjustableWeightBench equipment) {
        // left out on purpose
    }

    @Override
    public void visit(EllipticalMachine equipment) {
        // left out on purpose
    }

    @Override
    public void visit(Treadmill treadmill) {
        treadmill.powerOn();
        treadmill.powerOff();
    }
}
