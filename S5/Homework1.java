package S5;

public class Homework1 {
    private static int[] TEST1_ARRAY = { 12, 34, 67, 90 };

    private static int TEST1_EXPECTED_RESULT = 113;

    Homework1() {

    }

    private int findPages(int n, int m, int[] arr) {

    }

    private void printTestResult(int actual, int expected) {
        System.out.println("actual: " + actual);
        System.out.println("expected: " + expected);
        boolean res = (actual == expected);
        System.out.println((res) ? "Success" : "Failed");
    }

    private void runTestCase1() {
        System.out.println("running TestCase1...");
        int res = findPages(TEST1_ARRAY.length, 2, TEST1_ARRAY);
        printTestResult(TEST1_EXPECTED_RESULT, res);
        System.out.println("end of TestCase1.");
    }

    public static void main(String[] args) {
        Homework1 s = new Homework1();
        s.runTestCase1();

    }
}