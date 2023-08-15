import java.util.*;
public class CamelCaseConversion {
    public static void main(String[] args) {
        String input = "isUpperCase";
        String output = convertCamelCase(input);
        System.out.println(output);
    }

    public static String convertCamelCase(String input) {
        StringBuilder currentWord = new StringBuilder();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                output.append(currentWord.toString()).append("\n");
                currentWord.setLength(0);
                currentWord.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                currentWord.append(Character.toUpperCase(c));
            } else {
                currentWord.append(c);
            }
        }
        output.append(currentWord.toString());

        return output.toString();
    }
}
