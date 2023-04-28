import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Plz enter words");
        String words = s.nextLine();
        String[] sw = words.split(" ");
        System.out.println("Plz enter n");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Word at " + n+"th position is: "+sw[n-1]);
        s.close();
    }
}
