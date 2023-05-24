package S4;

import java.util.*;

public class BubbleSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 3, 4, 9 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6, 9 };

    BubbleSort() {
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j;

        for (i = 0; i < n - 1; i++) {

            for (j = i + 1; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp_num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp_num;
                }

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
        bubbleSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        BubbleSort s = new BubbleSort();
        s.runTestCase1();

    }

}