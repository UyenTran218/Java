package S4;

import java.util.*;

public class SelectionSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 3, 4 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6 };

    SelectionSort() {
    }

    public void selectionSort(int[] arr) {
        int n = arr.length;
        int i, j, min_index;

        for (i = 0; i < n - 1; i++) {
            min_index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_index]) {
                    min_index = j;
                }
                int tmp_num = arr[min_index];
                arr[min_index] = arr[j];
                arr[j] = tmp_num;
            }
        }

    }

    private void printTestResult(int[] actual, int[] expected) {

        System.out.println("actual: " + Arrays.toString(actual));
        System.out.println("expected: " + Arrays.toString(expected));
        boolean res = Arrays.equals(actual, expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {

        System.out.println("running TestCase1...");
        selectionSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        s.runTestCase1();

    }

}