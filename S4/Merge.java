package S4;

import java.util.*;

public class Merge {

    private static int[] TEST1_NUMS1 = {1, 2, 3, 0, 0, 0};
    private static int[] TEST1_NUMS2 = {2, 5, 6};
    private static int[] TEST1_EXPECTED_RESULT = {1, 2, 2, 3, 5, 6};
    private static int TEST1_M = 3;
    private static int TEST1_N = 3;

    private static int[] TEST2_NUMS1 = {1};
    private static int[] TEST2_NUMS2 = {};
    private static int[] TEST2_EXPECTED_RESULT = {1};
    private static int TEST2_M = 1;
    private static int TEST2_N = 0;

    private static int[] TEST3_NUMS1 = {0};
    private static int[] TEST3_NUMS2 = {1};
    private static int[] TEST3_EXPECTED_RESULT = {1};
    private static int TEST3_M = 0;
    private static int TEST3_N = 1;

    private void printTestResult(int[] a, int[] b) {

        boolean res = Arrays.equals(a, b);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {
        
        doMerge(TEST1_NUMS1, TEST1_M, TEST1_NUMS2, TEST1_N);
        System.out.println(Arrays.toString(TEST1_NUMS1));

        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
    }

    private void runTestCase2() {
        
        doMerge(TEST2_NUMS1, TEST2_M, TEST2_NUMS2, TEST2_N);
        System.out.println(Arrays.toString(TEST2_NUMS1));
        printTestResult(TEST2_NUMS1, TEST2_EXPECTED_RESULT);
    }

    private void runTestCase3() {
        
        doMerge(TEST3_NUMS1, TEST3_M, TEST3_NUMS2, TEST3_N);
        System.out.println(Arrays.toString(TEST3_NUMS1));
        printTestResult(TEST3_NUMS1, TEST3_EXPECTED_RESULT);
    }
    

    Merge() {
        // do nothing.
    }
    
    private void doMerge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        int[] nums1_tmp = Arrays.copyOf(nums1, m); 
        int merged_index = 0;
        
        while(i < m && j < n){
            if(nums1_tmp[i] <= nums2[j]){
                nums1[merged_index] = nums1_tmp[i];
                i++;
            } else {
                nums1[merged_index] = nums2[j];
                j++;
            }
            merged_index++;
        }
        while(i < m){
            nums1[merged_index] = nums1_tmp[i];
            merged_index++;
            i++; 
        }
        while(j < n){
            nums1[merged_index] = nums2[j];
            merged_index++;
            j++;
        }

    }

    public static void main(String[] args) {
        // TODO

        Merge mergeObj = new Merge();

        mergeObj.runTestCase1();
        mergeObj.runTestCase2();
        mergeObj.runTestCase3();
    }
};