import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();
        int[] input1 = { 3, 6, 9, 1, 14, 20 };
        int[] input2 = { 100 };
        hw.calculateMax(input1);
        hw.calculateMax(input2);
    }

    public void calculateMax(int[] input) {
        int max = 0;
        Arrays.sort(input);
        if (input.length < 2) {
            System.out.println(0);
        } else {
            for (int i = 0; i < input.length - 1; i++) {
                int tmp_Max = Math.abs(input[i] - input[i + 1]);
                if (tmp_Max > max) {
                    max = tmp_Max;
                }
            }
            System.out.println(max);
        }

    }
}
