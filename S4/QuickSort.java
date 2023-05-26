package S4;

import java.util.*;

public class QuickSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 17, 4, 9, 3 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6, 9, 17 };

    QuickSort() {

    }

    public void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return (i + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private void printTestResult(int[] actual, int[] expected) {

        System.out.println("actual: " + Arrays.toString(actual));
        System.out.println("expected: " + Arrays.toString(expected));
        boolean res = Arrays.equals(actual, expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {
        int n = TEST1_NUMS1.length;
        System.out.println("running TestCase1...");
        quickSort(TEST1_NUMS1, 0, n - 1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {

        QuickSort s = new QuickSort();
        s.runTestCase1();
    }
}
