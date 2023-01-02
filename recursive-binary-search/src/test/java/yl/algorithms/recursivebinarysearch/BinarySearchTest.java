package yl.algorithms.recursivebinarysearch;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final BinarySearch testInstance = new BinarySearch();

    @Test
    public void search() {
        assertEquals(33, testInstance.intSearch(initArray(100), 33));
        assertEquals(65, testInstance.intSearch(initArray(100), 65));
        assertEquals(0, testInstance.intSearch(initArray(100), 0));
        assertEquals(99, testInstance.intSearch(initArray(100), 99));
        assertEquals(50, testInstance.intSearch(initArray(100), 50));
        assertNull(testInstance.intSearch(initArray(100), -1));
        assertNull(testInstance.intSearch(initArray(100), 100));

        assertEquals(7, testInstance.intSearch(initArray(10), 7));
        assertEquals(2, testInstance.intSearch(initArray(10), 2));
        assertEquals(0, testInstance.intSearch(initArray(10), 0));
        assertEquals(9, testInstance.intSearch(initArray(10), 9));
        assertEquals(5, testInstance.intSearch(initArray(10), 5));
        assertNull(testInstance.intSearch(initArray(10), -1));
        assertNull(testInstance.intSearch(initArray(10), 10));

        assertEquals(566666, testInstance.intSearch(initArray(1000000), 566666));
        assertEquals(23454, testInstance.intSearch(initArray(1000000), 23454));
        assertEquals(999999, testInstance.intSearch(initArray(1000000), 999999));
        assertEquals(0, testInstance.intSearch(initArray(1000000), 0));
        assertEquals(500000, testInstance.intSearch(initArray(1000000), 500000));
        assertNull(testInstance.intSearch(initArray(1000000), -1));
        assertNull(testInstance.intSearch(initArray(1000000), 1000000));

        assertEquals(65, testInstance.intSearch(initArray(77), 65));
        assertEquals(23, testInstance.intSearch(initArray(77), 23));
        assertEquals(76, testInstance.intSearch(initArray(77), 76));
        assertEquals(0, testInstance.intSearch(initArray(77), 0));
        assertEquals(38, testInstance.intSearch(initArray(77), 38));
        assertNull(testInstance.intSearch(initArray(77), -1));
        assertNull(testInstance.intSearch(initArray(77), 77));
    }

    private int[] initArray(int size) {
        return IntStream.range(0, size).toArray();
    }
}