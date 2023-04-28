public class CompareNumber {
    public static void main(String[] args) throws Exception {
        int input = Integer.parseInt(System.console().readLine());
        if(input >= 0 && input <= 100){
            if(input%2 != 0){
                System.out.println("Weird");
            }
            else {
                if(input >= 2 && input <= 5 || input >= 20){
                    System.out.println("Not weird");
                }
                if(input >= 6 && input < 20){
                    System.out.println("Weird");
                }
            }
        }
        }
}
