import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter string");
        String words = scanner.nextLine().toLowerCase();
        String[] sw = words.split(" ");
        System.out.println("Plz enter search word");
        String word = scanner.nextLine().toLowerCase();
        
       System.out.println(checkFirstWord(sw, word));
       scanner.close();
       
    }
    public static int checkFirstWord(String[] sw, String word){
        int count = 0;
        for(String v:sw){
            if(v.contains(word)){
                count += 1;
            }
        }
        return count;         
        
    }
}
