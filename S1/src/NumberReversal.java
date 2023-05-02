import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your number");
        String s = scanner.nextLine();    
            reverseNumbers(s);
        scanner.close();
    }
    public static void reverseNumbers(String s){
        StringBuffer sb = new StringBuffer(s);
        
        if(sb.toString().contains(".")){
            
            int index = sb.toString().indexOf(".");
            sb.deleteCharAt(index);
            sb.reverse();
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            for(int i = index-1; i >=0; i--){
                sb1.append(sb.toString().charAt(i)); 
            }
            for(int i = sb.toString().length()-1; i >=index; i--){
                sb2.append(sb.toString().charAt(i)); 
            }
            System.out.println(sb1.reverse() + "." + sb2.reverse());
        }
        else {
             
            StringBuffer result = sb.reverse();
            System.out.println(result);
        }
        
            
    }
   
}
