package S4;

import java.util.*;

public class BucketSort {
    private static float[] TEST1_NUMS1 = { (float) 0.897, (float) 0.565, (float) 0.656, (float) 0.1234, (float) 0.665,
            (float) 0.3434 };
    private static float[] TEST1_EXPECTED_RESULT = { (float) 0.1234, (float) 0.3434, (float) 0.565, (float) 0.656,
            (float) 0.665, (float) 0.897 };

    BucketSort() {
    }

    private void bucketSort(float[] arr, int n) {
        Vector<Float>[] buckets = new Vector[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int) idx].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }

    }

    private void printTestResult(float[] actual, float[] expected) {

        System.out.println("actual: " + Arrays.toString(actual));
        System.out.println("expected: " + Arrays.toString(expected));
        boolean res = Arrays.equals(actual, expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {

        System.out.println("running TestCase1...");
        bucketSort(TEST1_NUMS1, TEST1_NUMS1.length);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        BucketSort s = new BucketSort();
        s.runTestCase1();
    }
}
