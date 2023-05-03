public class FactorialCalculator {
    public static void main(String[] args) {
        int input = 10;

        factorialCalculator(input);
        
    }
    public static void factorialCalculator(int input) {
        int factorial = 1;
        for(int i = 1; i <= input; i ++){
            factorial = factorial*i;
            System.out.println(factorial + " " + i);
        }
        System.out.println(factorial);
    }
}
