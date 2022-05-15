package behaviourial.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomIterator implements Iterator<Integer> {
    private final Integer[] iteratee;
    List<Integer> indices;

    RandomIterator(Integer[] iteratee) {
        this.iteratee = iteratee;
        indices =
                IntStream.range(0, iteratee.length)
                        .boxed()
                        .collect(Collectors.toList());
        Collections.shuffle(indices);
    }

    @Override
    public boolean hasNext() {
        return !indices.isEmpty();
    }

    @Override
    public Integer next() {
        if (indices.isEmpty()) {
            throw new NoSuchElementException();
        }
        int nextIndex = indices.remove(indices.size() - 1);
        return iteratee[nextIndex];
    }
}
