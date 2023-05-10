/**
 * Ex2
 */
public class Ex2 {

    public static void main(String[] args) throws Exception {
        String input = "He is a very very good boy isn't he?";
        if(input.length() < 1 && input.length() > (4*Math.pow(10, 5))){
            System.out.println("Invalid input");
        }
        else{
            String[] tokens = input.replaceFirst("^\\W+", "").split("\\W+");
        
        System.out.println(tokens.length);
        for(String s : tokens){
            System.out.println(s);
        }

        
        }
        
    }
}