import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter your sentence");
        String s1 = scanner.nextLine().toLowerCase();
        if(checkPangram(s1) && s1.length()==26){
            System.out.println("Perfect pangram");
        }else{
            System.out.println("Not a perfect pangram");
        }
        scanner.close();
    }

    public static boolean checkPangram(String c) {
        Boolean allCharPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!c.contains(String.valueOf(ch))) {
                allCharPresent = false;
            }
        }
        if (allCharPresent == true) {
            
            return true;
        } else {
            return false;
        }
    }
}
