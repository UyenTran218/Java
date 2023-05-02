import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your number");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
            if(checkArmstrongNumber(i)==true){
                System.out.println(i);
            }
        }
        //checkArmstrongNumber(n);
        scanner.close();
    }
    public static boolean checkArmstrongNumber(int n) {
        int count = 0;
        int input = n;
        Integer[] numbers = new Integer[]{};
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(numbers));
        
        while(n>0){
            int digit = n%10;
            n=n/10;
            arrlist.add(digit);
            count++;
        }
        numbers = arrlist.toArray(numbers);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)Math.pow(numbers[i], count);
        }
        int sum = Arrays.stream(numbers).mapToInt(Integer::intValue).sum();
        if(sum == input){
            //System.out.println(input + " is an Armstrong number which has number of digits of " + count);
            return true;
        }
        else{
            //System.out.println( input + " is not an Armstrong number ");
            return false;
        }
    }
}
