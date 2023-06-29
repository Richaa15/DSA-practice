//This code ain't working currently.
import java.util.Scanner;

public class BitwiseOperator {
    public static String operator(String s) {
        char[] charArray = s.toCharArray();
        int r = 0;
        for (int i = 0; i < s.length()-2; i = i + 2) {
            char b = charArray[i + 1];
            if (b == 'A') {
                int r = Character.getNumericValue(charArray[i]) & Character.getNumericValue(charArray[i + 2]);
                charArray[i + 2] = (char) r;
            } else if (b == 'B') {
                int r = Character.getNumericValue(charArray[i]) | Character.getNumericValue(charArray[i + 2]);
                charArray[i + 2] = (char) r;
            } else if (b == 'C') {
                int r = Character.getNumericValue(charArray[i]) ^ Character.getNumericValue(charArray[i + 2]);
                charArray[i + 2] = (char) r;
            } else {
                System.out.println("Invalid Input.");
            }
             return r;
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.next();
        String res = operator(s);

        System.out.println("The result is " + res);
    }
}
