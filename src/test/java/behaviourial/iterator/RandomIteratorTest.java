package behaviourial.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomIteratorTest {

    @Test
    void hasNextReturnsFalseWithEmptyArray() {
        Integer[] arr = {};
        RandomIterator iterator = new RandomIterator(arr);

        boolean expected = false;
        boolean actual = iterator.hasNext();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canIterateOverNonEmptyArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        RandomIterator iterator = new RandomIterator(arr);

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
        RandomIterator iterator = new RandomIterator(arr);

        while (iterator.hasNext()) {
            iterator.next();
        }

        boolean expected = false;
        boolean actual = iterator.hasNext();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void iteratorDoesNotIterateInOrder() {
        Integer[] arr = {1, 2, 3, 4, 5};
        RandomIterator iterator = new RandomIterator(arr);
        List<Integer> iteratedValues = new ArrayList<>();
        List<Integer> inOrderValues = List.of(1, 2, 3, 4, 5);

        while (iterator.hasNext()) {
            iteratedValues.add(iterator.next());
        }

        assertThat(iteratedValues).isNotEqualTo(inOrderValues);
    }
}
