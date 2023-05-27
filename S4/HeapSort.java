package S4;

import java.util.*;

public class HeapSort {
    private static int[] TEST1_NUMS1 = { 1, 6, 2, 17, 4, 9, 3 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 6, 9, 17 };

    HeapSort() {
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * Build a heap structure in which root value is greater than all its children.
     * - n: total number of nodes which currently exist in the heap.
     * - i: index of the root node of the heap
     */
    private void heapify(int[] arr, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // if the left node has greater value, assign left node index as index of root
        if (left < n && arr[left] > arr[max]) {
            max = left;
        }
        if (right < n && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            // swap children with parent if it has greater value
            swap(arr, i, max);

            // repeat above steps on the sub-heap
            heapify(arr, n, max);
        }
    }

    /**
     * Sort the input array by looping through non leaf nodes
     * I.e. Non-leaf node is a node without children.
     */
    private void heapSort(int[] arr) {
        int n = arr.length;

        /** Iterate from the last non-leaf node.
         * In each iteration, build a heap structure (root node value is greater than the one of its children) for the current non-leaf node.
        */
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // if the last non-leaf node is at index of (n/2) -> its left child is at index of (n/2) * 2 + 1 = n + 1, which is invalid. So, the index of the last non-leaf node is (n/2-1).

        /** Move the current root (MAX) node to its correct location in the sorted part of the array.
         * Then, rebuild the heap over the rest of unsorted part of the array.
        */ 
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
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
        heapSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {

        HeapSort s = new HeapSort();
        s.runTestCase1();
    }
}
