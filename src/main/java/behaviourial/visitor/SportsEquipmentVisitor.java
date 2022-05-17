package behaviourial.visitor;

public interface SportsEquipmentVisitor {
    void visit(AdjustableWeightBench equipment);
    void visit(EllipticalMachine equipment);
    void visit(Treadmill equipment);
}