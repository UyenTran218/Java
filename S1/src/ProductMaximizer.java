import java.util.Arrays;

public class ProductMaximizer {
    public static void main(String[] args) {
        int[] n1 = new int[]{8,9,6,5,6};
        int[] n2 = new int[]{8,9,6,5,6};
        System.out.println(productMax(n1,n2));
        
    }
    public static int productMax(int[] n1, int[] n2) {
        int maxProduct = 0;
        Arrays.sort(n1, 0, n1.length);
        Arrays.sort(n2, 0, n2.length);
        maxProduct = n1[n1.length-1] + n2[n2.length-1];
        
        return maxProduct;
    }
}
