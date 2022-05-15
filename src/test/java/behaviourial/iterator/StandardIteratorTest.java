package behaviourial.iterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StandardIteratorTest {

    @Test
    void hasNextReturnsFalseWithEmptyArray() {
        Integer[] arr = {};
        StandardIterator iterator = new StandardIterator(arr);

        boolean expected = false;
        boolean actual = iterator.hasNext();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canIterateOverNonEmptyArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        StandardIterator iterator = new StandardIterator(arr);

        int iterationCount = 0;

        while (iterator.hasNext()) {
            iterationCount++;
            iterator.next();
        }

        assertThat(iterationCount).isEqualTo(arr.length);
    }

    @Test
    void hasNextReturnsFalseWhenAtArrayEnd() {
        Integer[] arr = {1, 2, 3, 4, 5};
        StandardIterator iterator = new StandardIterator(arr);

        while (iterator.hasNext()) {
            iterator.next();
        }

        boolean expected = false;
        boolean actual = iterator.hasNext();

        assertThat(actual).isEqualTo(expected);
    }
}
