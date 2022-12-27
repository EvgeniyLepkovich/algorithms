package yl.algorithms.binarysearch;

public class BinarySearch {

    public Integer intSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            low = arr[mid] > target ? low : mid + 1;
            high = arr[mid] > target ? mid - 1: high;
        }
        return null;
    }
}
