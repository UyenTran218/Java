package S5;

import java.util.Arrays;

public class Homework2 {
    private static int[] TEST1_ARRAY = { 12, 67, 90, 34, 18 };

    private static int TEST1_EXPECTED_RESULT = 18;

    Homework2() {

    }

    private int countElementsLessThanMid(int[] arr, int mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
            }
        }
        return count;

    }

    private int findKthSmallest(int[] arr, int l, int r, int k) {
        if (k > arr.length) {
            return -1;
        }
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }

        while (low < high) {
            int mid = (high + low) / 2;
            if (countElementsLessThanMid(arr, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;

    }

    private void printTestResult(int actual, int expected) {
        System.out.println("actual: " + actual);
        System.out.println("expected: " + expected);
        boolean res = (actual == expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {
        System.out.println("running TestCase1...");
        int res = findKthSmallest(TEST1_ARRAY, 0, TEST1_ARRAY.length - 1, 2);
        printTestResult(TEST1_EXPECTED_RESULT, res);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        Homework2 s = new Homework2();
        s.runTestCase1();

    }
}
