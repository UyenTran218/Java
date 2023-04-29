import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter words");
        String words = scanner.nextLine();
        String[] sw = words.split(" ");
       System.out.println(checkFirstWord(sw));
       scanner.close();
       
    }
    public static boolean checkFirstWord(String[] sw){
        
        if( sw[0].equalsIgnoreCase("hello") ){
            System.out.println(sw[0]);
            return true;
        }
        else {
            System.out.println(sw[0]);
        return false;
        }
        
    }
}
