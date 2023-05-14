import java.util.*;

public class StringDecode {
    public static void main(String[] args) {
        StringDecode stringDecoder = new StringDecode();

        String input1 = "Smith000James01345";
        String input2 = "John000Doe000123";
        String input3 = "kevin0smith004331";
        String input4 = "Thomas00LEE0000043";

        stringDecoder.parseCode(input1);
        stringDecoder.parseCode(input2);
        stringDecoder.parseCode(input3);
        stringDecoder.parseCode(input4);
    }

    public void parseCode(String input) {
        List<String> output = new ArrayList<String>();
        Scanner inputScanner = new Scanner(input);
        inputScanner.useDelimiter("0");
        while (inputScanner.hasNext()) {
            String part = inputScanner.next();
            if (!part.equals("")) {
                output.add(part);
            }
        }
        System.out.println("First name: " + output.get(0));
        System.out.println("Last name: " + output.get(1));
        System.out.println("Id: " + output.get(2));

        inputScanner.close();
    }
}
