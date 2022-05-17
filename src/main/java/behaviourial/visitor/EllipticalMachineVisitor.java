package behaviourial.visitor;

public class EllipticalMachineVisitor implements SportsEquipmentVisitor {

    @Override
    public void visit(AdjustableWeightBench equipment) {
        // left out on purpose
    }

    @Override
    public void visit(EllipticalMachine elliptical) {
        elliptical.setResistance(EllipticalMachine.Resistance.LOW);
        elliptical.setResistance(EllipticalMachine.Resistance.MEDIUM);
        elliptical.setResistance(EllipticalMachine.Resistance.HIGH);
    }

    @Override
    public void visit(Treadmill treadmill) {
        // left out on purpose
    }
}
