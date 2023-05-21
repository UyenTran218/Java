package S4;

import java.util.*;

public class MergeSort {

    private static int[] TEST1_NUMS1 = { 5, 1, 6, 2, 3, 4 };
    private static int[] TEST1_EXPECTED_RESULT = { 1, 2, 3, 4, 5, 6 };

    MergeSort () {

    }

    public void mergeSort(int[] a) {
        if (a.length < 2) {
            return;
        }

        int mid_index = a.length / 2 ; // O(log(n))

        int[] left_Array = Arrays.copyOfRange(a, 0, mid_index);
        int[] right_Array = Arrays.copyOfRange(a, mid_index, a.length);
        System.out.println(Arrays.toString(left_Array));
        System.out.println(Arrays.toString(right_Array));
        mergeSort(left_Array); 
        mergeSort(right_Array); // --> O(lg(n))
        merge(a, left_Array, right_Array); // O(n)
    }

    private void merge (int[] a, int[] l, int[] r) 
    {
        int i = 0;
        int j = 0;
        int merged_index = 0;

        while(i<l.length && j<r.length){
            if(l[i] < r[j]){
                a[merged_index] = l[i];
                i++;
            }else {
                a[merged_index] = r[j];
                j++;
            }
            merged_index++;
        }
        while(i<l.length){
            a[merged_index] = l[i];
            merged_index++;
            i++;
        }
        while(j < r.length){
            a[merged_index] = r[j];
            merged_index++;
            j++;
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
        mergeSort(TEST1_NUMS1);
        printTestResult(TEST1_NUMS1, TEST1_EXPECTED_RESULT);
        System.out.println("end of TestCase1.");
    }
    
    public static void main(String[] args) {


        MergeSort mergeSortObj  = new MergeSort();
        mergeSortObj.runTestCase1();
    }
}