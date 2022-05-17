package behaviourial.template_method;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TemplateMethodTest {
    @Test
    void canDanceSamba() {
        Dancer sambaDancer = new SambaDancer();
        String expected =
                "Stretching limbs..." + Dancer.CONCATENATOR + "Rhythmically shaking hips..." + Dancer.CONCATENATOR +
                        "Stretching limbs, doing yoga, doing " +
                        "breathing exercises...";
        String actual = sambaDancer.dailyRoutine();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canDanceTango() {
        Dancer tangoDancer = new TangoDancer();
        String expected = "Stretching limbs..." + Dancer.CONCATENATOR + "Acting super-disciplined, yet highly " +
                "sensual..." + Dancer.CONCATENATOR + "Stretching limbs, " +
                "doing yoga, doing breathing exercises...";
        String actual = tangoDancer.dailyRoutine();
        assertThat(actual).isEqualTo(expected);
    }
}
