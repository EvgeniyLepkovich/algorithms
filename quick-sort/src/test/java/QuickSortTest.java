import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private final QuickSort testInstance = new QuickSort();

    @Test
    public void sort() {
        assertArrayEquals(IntStream.of(1, 2, 3, 4, 4, 5).toArray(), testInstance.sort(IntStream.of(5, 4, 4, 3, 2, 1).toArray()));
        assertArrayEquals(IntStream.of(1, 2, 3, 4, 4, 5).toArray(), testInstance.sort(IntStream.of(3, 5, 2, 4, 4, 1).toArray()));
        assertArrayEquals(IntStream.of(1, 2, 3, 4, 4, 5, 6, 7, 8).toArray(), testInstance.sort(IntStream.of(3, 5, 2, 4, 6, 1, 4, 8, 7).toArray()));
    }

}