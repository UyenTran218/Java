package S6;

import java.util.*;

/**
 * Homework1
 */
public class Homework1 {

    private static int[] TEST1_ARRAY = { 1, 2, 1, 3, 4, 2, 3 };

    Homework1() {

    }

    private void countDistinct(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < k; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hm.size());

        for (int i = k; i < arr.length; i++) {
            if (hm.get(arr[i - k]) == 1) {
                hm.remove(arr[i - k]);
            } else {
                hm.put(arr[i], hm.getOrDefault(arr[i - k], 0) - 1);
            }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

            System.out.println(hm.size());
        }

    }

    public static void main(String[] args) {
        Homework1 s = new Homework1();
        s.countDistinct(TEST1_ARRAY, 4);

    }

}