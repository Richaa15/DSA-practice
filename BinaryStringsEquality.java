import java.util.Scanner;

public class BinaryStringsEquality {

    public static boolean possibleRearrange(String str1, String str2) {
        int l = str1.length();

        int c = 0; 
        //loop will iterate over both strings to checkn if the characters at ith index are equal or not.
        for (int i = 0; i < l; i++) {
            if (str1.charAt(i) != str2.charAt(i)) { 
                c++;
            }
        }

        return c % 2 == 0; //if the difference is divisible by 2 the rearrangement is possible.
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first binary string: ");
        String str1 = sc.next();

        System.out.print("Enter the second binary string: ");
        String str2 = sc.next();

        if (possibleRearrange(str1, str2)) {
            System.out.println("Possible");
        } else {
            System.out.println("Not Possible");
        }
    }
}
