package yl.algorithms.recursivebinarysearch;

public class BinarySearch {

    public Integer intSearch(int[] array, int target) {
        return intSearch(array, 0, array.length - 1, target);
    }

    private Integer intSearch(int[] array, int low, int high, int target) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        if (array[mid] == target) {
            return mid;
        }

        return array[mid] > target ? intSearch(array, low, mid-1, target) : intSearch(array, mid+1, high, target);
    }
}
