package behaviourial.visitor;

public class WeightBenchVisitor implements SportsEquipmentVisitor {

    @Override
    public void visit(AdjustableWeightBench bench) {
        for (int i = 0; i <= 90; i++) {
            bench.adjust(i);
        }
    }

    @Override
    public void visit(EllipticalMachine elliptical) {
        // left out on purpose
    }

    @Override
    public void visit(Treadmill treadmill) {
        // left out on purpose
    }
}
