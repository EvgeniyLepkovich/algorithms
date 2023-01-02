import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;
import java.util.stream.IntStream;

public class QuickSort {
    public int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int refItemPos = new Random().nextInt(array.length);
        return combineArrays(sort(getLeftArray(array, refItemPos)), array[refItemPos], sort(getRightArray(array, refItemPos)));
    }

    private int[] combineArrays(int[] leftArray, int refItem, int[] rightArray) {
        return ArrayUtils.addAll(ArrayUtils.add(leftArray, refItem), rightArray);
    }

    private int[] getRightArray(int[] array, int refItemPos) {
        return IntStream.range(0, array.length)
                .filter(i -> i != refItemPos)
                .filter(i -> array[i] > array[refItemPos])
                .map(i -> array[i])
                .toArray();
    }

    private int[] getLeftArray(int[] array, int refItemPos) {
        return IntStream.range(0, array.length)
                .filter(i -> i != refItemPos)
                .filter(i -> array[i] <= array[refItemPos])
                .map(i -> array[i])
                .toArray();
    }
}
