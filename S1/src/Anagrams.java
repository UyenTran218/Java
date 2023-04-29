import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter string 1");
        String s1 = scanner.nextLine();
        System.out.println("Plz enter string 2");
        String s2 = scanner.nextLine();
        
       System.out.println(checkAnagrams(s1, s2));
       scanner.close();
       
    }
    public static boolean checkAnagrams(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
