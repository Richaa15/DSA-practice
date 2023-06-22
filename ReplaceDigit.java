//Replace digit with 9-digit

import java.util.Scanner;

public class ReplaceDigit {
    public static int replaceDigits(int a) {
        int res = 0;
        int m = 1;

        while (a > 0) {
            int i = a % 10;
            int replacedDigit = 9 - i;

            res += replacedDigit * m;
            m *= 10;

            a /= 10;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int replacedNumber = replaceDigits(a);

        System.out.println("New number: " + replacedNumber);
    }
}
