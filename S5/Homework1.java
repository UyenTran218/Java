package S5;

public class Homework1 {
    private static int[] TEST1_ARRAY = { 12, 34, 67, 90 };
    private static int TEST1_EXPECTED_RESULT = 113;
    private static int[] TEST2_ARRAY = { 15, 17, 20 };
    private static int TEST2_EXPECTED_RESULT = 20;

    Homework1() {

    }

    /**
     * function to check if the current min number of pages is feasible
     * 
     */
    boolean checkValidity(int[] pages, int m, int n, int curr_min) {
        int studentsRequired = 1;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += pages[i];
            if (curr_sum > curr_min) {
                studentsRequired += 1;
            }
        }
        return studentsRequired <= m;

    }

    private int findPages(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int start = arr[n - 1];
        int end = sum;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (checkValidity(arr, m, n, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private void printTestResult(int actual, int expected) {
        System.out.println("actual: " + actual);
        System.out.println("expected: " + expected);
        boolean res = (actual == expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {
        System.out.println("running TestCase1...");
        int res = findPages(TEST1_ARRAY, TEST1_ARRAY.length, 2);
        printTestResult(TEST1_EXPECTED_RESULT, res);
        System.out.println("end of TestCase1.");
    }

    private void runTestCase2() {
        System.out.println("running TestCase2...");
        int res = findPages(TEST2_ARRAY, TEST2_ARRAY.length, 3);
        printTestResult(TEST2_EXPECTED_RESULT, res);
        System.out.println("end of TestCase2.");
    }

    public static void main(String[] args) {
        Homework1 s = new Homework1();
        s.runTestCase1();
        s.runTestCase2();

    }
}