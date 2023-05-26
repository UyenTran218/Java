package S4;

import java.util.*;

public class InsertionSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 17, 4, 9, 3 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6, 9, 17 };

    InsertionSort() {

    }

    public void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++)
        {
            int curr_num = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > curr_num){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = curr_num;
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
        insertionSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        s.runTestCase1();
    }
}
