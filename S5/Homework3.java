package S5;

public class Homework3 {
    private static int[] TEST1_ARRAY = { 12, 34, 67, 90 };
    private static int TEST1_EXPECTED_RESULT = 113;
    private static int[] TEST2_ARRAY = { 15, 17, 20 };
    private static int TEST2_EXPECTED_RESULT = 20;

    Homework3() {

    }

    /**
     * function to check if the current min time is feasible
     * 
     */
    boolean checkValidity(int[] arr, int k, int n, int maxtime) {
        int paintersRequired = 1;
        int currTotaltime = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] > maxtime) return false; 
            if(currTotaltime + arr[i] > maxtime) {
                paintersRequired ++;
                if(paintersRequired > k) return false;
            } else currTotaltime += arr[i]s
        }
        return true;

    }

    private int minTime(int[] arr, int n, int k) {
        //if number of painters is greater than number of boards
        if (k > n) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        //search space
        int start = arr[n - 1];
        int end = sum;

        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (checkValidity(arr, k, n, mid)) {
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
        int res = minTime(TEST1_ARRAY, TEST1_ARRAY.length, 2);
        printTestResult(TEST1_EXPECTED_RESULT, res);
        System.out.println("end of TestCase1.");
    }

    private void runTestCase2() {
        System.out.println("running TestCase2...");
        int res = minTime(TEST2_ARRAY, TEST2_ARRAY.length, 3);
        printTestResult(TEST2_EXPECTED_RESULT, res);
        System.out.println("end of TestCase2.");
    }

    public static void main(String[] args) {
        Homework3 s = new Homework3();
        s.runTestCase1();
        s.runTestCase2();

    }
}
