package behaviourial.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StandardIterator implements Iterator<Integer> {
    private final Integer[] iteratee;
    private int index = 0;

    StandardIterator(Integer[] iteratee) {
        this.iteratee = iteratee;
    }

    @Override
    public boolean hasNext() {
        return index < iteratee.length;
    }

    @Override
    public Integer next() {
        if (index > iteratee.length - 1) {
            throw new NoSuchElementException();
        }
        int oldIndex = index;
        index++;
        return iteratee[oldIndex];
    }
}
