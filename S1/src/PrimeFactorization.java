public class PrimeFactorization {
    public static void main(String[] args) {
        int input = 13;

        primeFactorization(input);
        
    }
    public static void primeFactorization(int input) {
        for(int i = 1; i <= input; i++){
            if(input%i==0){
                System.out.println(i);
            }
        }
    }
    
}
