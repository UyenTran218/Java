/**
 * Palindrome
 */
public class Palindrome {
    public static void main(String[] args) throws Exception {
    String number = System.console().readLine();
    StringBuffer s = new StringBuffer(number);
    if(number.equals(s.reverse().toString())){
        System.out.println("This is palindrome number");
    }
        else
        System.out.println("This is not palindrome number");
    }
}