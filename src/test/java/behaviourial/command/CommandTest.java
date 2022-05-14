package behaviourial.command;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CommandTest {

    @Test
    void additionWorksAsExpected() {
        Command<Integer> addition = new Addition(1, 2);
        int expected = 3;
        int actual = addition.execute();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void subtractionWorksAsExpected() {
        Command<Integer> subtraction = new Subtraction(1, 2);
        int expected = -1;
        int actual = subtraction.execute();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void multiplicationWorksAsExpected() {
        Command<Integer> multiplication = new Multiplication(3, 4);
        int expected = 12;
        int actual = multiplication.execute();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void divisionWorksAsExpected() {
        Command<Integer> division = new Division(8, 4);
        int expected = 2;
        int actual = division.execute();
        assertThat(actual).isEqualTo(expected);
    }
}
