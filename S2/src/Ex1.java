/**
 * Ex1
 */
public class Ex1 {

    public static void main(String[] args) throws Exception {
        String input = "abcabcxvhjj";
        
        int[] arr = new int[26];

        for(int i = 0; i < input.length(); i++){
            //add count values into arr array after calculating the index numbers of characters
            char c = input.charAt(i);
            int arrayIndex = c - 'a';
            arr[arrayIndex]++;
          
        }
        //loop through all alphabet characters and print the values that greater than 0
        for (int i = 0; i < arr.length; i++){
            if(arr[i]!=0){
                System.out.println((char)(i + (int)('a')) + " " + arr[i]);
            }
                
            
        }
    }
    
    
}