import java.util.*;
public class CountToAlphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Expression: ");
        String input = sc.next();
        String output = expandString(input);
        System.out.println(output);
    }
    
    //Method that will return expanded string
    public static String expandString(String input) {
        StringBuilder outputBuilder = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;

            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0'); //count will keep track of numeric value.
                i++;
            }

            for (int j = 0; j < count; j++) {
                outputBuilder.append(ch);
            }
        }

        return outputBuilder.toString();
    }
}
