package S4;

import java.util.*;

public class InsertionSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 3, 4, 9 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6, 9 };

    InsertionSort() {

    }

    public void insertionSort(int[] arr) {

    }

    private void printTestResult(int[] actual, int[] expected) {

        System.out.println("actual: " + Arrays.toString(actual));
        System.out.println("expected: " + Arrays.toString(expected));
        boolean res = Arrays.equals(actual, expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {

        System.out.println("running TestCase1...");
        insertionSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        s.runTestCase1();
    }
}
