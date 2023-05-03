public class PrimeNumberChecker {
    public static void main(String[] args) {
        int input = 11;
        int[] numbers = new int[]{2,4,7,8,13,18,15,19};
        System.out.println(primeNumChecker(input));
        for(int i = 0; i < numbers.length; i++){
            if(primeNumChecker(numbers[i])==true && numbers[i]>2){
                System.out.print(numbers[i]+" ");
            }
        }
        
    }
    public static boolean primeNumChecker(int n) {
        if( n <= 1){
            return false;
        }
        for(int i = 2; i < n; i ++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
