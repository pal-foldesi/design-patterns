package creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CupOfTeaTest {

    @Test
    void canBuildCupOfTea() {
        String teaType = "Earl Grey";
        CupOfTea cup = new CupOfTea.Builder(teaType).withHoney(true).withLemon(true).build();
        assertThat(cup.getTeaType()).isEqualTo(teaType);
        assertThat(cup.isHoney()).isTrue();
        assertThat(cup.isLemon()).isTrue();
        assertThat(cup.isNutraSweet()).isFalse();
        assertThat(cup.isSugar()).isFalse();
        assertThat(cup.isStevia()).isFalse();
    }
}
