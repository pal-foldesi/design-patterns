package behaviourial.visitor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VisitorTest {

    @Test
    void canTestTreadmills() {
        Treadmill treadmill = new Treadmill();
        SportsEquipmentVisitor visitor = new TreadmillVisitor();
        treadmill.accept(visitor);

        boolean expectedPoweredOn = false;
        boolean actualPoweredOn = treadmill.isPoweredOn();

        assertThat(actualPoweredOn).isEqualTo(expectedPoweredOn);
    }

    @Test
    void canTestEllipticalMachines() {
        EllipticalMachine elliptical = new EllipticalMachine();
        SportsEquipmentVisitor visitor = new EllipticalMachineVisitor();
        elliptical.accept(visitor);

        EllipticalMachine.Resistance expectedResistance = EllipticalMachine.Resistance.HIGH;
        EllipticalMachine.Resistance actualResistance = elliptical.getResistance();

        assertThat(actualResistance).isEqualTo(expectedResistance);
    }

    @Test
    void canTestWeightBenches() {
        AdjustableWeightBench bench = new AdjustableWeightBench();
        SportsEquipmentVisitor visitor = new WeightBenchVisitor();
        bench.accept(visitor);

        int expectedDegrees = 90;
        int actualDegrees = bench.getAdjustedDegrees();

        assertThat(actualDegrees).isEqualTo(expectedDegrees);
    }
}
