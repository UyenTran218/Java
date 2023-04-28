/**
 * WordReversal
 */
public class WordReversal {
public static void main(String[] args) throws Exception{
    
    for (int i = args.length - 1; i >= 0; i--){
        if(i == args.length-1){
            args[i] = args[i].substring(0, 1).toUpperCase()+args[i].substring(1);
        }
         System.out.print(args[i] + " ");
    }
}
}