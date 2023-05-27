package S5;

import java.util.*;

/**
 * BinarySearch
 */
public class BinarySearch {
    
    private static int[] TEST1_ARRAY = { 0, 1, 5, 17, 19, 20 };
    private static int TEST1_N = 17;
    private static int TEST1_EXPECTED_RESULT = 3;

    private static int[] TEST2_ARRAY = { 0, 1, 5, 17, 19, 20, 40, 190 };
    private static int TEST2_N = 11;
    private static int TEST2_EXPECTED_RESULT = -1;
    
    private void printTestResult(int actual, int expected) {
        System.out.println("actual: " + actual);
        System.out.println("expected: " + expected);
        boolean res = (actual == expected);
        System.out.println((res) ? "Success" : "Failed");
    }
    private void runTestCase1() {
        System.out.println("running TestCase1...");
        int res = binarySearch(TEST1_ARRAY, TEST1_N, 0, TEST1_ARRAY.length-1);
        printTestResult(TEST1_EXPECTED_RESULT, res);
        System.out.println("end of TestCase1.");
    }
     private void runTestCase2() {
        System.out.println("running TestCase2...");
        int res = binarySearch(TEST2_ARRAY, TEST2_N, 0, TEST2_ARRAY.length-1);
        printTestResult(TEST2_EXPECTED_RESULT, res);
        System.out.println("end of TestCase2.");
    }

    BinarySearch(){}

    private int binarySearch(int[] arr, int k, int start, int end){
        int k_index = -1;
        int mid_index = (start + end) / 2;
        // what if start == end ?
        if(start == end){
            if(arr[start] == k){
                return start;
            } else {
                return k_index;
            }
        }
        if(arr[mid_index] == k){
            return mid_index;
        } else if (arr[mid_index] > k){
            return binarySearch(arr, k, start, mid_index - 1);
        } else {
            return binarySearch(arr, k, mid_index + 1, end);
        } 
    }
    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        s.runTestCase1();
        s.runTestCase2();
    }
}